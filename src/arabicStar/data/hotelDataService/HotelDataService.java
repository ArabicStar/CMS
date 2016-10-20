package arabicStar.data.hotelDataService;

import arabicStar.po.HotelPO;

/**
 * 这是Hotel数据的接口
 * @author Vivian
 *
 */
public interface HotelDataService {

	public HotelPO getInfo();

	public double getRating();

	public double getCheap();
	
	public int getStar();
	
}
