package chap15;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamEx1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		ObjectInputStream ois = new ObjectInputStream
					(new FileInputStream("object.ser"));	//objcet.ser ���Ͽ��� ��ü�Ѱ��� ����. objcetŸ������ ����
		Customer c1 =(Customer)ois.readObject();		//customer Ÿ������ ����ȯ
		Customer c2 =(Customer)ois.readObject();
		
		System.out.println("������ ��1:"+c1);
		System.out.println("������ ��2:"+c2);
	}

}
