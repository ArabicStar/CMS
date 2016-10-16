package arabicStar.data.querydata;

import java.util.List;

import arabicStar.vo.SearchCondition;

public interface QueryData {
	public <T> List<T> search(SearchCondition<T> condition);
}
