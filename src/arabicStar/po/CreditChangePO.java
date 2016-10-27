package arabicStar.po;

import java.util.Date;

public class CreditChangePO {
	private Date time;
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

	public void setChangedCredit(int changedCredit) {
		this.changedCredit = changedCredit;
	}

	public void setOriginalCredit(int originalCredit) {
		this.originalCredit = originalCredit;
	}

	public void setTime(Date time) {
		this.time = time;
	}
}
