package jp.co.internous.ecsite.model.dto;

import jp.co.internous.ecsite.model.entity.User;

public class LoginDto {
//	コンストラクタ3つ、3パターンでインスタンス化する為
	private long id;
	private String userName;
	private String password;
	private String fullName;
	
	public LoginDto() {}
//	初期設定せず後から1つずつSetterでデータセット
	public LoginDto(User user) {
		this.id=user.getId();
		this.userName=user.getUserName();
		this.password=user.getPassword();
		this.fullName=user.getFullName();
	}
//	Userエンティティをまとめて受け取りデータセット
	public LoginDto(long id,String userName,String password,String fullName) {
		this.id=id;
		this.userName=userName;
		this.password=password;
		this.fullName=fullName;
	}
//	引数を分けて受け取りデータセット
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id=id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName=userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName=fullName;
	}
	
}
	

