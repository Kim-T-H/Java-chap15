package chap15;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamEx1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		ObjectInputStream ois = new ObjectInputStream
					(new FileInputStream("object.ser"));	//objcet.ser 파일에서 객체한개를 읽음. objcet타입으로 전달
		Customer c1 =(Customer)ois.readObject();		//customer 타입으로 형변환
		Customer c2 =(Customer)ois.readObject();
		
		System.out.println("복원된 고객1:"+c1);
		System.out.println("복원된 고객2:"+c2);
	}

}
