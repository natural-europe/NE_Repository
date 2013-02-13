package org.ariadne_eu.utils.lucene.document.ne;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

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

	headerType headerType;

	String content;

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
		headerType = new headerType();
		// content = new String();

	}

	public void endDocument() {

	}

	public void startElement(String uri, String localName, String qName,
			Attributes atts) throws SAXException {

		// Check for element existence in the header section
		chechHeaderSection(qName);

	}

	public void chechHeaderSection(String qName) {

		if (qName.equalsIgnoreCase("ne:id")) {
			headerType.setId(true);
		}
		if (qName.equalsIgnoreCase("ne:collectionId")) {

			headerType.setCollectionId(true);
		}

		if (qName.equalsIgnoreCase("ne:createdOn")) {
			headerType.setCreatedOn(true);
		}
		if (qName.equalsIgnoreCase("ne:createdBy")) {

			headerType.setCreatedBy(true);
		}
		if (qName.equalsIgnoreCase("ne:lastModifiedOn")) {

			headerType.setLastModifiedOn(true);
		}
		if (qName.equalsIgnoreCase("ne:lastModifiedBy")) {

			headerType.setLastModifiedOn(true);
		}
		if (qName.equalsIgnoreCase("ne:deletedOn")) {

			headerType.setDeletedOn(true);
		}

		if (qName.equalsIgnoreCase("ne:deletedBy")) {

			headerType.setDeletedBy(true);
		}
		if (qName.equalsIgnoreCase("ne:version")) {

			headerType.setVersion(true);
		}
		if (qName.equalsIgnoreCase("ne:status")) {

			headerType.setStatus(true);
		}
		if (qName.equalsIgnoreCase("ne:access")) {

			headerType.setAccess(true);
		}
		if (qName.equalsIgnoreCase("ne:validated")) {

			headerType.setValidated(true);
		}
		if (qName.equalsIgnoreCase("ne:metadataLanguages")) {
			headerType.setMetadataLangs(true);

		}
		if (qName.equalsIgnoreCase("ne:metadataLanguage")) {

			headerType.setMetadataLang(true);
		}
		if (qName.equalsIgnoreCase("ne:presentedToII")) {

			headerType.setPresentedToII(true);
		}
		if (qName.equalsIgnoreCase("ne:disseminatedToBiocase")) {

			headerType.setDisseminatedToBiocase(true);
		}

	}

	public void characters(char ch[], int start, int length) {

		if (headerType.isId()) {
			String id = new String(ch, start, length);

			doc.add(new Field("header.id", id, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
			headerType.setId(false);
		}
		if (headerType.isCollectionId()) {
			String id = new String(ch, start, length);

			doc.add(new Field("header.collectionId", id, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
			headerType.setCollectionId(false);
		}
		if (headerType.isCreatedOn()) {
			String id = new String(ch, start, length);

			doc.add(new Field("header.createdOn", id, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
			headerType.setCreatedOn(false);
		}
		if (headerType.isCreatedBy()) {
			String id = new String(ch, start, length);

			doc.add(new Field("header.createdBy", id, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
			headerType.setCreatedBy(false);
		}
		if (headerType.isLastModifiedOn()) {
			String id = new String(ch, start, length);

			doc.add(new Field("header.lastModifiedOn", id, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
			headerType.setLastModifiedOn(false);
		}
		if (headerType.isLastModifiedBy()) {
			String id = new String(ch, start, length);

			doc.add(new Field("header.lastModifiedBy", id, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
			headerType.setLastModifiedBy(false);
		}
		if (headerType.isDeletedOn()) {
			String id = new String(ch, start, length);

			doc.add(new Field("header.deletedOn", id, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
			headerType.setDeletedOn(false);
		}
		if (headerType.isDeletedBy()) {
			String id = new String(ch, start, length);

			doc.add(new Field("header.deletedBy", id, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
			headerType.setDeletedBy(false);
		}
		if (headerType.isVersion()) {
			String id = new String(ch, start, length);

			doc.add(new Field("header.version", id, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
			headerType.setVersion(false);
		}
		if (headerType.isStatus()) {
			String id = new String(ch, start, length);

			doc.add(new Field("header.status", id, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
			headerType.setStatus(false);
		}
		if (headerType.isAccess()) {
			String id = new String(ch, start, length);

			doc.add(new Field("header.access", id, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
			headerType.setAccess(false);
		}
		if (headerType.isValidated()) {
			String id = new String(ch, start, length);

			doc.add(new Field("header.validated", id, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
			headerType.setValidated(false);
		}

		if (headerType.isMetadataLangs()) {

			headerType.setMetadataLangs(false);
		}
		if (headerType.isMetadataLang()) {
			String id = new String(ch, start, length);

			doc.add(new Field("header.metadataLanguages.metadataLanguage", id,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
			headerType.setMetadataLang(false);
		}
		if (headerType.isPresentedToII()) {
			String id = new String(ch, start, length);

			doc.add(new Field("header.presentedToII", id, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
			headerType.setPresentedToII(false);
		}
		if (headerType.isDisseminatedToBiocase()) {
			String id = new String(ch, start, length);

			doc.add(new Field("header.disseminatedToBiocase", id,
					Field.Store.YES, Field.Index.NOT_ANALYZED));
			headerType.setPresentedToII(false);

		}

	}

	public void endElement(String uri, String localName, String qName)
			throws SAXException {

	}

	public static void main(String[] args) throws FileNotFoundException,
			DocumentHandlerException {
		// TODO Auto-generated method stub
		NEHandler handler = new NEHandler();
		String filePath = "myXML.xml";

		handler.getDocument(new FileInputStream(new File(filePath)));

	}

}
