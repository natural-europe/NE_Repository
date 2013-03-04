/**
 * 
 */
package org.ariadne_eu.utils.lucene.analysis;

import java.io.Reader;

import org.apache.lucene.analysis.KeywordAnalyzer;
import org.apache.lucene.analysis.PerFieldAnalyzerWrapper;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.WhitespaceAnalyzer;
import org.apache.lucene.analysis.snowball.SnowballAnalyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.util.Version;

/**
 * @author vogias
 * 
 */
public class NeDocumentAnalyzer extends DocumentAnalyzer {
	private static PerFieldAnalyzerWrapper pfanalyzer;

	public NeDocumentAnalyzer() {
		pfanalyzer = new PerFieldAnalyzerWrapper(new StandardAnalyzer(
				Version.LUCENE_29));
		pfanalyzer.addAnalyzer("key", new KeywordAnalyzer());
		pfanalyzer.addAnalyzer("date.insert", new KeywordAnalyzer());
		pfanalyzer.addAnalyzer("contents", new SnowballAnalyzer(Version.LUCENE_29,"English"));
		// pfanalyzer.addAnalyzer("untokenized.xmlns", new KeywordAnalyzer());
	    pfanalyzer.addAnalyzer("lom.solr", new KeywordAnalyzer());
		pfanalyzer.addAnalyzer("collection", new KeywordAnalyzer());
		pfanalyzer.addAnalyzer("md", new KeywordAnalyzer());

	}

	@Override
	public PerFieldAnalyzerWrapper getAnalyzer() {
		// TODO Auto-generated method stub
		return pfanalyzer;
	}

	@Override
	public TokenStream tokenStream(String arg0, Reader arg1) {
		// TODO Auto-generated method stub
		return null;
	}

}
