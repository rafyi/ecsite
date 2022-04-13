package jp.co.internous.ecsite.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
/* クラス宣言部を追加 entityアノテーションを付与するとSpringの機能でクラスがentityとして振る舞う
 * TableアノテーションはDBにあるどのテーブルの実態なのか指定するもの */
public class User {
	//Mysqlの対象テーブルの構造通りに作る
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="user_name")
	private String userName;
	@Column(name="password")
	private String password;
	@Column(name="full_name")
	private String fullName;
	@Column(name="is_admin")
	private int isAdmin;
	/* DBテーブルuserの各カラムをフィールドとして宣言
	 * @Idはプライマリーキーと指定
	 * @Columnはテーブルのどのカラムとマッピングするかを指定
	 * @GeneratedValueはIDフィールドの振る舞い方を指定 今回はAUTO_incrementとして振る舞う */
	
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
	public int getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(int isAdmin) {
		this.isAdmin=isAdmin;
	}


}
