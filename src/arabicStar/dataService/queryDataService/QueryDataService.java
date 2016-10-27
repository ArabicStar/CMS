package arabicStar.dataService.queryDataService;

import java.util.List;

import arabicStar.vo.SearchCondition;

public interface QueryDataService {
	public <T> List<T> search(SearchCondition<T> condition);
}
