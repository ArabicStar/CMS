package arabicStar.vo;

/**
 * This class is the VO of comment
 * @author jqwu
 *
 */
public class CommentVO {
	private String time;
	private String member;
	private String content;
	private String hotel;
	
	public CommentVO(String time, String member, String content, String hotel){
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
