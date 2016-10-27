package arabicStar.po;


/**
 * This class is the PO of comment
 * @author jqwu
 *
 */
public class CommentPO {
	private String time;
	private String member;
	private String content;
	private String hotel;
	
	public CommentPO(String time, String member, String content, String hotel){
		this.time = time;
		this.member = member;
		this.content = content;
		this.hotel = hotel;
	}
	
	public String getTime(){
		return time;
	}
	
	public String getMember(){
		return member;
	}
	
	public String getContent(){
		return content;
	}
	
	public String getHotel(){
		return hotel;
	}

}
