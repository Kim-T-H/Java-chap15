package chap15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 상속 관계에서 직렬화.
 * 부모는 시리얼라이즈가 아니고 자손은 serialize
 */

class UserInfo{
	protected String name;
	protected String password;
	public UserInfo() {}
	public UserInfo(String name,String password) {
		this.name = name;
		this.password = password;
	}


	public String toString() {
		return "UserInfo [ name="+name + ",password="+password+"]";
	}
}
	class User extends UserInfo implements Serializable{
		private int age;
		public User(String name, String password, int age) {
			super(name,password);
			this.age=age;
		}
		public String toString() {
			return "UserInfo [ name="+name + ",password="+password+",age="+age+"]";
		}
		private void writeObject(ObjectOutputStream out)throws IOException{
			out.writeUTF(name);//문자열
			out.writeUTF(password);
			out.defaultWriteObject();
		}
		private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{
			name =in.readUTF();	
			password =in.readUTF();
			in.defaultReadObject();
		}
	}


public class ObjcetOutputStreamEx2 {

	public static void main(String[] args) throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream
						(new FileOutputStream("objcet.ser"));
		User u1 =new User("홍길동","1234",20);
		User u2 =new User("김삿갓","5678",30);
		oos.writeObject(u1);
		oos.writeObject(u2);
		System.out.println("사용자1:"+u1);
		System.out.println("사용자2:"+u2);
		

	}
}




