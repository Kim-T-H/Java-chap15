package chap15;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * 상속관련 직렬화 예제. 파일에서 객체를 읽어 복원하기.
 */
public class ObjectInputStreamEx2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		ObjectInputStream ois = new ObjectInputStream
				(new FileInputStream("objcet.ser"));
		Object c1 =ois.readObject();		//object 타입으로 불러옴 상속관계
		Object c2 =ois.readObject();
		
		System.out.println("복원된 사용자1:"+c1);
		System.out.println("복원된 사용자1:"+c2);
		

	}

}
