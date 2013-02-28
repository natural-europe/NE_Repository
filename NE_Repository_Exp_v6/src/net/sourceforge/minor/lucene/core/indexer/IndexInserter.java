package net.sourceforge.minor.lucene.core.indexer;


public interface IndexInserter {
	
	void insert(IndexInserterDelegate insert, boolean create,String fPath) throws Exception;
	
}
