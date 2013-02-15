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
		// content = new String();
		elements = new Hashtable<>();
		attrs = new Hashtable<>();

	}

	public void endDocument() {

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
			int i = getElementCounterAttrs(qName);
			String fieldName = "metadata.commonName." + i + "@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:title")
				|| qName.equalsIgnoreCase("title")) {
			int i = getElementCounterAttrs(qName);

			String fieldName = "metadata.title." + i + "@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:creator")
				|| qName.equalsIgnoreCase("creator")) {
			int i = getElementCounterAttrs(qName);
			String fieldName = "metadata.creator." + i + "@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:subject")
				|| qName.equalsIgnoreCase("subject")) {
			int i = getElementCounterAttrs(qName);
			String fieldName = "metadata.subject." + i + "@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:description")
				|| qName.equalsIgnoreCase("description")) {
			int i = getElementCounterAttrs(qName);
			String fieldName = "metadata.description." + i + "@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:contributor")
				|| qName.equalsIgnoreCase("contributor")) {
			int i = getElementCounterAttrs(qName);
			String fieldName = "metadata.contributor." + i + "@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:date") || qName.equalsIgnoreCase("date")) {
			int i = getElementCounterAttrs(qName);
			String fieldName = "metadata.date." + i + "@";
			setAttributeValues(atts, fieldName);

		}
		if (qName.equalsIgnoreCase("ne:type") || qName.equalsIgnoreCase("type")) {
			int i = getElementCounterAttrs(qName);
			String fieldName = "metadata.type." + i + "@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:format")
				|| qName.equalsIgnoreCase("format")) {
			int i = getElementCounterAttrs(qName);
			String fieldName = "metadata.format." + i + "@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:identifier")
				|| qName.equalsIgnoreCase("identifier")) {
			int i = getElementCounterAttrs(qName);
			String fieldName = "metadata.identifier." + i + "@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:source")
				|| qName.equalsIgnoreCase("source")) {
			int i = getElementCounterAttrs(qName);
			String fieldName = "metadata.source." + i + "@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:language")
				|| qName.equalsIgnoreCase("language")) {
			int i = getElementCounterAttrs(qName);
			String fieldName = "metadata.language." + i + "@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:relation")
				|| qName.equalsIgnoreCase("relation")) {
			int i = getElementCounterAttrs(qName);
			String fieldName = "metadata.relation." + i + "@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:rights")
				|| qName.equalsIgnoreCase("rights")) {
			int i = getElementCounterAttrs(qName);
			String fieldName = "metadata.rights." + i + "@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:alternative")
				|| qName.equalsIgnoreCase("alternative")) {
			int i = getElementCounterAttrs(qName);
			String fieldName = "metadata.alternative." + i + "@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:created")
				|| qName.equalsIgnoreCase("created")) {
			int i = getElementCounterAttrs(qName);
			String fieldName = "metadata.created." + i + "@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:extent")
				|| qName.equalsIgnoreCase("extent")) {
			int i = getElementCounterAttrs(qName);
			String fieldName = "metadata.extent." + i + "@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:medium")
				|| qName.equalsIgnoreCase("medium")) {
			int i = getElementCounterAttrs(qName);
			String fieldName = "metadata.medium." + i + "@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:isVersionOf")
				|| qName.equalsIgnoreCase("isVersionOf")) {
			int i = getElementCounterAttrs(qName);
			String fieldName = "metadata.isVersionOf." + i + "@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:hasVersion")
				|| qName.equalsIgnoreCase("hasVersion")) {
			int i = getElementCounterAttrs(qName);
			String fieldName = "metadata.hasVersion." + i + "@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:isReplacedBy")
				|| qName.equalsIgnoreCase("isReplacedBy")) {
			int i = getElementCounterAttrs(qName);
			String fieldName = "metadata.isReplacedBy." + i + "@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:replaces")
				|| qName.equalsIgnoreCase("replaces")) {
			int i = getElementCounterAttrs(qName);
			String fieldName = "metadata.replaces." + i + "@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:isRequiredBy")
				|| qName.equalsIgnoreCase("isRequiredBy")) {
			int i = getElementCounterAttrs(qName);
			String fieldName = "metadata.isRequiredBy." + i + "@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:requires")
				|| qName.equalsIgnoreCase("requires")) {
			int i = getElementCounterAttrs(qName);
			String fieldName = "metadata.requires." + i + "@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:isPartOf")
				|| qName.equalsIgnoreCase("isPartOf")) {
			int i = getElementCounterAttrs(qName);
			String fieldName = "metadata.isPartOf." + i + "@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:hasPart")
				|| qName.equalsIgnoreCase("hasPart")) {
			int i = getElementCounterAttrs(qName);
			String fieldName = "metadata.hasPart." + i + "@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:isReferencedBy")
				|| qName.equalsIgnoreCase("isReferencedBy")) {
			int i = getElementCounterAttrs(qName);
			String fieldName = "metadata.isReferencedBy." + i + "@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:references")
				|| qName.equalsIgnoreCase("references")) {
			int i = getElementCounterAttrs(qName);
			String fieldName = "metadata.references." + i + "@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:isFormatOf")
				|| qName.equalsIgnoreCase("isFormatOf")) {
			int i = getElementCounterAttrs(qName);
			String fieldName = "metadata.isFormatOf." + i + "@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:hasFormat")
				|| qName.equalsIgnoreCase("hasFormat")) {
			int i = getElementCounterAttrs(qName);
			String fieldName = "metadata.hasFormat." + i + "@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:conformsTo")
				|| qName.equalsIgnoreCase("conformasTo")) {
			int i = getElementCounterAttrs(qName);
			String fieldName = "metadata.conformasTo." + i + "@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:spatial")
				|| qName.equalsIgnoreCase("spatial")) {
			int i = getElementCounterAttrs(qName);
			String fieldName = "metadata.spatial." + i + "@";
			setAttributeValues(atts, fieldName);
		}
		if (qName.equalsIgnoreCase("ne:temporal")
				|| qName.equalsIgnoreCase("temporal")) {
			int i = getElementCounterAttrs(qName);
			String fieldName = "metadata.temporal."+i+"@";
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
			int i = getElementCounter(qName);
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
			int i = getElementCounter(qName);
			doc.add(new Field("metadata.classification." + i, tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:commonName")
				|| qName.equalsIgnoreCase("commonName")) {
			int i = getElementCounter(qName);
			doc.add(new Field("metadata.commonName." + i, tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:title")
				|| qName.equalsIgnoreCase("title")) {
			int i = getElementCounter(qName);
			doc.add(new Field("metadata.title." + i, tmpValue, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:creator")
				|| qName.equalsIgnoreCase("creator")) {
			int i = getElementCounter(qName);
			doc.add(new Field("metadata.creator." + i, tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:subject")
				|| qName.equalsIgnoreCase("subject")) {
			int i = getElementCounter(qName);
			doc.add(new Field("metadata.subject." + i, tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:description")
				|| qName.equalsIgnoreCase("description")) {
			int i = getElementCounter(qName);
			doc.add(new Field("metadata.description." + i, tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:contributor")
				|| qName.equalsIgnoreCase("contributor")) {
			int i = getElementCounter(qName);
			doc.add(new Field("metadata.contributor." + i, tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:date") || qName.equalsIgnoreCase("date")) {
			int i = getElementCounter(qName);
			doc.add(new Field("metadata.date." + i, tmpValue, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:type") || qName.equalsIgnoreCase("type")) {
			int i = getElementCounter(qName);
			doc.add(new Field("metadata.type." + i, tmpValue, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:format")
				|| qName.equalsIgnoreCase("format")) {
			int i = getElementCounter(qName);
			doc.add(new Field("metadata.format." + i, tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:identifier")
				|| qName.equalsIgnoreCase("identifier")) {
			int i = getElementCounter(qName);
			doc.add(new Field("metadata.identifier." + i, tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:source")
				|| qName.equalsIgnoreCase("source")) {
			int i = getElementCounter(qName);
			doc.add(new Field("metadata.source." + i, tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:language")
				|| qName.equalsIgnoreCase("language")) {
			int i = getElementCounter(qName);
			doc.add(new Field("metadata.language." + i, tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:relation")
				|| qName.equalsIgnoreCase("relation")) {
			int i = getElementCounter(qName);
			doc.add(new Field("metadata.relation." + i, tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:rights")
				|| qName.equalsIgnoreCase("rights")) {
			int i = getElementCounter(qName);
			doc.add(new Field("metadata.rights." + i, tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:alternative")
				|| qName.equalsIgnoreCase("alternative")) {
			int i = getElementCounter(qName);
			doc.add(new Field("metadata.alternative." + i, tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:created")
				|| qName.equalsIgnoreCase("created")) {
			int i = getElementCounter(qName);
			doc.add(new Field("metadata.created." + i, tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:extent")
				|| qName.equalsIgnoreCase("extent")) {
			int i = getElementCounter(qName);
			doc.add(new Field("metadata.extent." + i, tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:medium")
				|| qName.equalsIgnoreCase("medium")) {
			int i = getElementCounter(qName);
			doc.add(new Field("metadata.medium." + i, tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:isVersionOf")
				|| qName.equalsIgnoreCase("isVersionOf")) {
			int i = getElementCounter(qName);
			doc.add(new Field("metadata.isVersionOf." + i, tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:hasVersion")
				|| qName.equalsIgnoreCase("hasVersion")) {
			int i = getElementCounter(qName);
			doc.add(new Field("metadata.hasVersion." + i, tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:isReplacedBy")
				|| qName.equalsIgnoreCase("isReplacedBy")) {
			int i = getElementCounter(qName);
			doc.add(new Field("metadata.isReplacedBy." + i, tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:replaces")
				|| qName.equalsIgnoreCase("replaces")) {
			int i = getElementCounter(qName);
			doc.add(new Field("metadata.replaces." + i, tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:isRequiredBy")
				|| qName.equalsIgnoreCase("isRequiredBy")) {
			int i = getElementCounter(qName);
			doc.add(new Field("metadata.isRequiredBy." + i, tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:requires")
				|| qName.equalsIgnoreCase("requires")) {
			int i = getElementCounter(qName);
			doc.add(new Field("metadata.requires." + i, tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:isPartOf")
				|| qName.equalsIgnoreCase("isPartOf")) {
			int i = getElementCounter(qName);
			doc.add(new Field("metadata.isPartOf." + i, tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:hasPart")
				|| qName.equalsIgnoreCase("hasPart")) {
			int i = getElementCounter(qName);
			doc.add(new Field("metadata.hasPart." + i, tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:isReferencedBy")
				|| qName.equalsIgnoreCase("isReferencedBy")) {
			int i = getElementCounter(qName);
			doc.add(new Field("metadata.isReferencedBy." + i, tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:references")
				|| qName.equalsIgnoreCase("references")) {
			int i = getElementCounter(qName);
			doc.add(new Field("metadata.references." + i, tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:isFormatOf")
				|| qName.equalsIgnoreCase("isFormatOf")) {
			int i = getElementCounter(qName);
			doc.add(new Field("metadata.isFormatOf." + i, tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:hasFormat")
				|| qName.equalsIgnoreCase("hasFormat")) {
			int i = getElementCounter(qName);
			doc.add(new Field("metadata.hasFormat." + i, tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:conformsTo")
				|| qName.equalsIgnoreCase("conformasTo")) {
			int i = getElementCounter(qName);
			doc.add(new Field("metadata.conformasTo." + i, tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:spatial")
				|| qName.equalsIgnoreCase("spatial")) {
			int i = getElementCounter(qName);
			doc.add(new Field("metadata.spatial." + i, tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
		}
		if (qName.equalsIgnoreCase("ne:temporal")
				|| qName.equalsIgnoreCase("temporal")) {
			int i = getElementCounter(qName);
			doc.add(new Field("metadata.temporal." + i, tmpValue,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
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
