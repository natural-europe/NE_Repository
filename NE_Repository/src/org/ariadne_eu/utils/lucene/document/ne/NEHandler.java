package org.ariadne_eu.utils.lucene.document.ne;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.apache.log4j.Logger;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.eun.lucene.core.indexer.document.DocumentHandler;
import org.eun.lucene.core.indexer.document.DocumentHandlerException;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

public class NEHandler extends DocumentHandler {

	/**
	 * @param args
	 */
	private static Logger log = Logger.getLogger(NEHandler.class);

	private Document doc;

	String content;
	String tmpValue;
	private Hashtable elements;
	private Hashtable attrs;
	private String contents;

	@Override
	public Document getDocument(InputStream is) throws DocumentHandlerException {
		// TODO Auto-generated method stub
		SAXParserFactory spf = SAXParserFactory.newInstance();

		try {
			SAXParser parser = spf.newSAXParser();

			parser.parse(is, this);
			return doc;
		} catch (IOException e) {
			log.error("getDocument: ", e);
			throw new DocumentHandlerException("Cannot parse XML document", e);
		} catch (ParserConfigurationException e) {
			log.error("getDocument: ", e);
			throw new DocumentHandlerException("Cannot parse XML document", e);
		} catch (SAXException e) {
			log.error("getDocument: ", e);
			throw new DocumentHandlerException("Cannot parse XML document", e);
		}

	}

	public void startDocument() {
		doc = new Document();
		contents = new String();
		elements = new Hashtable<>();
		attrs = new Hashtable<>();

	}

	public void endDocument() {
		doc.add(new Field("contents", contents, Field.Store.YES,
				Field.Index.ANALYZED));
		doc.add(new Field("lom.solr", "all", Field.Store.YES,
				Field.Index.NOT_ANALYZED,
				Field.TermVector.WITH_POSITIONS_OFFSETS));
	}

	public void startElement(String uri, String localName, String qName,
			Attributes atts) throws SAXException {

		checkMetadataSection(qName, atts);

	}

	public void setAttributeValues(Attributes atts, String fieldName) {
		if (atts != null && atts.getLength() != 0) {
			for (int i = 0; i < atts.getLength(); i++) {
				String name = atts.getQName(i);
				String data = atts.getValue(name);
				doc.add(new Field(fieldName + name, data, Field.Store.YES,
						Field.Index.NOT_ANALYZED));
			}
		}
	}

	public void checkMetadataSection(String qName, Attributes atts) {

		if (qName.equalsIgnoreCase("ne:scientificName")
				|| qName.equalsIgnoreCase("scientificName")) {

			String fieldName = "metadata.scientificName" + "@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:classification")
				|| qName.equalsIgnoreCase("classification")) {
			int i = getElementCounterAttrs(qName);
			String fieldName = "metadata.classification." + i + "@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:commonName")
				|| qName.equalsIgnoreCase("commonName")) {

			String fieldName = "metadata.commonName@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:title")
				|| qName.equalsIgnoreCase("title")) {

			String fieldName = "metadata.title@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:creator")
				|| qName.equalsIgnoreCase("creator")) {

			String fieldName = "metadata.creator@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:subject")
				|| qName.equalsIgnoreCase("subject")) {

			String fieldName = "metadata.subject@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:description")
				|| qName.equalsIgnoreCase("description")) {

			String fieldName = "metadata.description@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:contributor")
				|| qName.equalsIgnoreCase("contributor")) {

			String fieldName = "metadata.contributor@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:date") || qName.equalsIgnoreCase("date")) {

			String fieldName = "metadata.date@";
			setAttributeValues(atts, fieldName);

		}
		if (qName.equalsIgnoreCase("ne:type") || qName.equalsIgnoreCase("type")) {

			String fieldName = "metadata.type@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:format")
				|| qName.equalsIgnoreCase("format")) {

			String fieldName = "metadata.format@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:identifier")
				|| qName.equalsIgnoreCase("identifier")) {

			String fieldName = "metadata.identifier@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:source")
				|| qName.equalsIgnoreCase("source")) {

			String fieldName = "metadata.source@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:language")
				|| qName.equalsIgnoreCase("language")) {

			String fieldName = "metadata.language@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:relation")
				|| qName.equalsIgnoreCase("relation")) {

			String fieldName = "metadata.relation@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:rights")
				|| qName.equalsIgnoreCase("rights")) {

			String fieldName = "metadata.rights@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:alternative")
				|| qName.equalsIgnoreCase("alternative")) {

			String fieldName = "metadata.alternative@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:created")
				|| qName.equalsIgnoreCase("created")) {

			String fieldName = "metadata.created@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:extent")
				|| qName.equalsIgnoreCase("extent")) {

			String fieldName = "metadata.extent@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:medium")
				|| qName.equalsIgnoreCase("medium")) {

			String fieldName = "metadata.medium@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:isVersionOf")
				|| qName.equalsIgnoreCase("isVersionOf")) {

			String fieldName = "metadata.isVersionOf@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:hasVersion")
				|| qName.equalsIgnoreCase("hasVersion")) {

			String fieldName = "metadata.hasVersion@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:isReplacedBy")
				|| qName.equalsIgnoreCase("isReplacedBy")) {

			String fieldName = "metadata.isReplacedBy@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:replaces")
				|| qName.equalsIgnoreCase("replaces")) {

			String fieldName = "metadata.replaces@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:isRequiredBy")
				|| qName.equalsIgnoreCase("isRequiredBy")) {

			String fieldName = "metadata.isRequiredBy@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:requires")
				|| qName.equalsIgnoreCase("requires")) {

			String fieldName = "metadata.requires@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:isPartOf")
				|| qName.equalsIgnoreCase("isPartOf")) {

			String fieldName = "metadata.isPartOf@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:hasPart")
				|| qName.equalsIgnoreCase("hasPart")) {

			String fieldName = "metadata.hasPart@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:isReferencedBy")
				|| qName.equalsIgnoreCase("isReferencedBy")) {

			String fieldName = "metadata.isReferencedBy@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:references")
				|| qName.equalsIgnoreCase("references")) {

			String fieldName = "metadata.references@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:isFormatOf")
				|| qName.equalsIgnoreCase("isFormatOf")) {

			String fieldName = "metadata.isFormatOf@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:hasFormat")
				|| qName.equalsIgnoreCase("hasFormat")) {

			String fieldName = "metadata.hasFormat@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:conformsTo")
				|| qName.equalsIgnoreCase("conformasTo")) {

			String fieldName = "metadata.conformasTo@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:spatial")
				|| qName.equalsIgnoreCase("spatial")) {

			String fieldName = "metadata.spatial@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:temporal")
				|| qName.equalsIgnoreCase("temporal")) {

			String fieldName = "metadata.temporal@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:geolocation")
				|| qName.equalsIgnoreCase("geolocation")) {
			String fieldName = "metadata.geolocation@";
			setAttributeValues(atts, fieldName);
		}
	}

	public void checkMetadata(String qName) {

		doc.add(new Field("metadata." + qName, tmpValue, Field.Store.YES,
				Field.Index.NOT_ANALYZED));

	}

	public void checkHeader(String qName) {

		doc.add(new Field("header." + qName, tmpValue, Field.Store.YES,
				Field.Index.NOT_ANALYZED));

	}

	public void checkMetadataSection(String qName) {

		if (qName.equalsIgnoreCase("ne:provider")
				|| qName.equalsIgnoreCase("provider")) {

			doc.add(new Field("metadata.provider", tmpValue, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:dataProvider")
				|| qName.equalsIgnoreCase("dataProvider")) {

			doc.add(new Field("metadata.dataProvider", tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:objectUri")
				|| qName.equalsIgnoreCase("objectUri")) {

			doc.add(new Field("metadata.objectUri", tmpValue, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:contextUri")
				|| qName.equalsIgnoreCase("contextUri")) {
			// int i = getElementCounter(qName);
			doc.add(new Field("metadata.contextUri", tmpValue, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
		}

		if (qName.equalsIgnoreCase("ne:contentType")
				|| qName.equalsIgnoreCase("contentType")) {

			doc.add(new Field("metadata.contentType", tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:licenseUri")
				|| qName.equalsIgnoreCase("licenseUri")) {

			doc.add(new Field("metadata.licenseUri", tmpValue, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:thumbnailUri")
				|| qName.equalsIgnoreCase("thumbnailUri")) {

			doc.add(new Field("metadata.thumbnailUri", tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:scientificName")
				|| qName.equalsIgnoreCase("scientificName")) {

			doc.add(new Field("metadata.scientificName", tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:classification")
				|| qName.equalsIgnoreCase("classification")) {

			doc.add(new Field("metadata.classification", tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:commonName")
				|| qName.equalsIgnoreCase("commonName")) {

			doc.add(new Field("metadata.commonName", tmpValue, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:title")
				|| qName.equalsIgnoreCase("title")) {

			doc.add(new Field("metadata.title", tmpValue, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:creator")
				|| qName.equalsIgnoreCase("creator")) {

			doc.add(new Field("metadata.creator", tmpValue, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:subject")
				|| qName.equalsIgnoreCase("subject")) {

			doc.add(new Field("metadata.subject", tmpValue, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:description")
				|| qName.equalsIgnoreCase("description")) {

			doc.add(new Field("metadata.description", tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:contributor")
				|| qName.equalsIgnoreCase("contributor")) {

			doc.add(new Field("metadata.contributor", tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:date") || qName.equalsIgnoreCase("date")) {

			doc.add(new Field("metadata.date", tmpValue, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:type") || qName.equalsIgnoreCase("type")) {
			int i = getElementCounter(qName);
			doc.add(new Field("metadata.type", tmpValue, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:format")
				|| qName.equalsIgnoreCase("format")) {

			doc.add(new Field("metadata.format", tmpValue, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:identifier")
				|| qName.equalsIgnoreCase("identifier")) {

			doc.add(new Field("metadata.identifier", tmpValue, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:source")
				|| qName.equalsIgnoreCase("source")) {

			doc.add(new Field("metadata.source", tmpValue, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:language")
				|| qName.equalsIgnoreCase("language")) {

			doc.add(new Field("metadata.language", tmpValue, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:relation")
				|| qName.equalsIgnoreCase("relation")) {

			doc.add(new Field("metadata.relation", tmpValue, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:rights")
				|| qName.equalsIgnoreCase("rights")) {

			doc.add(new Field("metadata.rights", tmpValue, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:alternative")
				|| qName.equalsIgnoreCase("alternative")) {

			doc.add(new Field("metadata.alternative", tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:created")
				|| qName.equalsIgnoreCase("created")) {

			doc.add(new Field("metadata.created", tmpValue, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:extent")
				|| qName.equalsIgnoreCase("extent")) {

			doc.add(new Field("metadata.extent", tmpValue, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:medium")
				|| qName.equalsIgnoreCase("medium")) {

			doc.add(new Field("metadata.medium", tmpValue, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:isVersionOf")
				|| qName.equalsIgnoreCase("isVersionOf")) {

			doc.add(new Field("metadata.isVersionOf", tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:hasVersion")
				|| qName.equalsIgnoreCase("hasVersion")) {

			doc.add(new Field("metadata.hasVersion", tmpValue, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:isReplacedBy")
				|| qName.equalsIgnoreCase("isReplacedBy")) {

			doc.add(new Field("metadata.isReplacedBy", tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:replaces")
				|| qName.equalsIgnoreCase("replaces")) {

			doc.add(new Field("metadata.replaces", tmpValue, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:isRequiredBy")
				|| qName.equalsIgnoreCase("isRequiredBy")) {

			doc.add(new Field("metadata.isRequiredBy", tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:requires")
				|| qName.equalsIgnoreCase("requires")) {

			doc.add(new Field("metadata.requires", tmpValue, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:isPartOf")
				|| qName.equalsIgnoreCase("isPartOf")) {

			doc.add(new Field("metadata.isPartOf", tmpValue, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:hasPart")
				|| qName.equalsIgnoreCase("hasPart")) {

			doc.add(new Field("metadata.hasPart", tmpValue, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:isReferencedBy")
				|| qName.equalsIgnoreCase("isReferencedBy")) {

			doc.add(new Field("metadata.isReferencedBy", tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:references")
				|| qName.equalsIgnoreCase("references")) {

			doc.add(new Field("metadata.references", tmpValue, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:isFormatOf")
				|| qName.equalsIgnoreCase("isFormatOf")) {

			doc.add(new Field("metadata.isFormatOf", tmpValue, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:hasFormat")
				|| qName.equalsIgnoreCase("hasFormat")) {

			doc.add(new Field("metadata.hasFormat", tmpValue, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:conformsTo")
				|| qName.equalsIgnoreCase("conformasTo")) {

			doc.add(new Field("metadata.conformasTo", tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:spatial")
				|| qName.equalsIgnoreCase("spatial")) {

			doc.add(new Field("metadata.spatial", tmpValue, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:temporal")
				|| qName.equalsIgnoreCase("temporal")) {

			doc.add(new Field("metadata.temporal", tmpValue, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:geolocation")
				|| qName.equalsIgnoreCase("geolocation")) {
			doc.add(new Field("metadata.geolocation", tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}

	}

	public int getElementCounter(String qName) {
		int value = 0;
		if (elements.containsKey(qName)) {
			value = (int) elements.get(qName);
			value += 1;
			elements.put(qName, value);
			return value;
		} else {
			value = 1;
			elements.put(qName, value);
			return value;
		}
	}

	public int getElementCounterAttrs(String qName) {
		int value = 0;
		if (attrs.containsKey(qName)) {
			value = (int) attrs.get(qName);
			value += 1;
			attrs.put(qName, value);
			return value;
		} else {
			value = 1;
			attrs.put(qName, value);
			return value;
		}
	}

	public void checkHeaderSection(String qName) {

		if (qName.equalsIgnoreCase("ne:id") || qName.equalsIgnoreCase("id")) {

			doc.add(new Field("header.id", tmpValue, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:collectionId")
				|| qName.equalsIgnoreCase("collectionId")) {
			doc.add(new Field("header.collectionId", tmpValue, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
		}

		if (qName.equalsIgnoreCase("ne:createdOn")
				|| qName.equalsIgnoreCase("createdOn")) {

			doc.add(new Field("header.createdOn", tmpValue, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:createdBy")
				|| qName.equalsIgnoreCase("createdBy")) {
			doc.add(new Field("header.createdBy", tmpValue, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:lastModifiedOn")
				|| qName.equalsIgnoreCase("lastModifiedOn")) {
			doc.add(new Field("header.lastModifiedOn", tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:lastModifiedBy")
				|| qName.equalsIgnoreCase("lastModifiedBy")) {
			doc.add(new Field("header.lastModifiedBy", tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:deletedOn")
				|| qName.equalsIgnoreCase("deletedOn")) {
			doc.add(new Field("header.deletedOn", tmpValue, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
		}

		if (qName.equalsIgnoreCase("ne:deletedBy")
				|| qName.equalsIgnoreCase("deletedBy")) {
			doc.add(new Field("header.deletedBy", tmpValue, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:version")
				|| qName.equalsIgnoreCase("version")) {
			doc.add(new Field("header.version", tmpValue, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:status")
				|| qName.equalsIgnoreCase("status")) {

			doc.add(new Field("header.status", tmpValue, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:access")
				|| qName.equalsIgnoreCase("access")) {
			doc.add(new Field("header.access", tmpValue, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:validated")
				|| qName.equalsIgnoreCase("validated")) {
			doc.add(new Field("header.validated", tmpValue, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
		}

		if (qName.equalsIgnoreCase("ne:metadataLanguage")
				|| qName.equalsIgnoreCase("metadataLanguage")) {
			doc.add(new Field("header.metadataLanguages.language", tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:presentedToII")
				|| qName.equalsIgnoreCase("presentedToII")) {
			doc.add(new Field("header.presentedToII", tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:disseminatedToBiocase")
				|| qName.equalsIgnoreCase("disseminatedToBiocase")) {
			doc.add(new Field("header.disseminatedToBiocase", tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}

	}

	public void characters(char ch[], int start, int length) {

		tmpValue = new String(ch, start, length);
	}

	public void endElement(String uri, String localName, String qName)
			throws SAXException {

		checkHeaderSection(qName);
		checkMetadataSection(qName);
		// checkHeader(qName);
		// checkMetadata(qName);
	}

	public static void main(String[] args) throws FileNotFoundException,
			DocumentHandlerException {
		// TODO Auto-generated method stub
		NEHandler handler = new NEHandler();
		String filePath = "C:\\Users\\vogias\\git\\NE_Repo\\NE_Repository\\src\\org\\ariadne_eu\\utils\\lucene\\document\\ne\\kostas.xml";

		Document doc = handler.getDocument(new FileInputStream(new File(
				filePath)));

		List fields = doc.getFields();

		for (Iterator iterator = fields.iterator(); iterator.hasNext();) {
			Field field = (Field) iterator.next();
			System.out.println(field.name() + " :: " + field.stringValue());

		}

	}

}
