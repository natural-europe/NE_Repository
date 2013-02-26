package org.ariadne_eu.utils.lucene.document;

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
	private static Logger log = Logger.getLogger(LOMLiteHandler.class);

	private Document doc;
	boolean type, identifier, lomidentifier, userId, status, timestamp, loID,
			dataprovider;

	boolean ratevalue, ratingType;
	boolean bookmarkText;
	boolean commentText;
	boolean postText, threadId;
	boolean sharingPlace, sharingType;
	boolean tagtext, controlledTag, classification;

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
		// content = new String();

	}

	public void endDocument() {

	}

	public void startElement(String uri, String localName, String qName,
			Attributes atts) throws SAXException {

		if (qName.equalsIgnoreCase("identifier")) {
			identifier = true;
		}

		if (qName.equalsIgnoreCase("type")) {
			type = true;
		}

		if (qName.equalsIgnoreCase("lomIdentifier")) {
			lomidentifier = true;
		}
		if (qName.equalsIgnoreCase("userIdentifier")) {
			userId = true;
		}
		if (qName.equalsIgnoreCase("status")) {
			status = true;
		}
		if (qName.equalsIgnoreCase("timeStamp")) {
			timestamp = true;
		}
		if (qName.equalsIgnoreCase("loIdentifier")) {
			loID = true;
		}
		if (qName.equalsIgnoreCase("dataProvider")) {
			dataprovider = true;
		}
		if (qName.equalsIgnoreCase("rateValue")) {
			ratevalue = true;
		}
		if (qName.equalsIgnoreCase("ratingType")) {
			ratingType = true;
		}

		if (qName.equalsIgnoreCase("bookmarkText")) {
			bookmarkText = true;
		}
		if (qName.equalsIgnoreCase("commentText")) {
			commentText = true;
		}

		if (qName.equalsIgnoreCase("postText")) {
			postText = true;
		}
		if (qName.equalsIgnoreCase("threadID")) {
			threadId = true;
		}

		if (qName.equalsIgnoreCase("sharingPlace")) {
			sharingPlace = true;
		}
		if (qName.equalsIgnoreCase("sharingType")) {
			sharingType = true;
		}

		if (qName.equalsIgnoreCase("tagText")) {
			tagtext = true;
		}
		if (qName.equalsIgnoreCase("controlledTag")) {
			controlledTag = true;
		}
		if (qName.equalsIgnoreCase("classification")) {
			classification = true;
		}

	}

	public void characters(char ch[], int start, int length) {

		if (identifier) {
			String id = new String(ch, start, length);

			doc.add(new Field("identifier", id, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
			identifier = false;
		}

		if (type) {
			String t = new String(ch, start, length);

			doc.add(new Field("type", t, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
			type = false;
		}

		if (lomidentifier) {
			String lomid = new String(ch, start, length);

			doc.add(new Field("lomIdentifier", lomid, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
			lomidentifier = false;
		}

		if (userId) {
			String user = new String(ch, start, length);

			doc.add(new Field("userId", user, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
			userId = false;
		}
		if (status) {
			String st = new String(ch, start, length);

			doc.add(new Field("status", st, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
			status = false;
		}
		if (timestamp) {
			String time = new String(ch, start, length);

			doc.add(new Field("timeStamp", time, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
			timestamp = false;
		}
		if (loID) {
			String lID = new String(ch, start, length);

			doc.add(new Field("loIdentifier", lID, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
			loID = false;
		}
		if (dataprovider) {
			String data = new String(ch, start, length);

			doc.add(new Field("dataProvider", data, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
			dataprovider = false;
		}
		if (ratevalue) {
			String rate = new String(ch, start, length);

			doc.add(new Field("rateValue", rate, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
			ratevalue = false;
		}
		if (ratingType) {
			String rateT = new String(ch, start, length);

			doc.add(new Field("ratingType", rateT, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
			ratingType = false;
		}
		
		if (bookmarkText) {
			String bt = new String(ch, start, length);

			doc.add(new Field("bookmarkText", bt, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
			bookmarkText = false;
		}
		
		if (commentText) {
			String c = new String(ch, start, length);

			doc.add(new Field("commentText", c, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
			commentText = false;
		}
		
		if (postText) {
			String p = new String(ch, start, length);

			doc.add(new Field("postText", p, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
			postText = false;
		}
		
		if (threadId) {
			String ti = new String(ch, start, length);

			doc.add(new Field("postText", ti, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
			threadId = false;
		}
		
		if (sharingPlace) {
			String ti = new String(ch, start, length);

			doc.add(new Field("sharingPlace", ti, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
			sharingPlace = false;
		}
		
		if (sharingType) {
			String ti = new String(ch, start, length);

			doc.add(new Field("sharingType", ti, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
			sharingType = false;
		}
		if (tagtext) {
			String ti = new String(ch, start, length);

			doc.add(new Field("tagtext", ti, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
			tagtext = false;
		}
		if (controlledTag) {
			String ti = new String(ch, start, length);

			doc.add(new Field("controlledTag", ti, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
			controlledTag = false;
		}
		if (classification) {
			String ti = new String(ch, start, length);

			doc.add(new Field("classificaition", ti, Field.Store.YES,
					Field.Index.NOT_ANALYZED));
			classification = false;
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
