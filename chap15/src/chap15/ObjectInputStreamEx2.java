package chap15;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * ��Ӱ��� ����ȭ ����. ���Ͽ��� ��ü�� �о� �����ϱ�.
 */
public class ObjectInputStreamEx2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		ObjectInputStream ois = new ObjectInputStream
				(new FileInputStream("objcet.ser"));
		Object c1 =ois.readObject();		//object Ÿ������ �ҷ��� ��Ӱ���
		Object c2 =ois.readObject();
		
		System.out.println("������ �����1:"+c1);
		System.out.println("������ �����1:"+c2);
		

	}

}
