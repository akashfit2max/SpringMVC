package springmvc.model;

public class User {
	private String emial;
	private String userName;
	private String userPassword;

	public String getEmial() {
		return emial;
	}

	public void setEmial(String emial) {
		this.emial = emial;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public User(String emial, String userName, String userPassword) {
		super();
		this.emial = emial;
		this.userName = userName;
		this.userPassword = userPassword;
	}

}
