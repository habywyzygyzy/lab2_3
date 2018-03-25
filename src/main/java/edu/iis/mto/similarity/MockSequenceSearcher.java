package edu.iis.mto.similarity;

import edu.iis.mto.search.SearchResult;
import edu.iis.mto.search.SequenceSearcher;
import edu.iis.mto.similarity.MockSearchResult;;

public class MockSequenceSearcher implements SequenceSearcher {

	public SearchResult search(int key, int[] seq) {
		
		for(int i = 0 ; i < seq.length ; i++) {
			
			if(seq[i] == key)
				return new MockSearchResult(true, i);
		}
		
		return new MockSearchResult(false, -1);
	}

}
