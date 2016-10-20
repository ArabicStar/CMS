package arabicStar.blservice.queryBLServiceImpl;

import java.util.List;

import arabicStar.bl.queryBLService.QueryLogicService;
import arabicStar.util.hotel.Hotel;
import arabicStar.vo.SearchCondition;

public class QueryLogicServiceImpl_Stub implements QueryLogicService {

	@Override
	public <T> List<T> search(SearchCondition<T> condition) {
		System.out.println("Seaching...");
		return null;
	}

	@Override
	public List<Hotel> sort(List<Hotel> list, int order) {
		System.out.println("Sorting");
		return null;
	}

}
