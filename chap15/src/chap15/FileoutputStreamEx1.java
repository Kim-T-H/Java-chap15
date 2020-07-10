package chap15;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * FileOutputStream ����: ���Ͽ� ������ ���.
 *		void write(int data) : 1����Ʈ ���
 * 		void write(byte[] buf): buf�� ������ ���Ͽ� ���
 * 		void write(byte[] buf,int start,int len): buf�� start �ε��������� ������ ���Ͽ� len ũ�⸸ ���
 * 
 */
public class FileoutputStreamEx1 {

	public static void main(String[] args) throws IOException{
		System.out.println("out.txt ���Ͽ� ��µ˴ϴ�.");
		//fos:out.txt ������ ���� ���� ������.
		FileOutputStream fos = new FileOutputStream("out.txt");
		fos.write('1');	fos.write('2');	fos.write('3');
		fos.write('a');	fos.write('b');	fos.write('c');
		fos.write('��');	fos.write('��');	fos.write('��');
		byte[] buf="\n�ݰ����ϴ�. FileOutputStream �����Դϴ�.\n".getBytes();
		fos.write(buf);
		fos.write(buf,1,6);
		fos.flush();
		

	}

}
