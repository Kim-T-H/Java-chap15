package chap15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Date;

/*
 * FileOutputStream�� �̿��Ͽ� error �α� ���� �����ϱ�
 * 
 */
public class FileOutputStreamEx2 {

	public static void main(String[] args) {
		firstMethod();

	}
	private static void firstMethod() {
		secondMethod();
	}
	private static void secondMethod() {
		try {
			throw new Exception("���Ͽ� ���� �޽��� �����ϱ�");
		} catch(Exception e) {
			e.printStackTrace();
			try {
				//("error.log",true)
				//erroe.log: ����� ������ �̸�. ������ ����.������ ����
				//true :������ append ����. ������ ������ ������ ������������.
				FileOutputStream fos =new FileOutputStream("error.log");
				fos.write(e.getMessage().getBytes());
				e.printStackTrace(new PrintStream(fos));  //PrintStream ��������ȯ   fos�� �������� error.log
				fos.write((new Date()+"+++++++++++\n\n").getBytes());
				
			}catch(IOException e2) {
				e2.printStackTrace();
			}
		}
	}

}
