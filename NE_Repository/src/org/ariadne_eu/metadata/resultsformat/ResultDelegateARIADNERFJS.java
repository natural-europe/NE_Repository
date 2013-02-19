package org.ariadne_eu.metadata.resultsformat;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import net.sourceforge.minor.lucene.core.searcher.IndexSearchDelegate;

import org.apache.log4j.Logger;
import org.apache.lucene.index.CorruptIndexException;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.TopDocs;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.FacetField;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.client.solrj.response.FacetField.Count;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.params.FacetParams;
import org.ariadne.config.PropertiesManager;
import org.ariadne_eu.utils.config.RepositoryConstants;
import org.ariadne_eu.utils.solr.SolrServerManagement;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

public class ResultDelegateARIADNERFJS implements IndexSearchDelegate {
	private static Logger log = Logger
			.getLogger(ResultDelegateARIADNERFJS.class);

	private int start;
	private int max;
	private String lQuery;
	private static Vector<String> facetFields;

	static {
		try {
			facetFields = new Vector<String>();

			Collection solrs = PropertiesManager
					.getInstance()
					.getPropertyStartingWith(
							RepositoryConstants.getInstance().SR_SOLR_FACETFIELD
									+ ".").values();
			for (Object object : solrs) {
				facetFields.add((String) object);
			}

			if (!(facetFields.size() > 0)) {
				log.error("initialize:property \""
						+ RepositoryConstants.getInstance().SR_SOLR_FACETFIELD
						+ ".n\" not defined");
			}

		} catch (Throwable t) {
			log.error("initialize: ", t);
		}
	}

	public ResultDelegateARIADNERFJS(int start, int max, String lQuery) {
		this.start = start;
		this.max = max;
		this.lQuery = lQuery;
	}

	public String result(TopDocs topDocs, IndexSearcher searcher)
			throws JSONException, CorruptIndexException, IOException {

		SolrDocument doc;

		QueryResponse response = getSolrResponse();

		JSONObject resultsJson = new JSONObject();
		JSONObject resultJson = new JSONObject();
		JSONArray idArrayJson = new JSONArray();
		JSONArray metadataArrayJson = new JSONArray();
		resultJson.put("error", "");
		resultJson.put("errorMessage", "");
		resultJson.put("facets", getFacets(response.getFacetFields()));

		int size = (int) response.getResults().getNumFound();
		if (size == -1)
			size = Integer.MAX_VALUE;

		for (int i = 0; i < max && (max < 0 || i < size - start); i++) {
			JSONObject json = new JSONObject();
			doc = response.getResults().get(i);
			try {
				// idArrayJson.put(doc.get("lom.general.identifier.entry"));
				idArrayJson.put(doc.get("header.id"));

				addJsonObject(doc, json, "header.id", "id");
				addJsonObject(doc, json, "header.collectionId", "collectionId");
				addJsonObject(doc, json, "header.createdOn", "createdOn");
				addJsonObject(doc, json, "header.createdBy", "createdBy");
				addJsonObject(doc, json, "header.lastModifiedOn",
						"lastModifiedOn");
				addJsonObject(doc, json, "header.lastModifiedBy",
						"lastModifiedBy");
				addJsonObject(doc, json, "header.deletedOn", "deletedOn");
				addJsonObject(doc, json, "header.deletedBy", "deletedBy");
				addJsonObject(doc, json, "header.version", "version");
				addJsonObject(doc, json, "header.status", "status");
				addJsonObject(doc, json, "header.access", "access");
				addJsonObject(doc, json, "header.validated", "validated");
				addJsonObject(doc, json, "header.presentedToII",
						"presentedToII");
				addJsonObject(doc, json, "header.disseminatedToBiocase",
						"disseminatedToBiocase");
				addJsonObject(doc, json, "header.metadataLanguages.language",
						"Languages");
				addJsonObject(doc, json, "metadata.provider", "provider");
				addJsonObject(doc, json, "metadata.dataProvider",
						"dataProvider");
				addJsonObject(doc, json, "metadata.objectUri", "objectUri");
				addJsonObject(doc, json, "metadata.contextUri", "contextUri");
				addJsonObject(doc, json, "metadata.contentType", "contentType");
				addJsonObject(doc, json, "metadata.licenseUri", "licenseUri");
				addJsonObject(doc, json, "metadata.thumbnailUri",
						"thumbnailUri");

				addJsonObjectWE(doc, json, "metadata.scientificName",
						"scientificName");
				addJsonObjectWE(doc, json, "metadata.classification",
						"classification");
				addJsonObjectWE(doc, json, "metadata.commonName", "commonName");
				addJsonObjectWE(doc, json, "metadata.title", "title");
				addJsonObjectWE(doc, json, "metadata.creator", "creator");
				addJsonObjectWE(doc, json, "metadata.subject", "subject");
				addJsonObjectWE(doc, json, "metadata.description",
						"description");
				addJsonObjectWE(doc, json, "metadata.contributor",
						"contributor");
				addJsonObjectWE(doc, json, "metadata.date", "date");
				addJsonObjectWE(doc, json, "metadata.type", "type");
				addJsonObjectWE(doc, json, "metadata.format", "format");
				addJsonObjectWE(doc, json, "metadata.identifier", "identifier");
				addJsonObjectWE(doc, json, "metadata.source", "source");
				addJsonObjectWE(doc, json, "metadata.language", "language");
				addJsonObjectWE(doc, json, "metadata.relation", "relation");
				addJsonObjectWE(doc, json, "metadata.rights", "rights");
				addJsonObjectWE(doc, json, "metadata.alternative",
						"alternative");
				addJsonObjectWE(doc, json, "metadata.created", "created");
				addJsonObjectWE(doc, json, "metadata.extent", "extent");
				addJsonObjectWE(doc, json, "metadata.medium", "medium");
				addJsonObjectWE(doc, json, "metadata.isVersionOf",
						"isVersionOf");
				addJsonObjectWE(doc, json, "metadata.hasVersion", "hasVersion");
				addJsonObjectWE(doc, json, "metadata.isReplacedBy",
						"isReplacedBy");
				addJsonObjectWE(doc, json, "metadata.replaces", "replaces");
				addJsonObjectWE(doc, json, "metadata.isRequiredBy",
						"isRequiredBy");
				addJsonObjectWE(doc, json, "metadata.requires", "requires");
				addJsonObjectWE(doc, json, "metadata.isPartOf", "isPartOf");
				addJsonObjectWE(doc, json, "metadata.hasPart", "hasPart");
				addJsonObjectWE(doc, json, "metadata.isReferencedBy",
						"isReferencedBy");
				addJsonObjectWE(doc, json, "metadata.references", "references");
				addJsonObjectWE(doc, json, "metadata.isFormatOf", "isFormatOf");
				addJsonObjectWE(doc, json, "metadata.hasFormat", "hasFormat");
				addJsonObjectWE(doc, json, "metadata.conformsTo", "conformsTo");
				addJsonObjectWE(doc, json, "metadata.spatial", "spatial");
				addJsonObjectWE(doc, json, "metadata.temporal", "temporal");
				addJsonObjectWE(doc, json, "metadata.geolocation",
						"geolocation");

			} catch (JSONException ex) {
				log.error(ex);
			}
			metadataArrayJson.put(json);
		}
		resultJson.put("id", idArrayJson);
		resultJson.put("metadata", metadataArrayJson);
		resultJson.put("nrOfResults", size);

		resultsJson.put("result", resultJson);

		System.out.println(resultsJson.toString());
		// log.info(resultsJson.toString());
		return resultsJson.toString();
	}

	private void addJsonObject(SolrDocument doc, JSONObject json,
			String fieldName, String responeseName) throws JSONException {
		Object field = doc.get(fieldName);
		if (field != null)
			json.put(responeseName, field);
		else
			json.put(responeseName, new String(""));
	}

	private void addJsonObjectWE(SolrDocument doc, JSONObject json,
			String fieldName, String responeseName) throws JSONException {

		int pointer = 1;

		Collection collection = new HashSet();

		handleAttributeElements(doc, json, fieldName, responeseName, pointer,
				collection);
	}

	private void handleAttributeElements(SolrDocument doc, JSONObject json,
			String fieldName, String responseName, int pointer, Collection data)
			throws JSONException {

		String fn = fieldName + "." + pointer;
		Object object = doc.get(fn);
		if (object != null) {

			HashMap<String, Object> elText = new HashMap<>();
			elText.put("value", object);

			Object lang = doc.get(fn + "@xml:lang");
			if (lang != null)
				elText.put("lang:", lang);

			data.add(elText);

			handleAttributeElements(doc, json, fieldName, responseName,
					pointer + 1, data);
		} else
			json.put(responseName, new String(""));

		json.put(responseName, data);
	}

	private QueryResponse getSolrResponse() {
		SolrServerManagement serverMgt = SolrServerManagement.getInstance();

		SolrQuery solrQuery = new SolrQuery().setQuery(lQuery).setFacet(true)
				.setFacetLimit(-1).setFacetMinCount(1)
				.setFacetSort(FacetParams.FACET_SORT_COUNT)
				.setParam("rows", Integer.toString(max))
				.setParam("start", Integer.toString(start));

		for (Iterator<String> iterator = facetFields.iterator(); iterator
				.hasNext();) {
			String facetField = (String) iterator.next();
			solrQuery.addFacetField(facetField);
		}
		QueryResponse rsp = null;

		try {
			rsp = serverMgt.getServer().query(solrQuery);

		} catch (SolrServerException e) {
			log.error("getSolrResponse: Solr server error", e);
		} catch (IOException e) {
			log.error("getSolrResponse: Solr I/O error", e);
		}
		return rsp;
	}

	private JSONArray getFacets(List facetsFields) {
		JSONArray facetsJson = new JSONArray();
		try {
			if (facetsFields.size() > 0) {
				List<Count> facetValues;
				FacetField facetField;
				FacetField.Count innerFacetField;
				for (Iterator facetIterator = facetsFields.iterator(); facetIterator
						.hasNext();) {
					JSONObject facetJson = new JSONObject();
					facetField = (FacetField) facetIterator.next();
					facetJson.put("field",
							changeFacetName(facetField.getName()));

					facetValues = facetField.getValues();
					if (facetValues != null) {
						JSONArray valuesJson = new JSONArray();
						for (Iterator ifacetIterator = facetValues.iterator(); ifacetIterator
								.hasNext();) {
							JSONObject value = new JSONObject();
							innerFacetField = (FacetField.Count) ifacetIterator
									.next();
							value.put("val", innerFacetField.getName());
							value.put("count", innerFacetField.getCount());
							valuesJson.put(value);
						}
						facetJson.put("numbers", valuesJson);
					}
					facetsJson.put(facetJson);
				}

			}
		} catch (JSONException e) {
			log.error("getFacets: JSON format error", e);
		}
		return facetsJson;
	}

	private String changeFacetName(String internalName) {
		if (internalName
				.equalsIgnoreCase("lom.educational.learningresourcetype.value"))
			return "lrt";
		else if (internalName.equalsIgnoreCase("lom.educational.context.value"))
			return "context";
		else if (internalName.equalsIgnoreCase("collection"))
			return "collection";
		else if (internalName.equalsIgnoreCase("lom.technical.format"))
			return "format";
		else if (internalName.equalsIgnoreCase("lom.general.language"))
			return "language";
		// else if (internalName.equalsIgnoreCase("collection"))
		// return "provider";
		else if (internalName
				.equalsIgnoreCase("lom.educational.interactivitytype.value"))
			return "it";
		else if (internalName
				.equalsIgnoreCase("lom.educational.interactivitylevel.value"))
			return "il";
		else if (internalName
				.equalsIgnoreCase("lom.educational.intendedenduserrole.value"))
			return "iur";
		else if (internalName
				.equalsIgnoreCase("lom.educational.typicalagerange.string"))
			return "tagr";
		else if (internalName.equalsIgnoreCase("lom.general.keyword.string"))
			return "keyword";
		else if (internalName.equalsIgnoreCase("lom.rights.description.string"))
			return "rights";
		else if (internalName
				.equalsIgnoreCase("lom.rights.copyrightandotherrestrictions.string"))
			return "licences";
		else if (internalName
				.equalsIgnoreCase("lom.classification.taxonpath.taxon.entry.string"))
			return "classification";
		else if (internalName
				.equalsIgnoreCase("lom.educational.typicalagerange.string"))
			return "temporal";
		else if (internalName.equalsIgnoreCase("lom.general.coverage.string"))
			return "spatial";
		else if (internalName
				.equalsIgnoreCase("lom.classification.description.string"))
			return "common";

		return internalName;
	}

}
