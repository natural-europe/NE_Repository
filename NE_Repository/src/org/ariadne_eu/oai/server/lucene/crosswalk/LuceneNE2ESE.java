package org.ariadne_eu.oai.server.lucene.crosswalk;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Properties;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.lucene.document.Document;
import org.ariadne_eu.utils.config.RepositoryConstants;
import org.oclc.oai.server.crosswalk.Crosswalk;
import org.oclc.oai.server.verb.CannotDisseminateFormatException;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

public class LuceneNE2ESE extends Crosswalk {

	protected String fullLomField = "";

	private String xsltPath="";
	public LuceneNE2ESE(Properties properties) {
		super(
				"http://www.europeana.eu/schemas/ese/ http://www.europeana.eu/schemas/ese/ESE-V3.4.xsd");
		String classname = "LuceneNE2ESE";
		fullLomField = properties
				.getProperty(RepositoryConstants.getInstance().OAICAT_SERVER_CATALOG_MDFIELD);
		if (fullLomField == null) {
			throw new IllegalArgumentException(
					RepositoryConstants.getInstance().OAICAT_SERVER_CATALOG_MDFIELD
							+ " is missing from the properties file");
		}
		xsltPath=RepositoryConstants.getInstance().OAICAT_SERVER_CATALOG_XSLT_PATH;
		if(xsltPath==null)
			throw new IllegalArgumentException(
					RepositoryConstants.getInstance().OAICAT_SERVER_CATALOG_XSLT_PATH
							+ " is missing from the properties file");
	}

	public String createMetadata(Object nativeItem)
			throws CannotDisseminateFormatException {
		// Cast the nativeItem to your object
		Document doc = (Document) nativeItem;
		String lom = "";

		if (doc.getField(fullLomField) != null)
			lom = doc.getField(fullLomField).stringValue();

		InputStream source = new ByteArrayInputStream(lom.getBytes());
		StreamSource src = new StreamSource(source);

		StreamSource xslt = new StreamSource(new File(
				xsltPath));

		TransformerFactory factory = TransformerFactory.newInstance();
		Transformer transformer;
		try {
			transformer = factory.newTransformer(xslt);

			StringWriter outWriter = new StringWriter();
			StreamResult result = new StreamResult(outWriter);

			transformer.transform(src, result);

			StringBuffer sb = outWriter.getBuffer();
			lom = sb.toString();

			return lom;
		} catch (TransformerException e) { // TODO Auto-generated
			e.printStackTrace();
			return lom;
		}
	}

	public boolean isAvailableFor(Object arg0) {
		return true;
	}

}
