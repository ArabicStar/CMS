package arabicStar.bl.queryBLService;

import java.util.List;

import arabicStar.util.hotel.Hotel;
import arabicStar.vo.SearchCondition;

/**
 * @author tinke
 *
 *         Business logic interface of query module
 */
public interface QueryLogicService {
	/**
	 * @param condition
	 *            search condition
	 * @return list of hotel corresponding to the condition
	 */
	public <T> List<T> search(SearchCondition<T> condition);

	/**
	 * @param list
	 *            list of hotels to be sorted
	 * @param order
	 *            order which sorts by
	 * @return sorted list
	 */
	public List<Hotel> sort(List<Hotel> list, int order);
}
