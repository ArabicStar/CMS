package arabicStar.data.hoteldata;

import arabicStar.po.HotelPO;
import arabicStar.util.hotel.Hotel;

/**
 * 这是Hotel数据的接口
 * @author Vivian
 *
 */
public interface HotelData {

	public Hotel getInfo();

	public double getRating();

	public double getCheap();

	public int getStar();

	public void insert(HotelPO po);

	public void delete(HotelPO po);

	public void update(HotelPO po);

	public HotelPO find(int id);

}
