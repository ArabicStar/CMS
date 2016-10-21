package arabicStar.vo;



public class UserVO {

	String name;
	int id;
	User user;
	
	public UserVO(User user,String name){
		this.name = name;
		this.user = user;
	}
	
	public String getName(){
		return name;
	}
	
	public int getId(){
		return id;
	}
}
