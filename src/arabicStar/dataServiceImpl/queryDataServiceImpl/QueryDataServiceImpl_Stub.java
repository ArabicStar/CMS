package arabicStar.dataServiceImpl.queryDataServiceImpl;

import java.util.List;

import arabicStar.data.queryDataService.QueryDataService;
import arabicStar.vo.SearchCondition;

public class QueryDataServiceImpl_Stub implements QueryDataService {

	@Override
	public <T> List<T> search(SearchCondition<T> condition) {
		System.out.println("Searching database...");
		return null;
	}

}
