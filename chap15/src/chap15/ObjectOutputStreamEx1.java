package chap15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * ObjectOutputStream 예제
 * 		-객체를 외부로 전송하는 스트림
 * 		-전송되는 객체는 반드시 Serializable 인터페이스를 구현해야한다.
 * 			구현하지 않은 경우: java.io.NotSerializableException 예외 발생.
 * 		-객체를 외부로 전송하는 기능을 직렬화라 한다.
 * 		-ObjectInputStream 을 이용하여 객체를 읽을 수 있다.
 * 
 */
class Customer implements Serializable{    //객체의 직렬화를 위해서 구현.
		private String name;	//전송대상 컬럼
		private transient int age;		//외부 전송대상 컬럼 아님!!!
		public Customer(String name, int age) {
			super();
			this.name=name;
			this.age=age;
		}




@Override
		public String toString() {
			return "Customer [name=" + name + ", age=" + age + "]";
		}

}


public class ObjectOutputStreamEx1 {

	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("object.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);		//보조스트림 객체를 외부로 전송하거나 받을 수있는 스트림
		Customer c1 = new Customer("홍길동",20);
		Customer c2 = new Customer("홍길동",30);
		oos.writeObject(c1);	//c1객체를 object.ser 파일에 출력
		oos.writeObject(c2);	//c2객체를 object.ser 파일에 출력.
		System.out.println("고객1:"+c1);
		System.out.println("고객2:"+c2);

	}

}
