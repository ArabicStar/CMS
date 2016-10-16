package arabicStar.dataservice.querydataservice;

import java.util.List;

import arabicStar.data.querydata.QueryData;
import arabicStar.vo.SearchCondition;

public class QueryDataService implements QueryData {

	@Override
	public <T> List<T> search(SearchCondition<T> condition) {
		System.out.println("Searching database...");
		return null;
	}

}
