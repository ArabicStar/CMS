package arabicStar.util.order;

import java.util.Date;

import arabicStar.po.OrderState;
import arabicStar.util.hotel.Hotel;
import arabicStar.util.hotel.Room;
import arabicStar.vo.OrderVO;

/**
 * This class is the info of order
 * @author WaterWan
 *
 */
public class Order {
	// TODO: 缺少酒店信息
	Hotel hotel;
	Room room;
	private OrderState state;
	private Date date;// TODO:这个地方应该自己实现date来表示时间
	private int stayDays;
	

	
	public Order() {
		
	}
	
	public Order(OrderVO orderInfo) {
		
	}
	
	/**
	 * 判断该订单是否为未执行状态
	 * @return 如果为未执行状态，返回true，否则返回false
	 */
	public boolean isUnexecuted() {
		if(state.equals(OrderState.UNEXECUTED)) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * 判断该订单是否为已执行状态
	 * @return 如果为已执行状态，返回true，否则返回false
	 */
	public boolean isExecuted() {
		if(state.equals(OrderState.EXECUTED)) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * 判断该订单是否为撤销状态
	 * @return 如果为撤销状态，返回true，否则返回false
	 */
	public boolean isRepealed() {
		if(state.equals(OrderState.REPEALED)) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * 判断该订单是否为异常状态
	 * @return 如果为异常状态，返回true，否则返回false
	 */
	public boolean isAbnormal() {
		if(state.equals(OrderState.ABNORMAL)) {
			return true;
		} else {
			return false;
		}
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getStayDays() {
		return stayDays;
	}
	public void setStayDays(int stayDays) {
		this.stayDays = stayDays;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public OrderState getState() {
		return state;
	}
	public void setState(OrderState state) {
		this.state = state;
	}
}
