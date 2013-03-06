package org.ariadne_eu.oai.server.lucene.crosswalk;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Properties;

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

public class LuceneNE2ESE extends Crosswalk {

	protected String fullLomField = "";

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
				"C:\\Users\\vogias\\workspace\\NE2ESE\\NE2ESE.xsl"));

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
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return lom;
		}

	}

	public boolean isAvailableFor(Object arg0) {
		return true;
	}

}
