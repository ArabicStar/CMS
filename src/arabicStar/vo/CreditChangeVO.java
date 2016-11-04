package arabicStar.vo;

import java.time.ZonedDateTime;
import java.util.Date;

public class CreditChangeVO {
	private String memberID;
	private String orderID;
	private ZonedDateTime time;
	private int originalCredit, changedCredit;

	public int getChangedCredit() {
		return changedCredit;
	}

	public int getOriginalCredit() {
		return originalCredit;
	}

	public Date getTime() {
		return time;
	}

	public OrderVO getOrder() {
		return order;
	}

	public void setChangedCredit(int changedCredit) {
		this.changedCredit = changedCredit;
	}

	public void setOriginalCredit(int originalCredit) {
		this.originalCredit = originalCredit;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public void setOrder(OrderVO order) {
		this.order = order;
	}
}
