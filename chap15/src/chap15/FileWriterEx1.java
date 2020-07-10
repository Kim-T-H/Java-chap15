package chap15;

/*
 * FileWriter ����:���Ͽ� �ؽ�Ʈ ������ ���
 * 		void write(int data):2����Ʈ ���
 * 		void write(char[] buf):buf�� ������ ���Ͽ� ���
 * 		void write(char[] buf,int start, int len):buf�� �ε��������� ������ ���Ͽ� len ũ�⸸ ���
 *		void write(String data):���ڿ� ���
 */


import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx1 {

	public static void main(String[] args) throws IOException {
		System.out.println("out.txt ���Ͽ� ��µ˴ϴ�.");
		//fos:out.txt ������ ���� ���� ������.
		FileWriter fos = new FileWriter("out2.txt");
		fos.write('1');	fos.write('2');	fos.write('3');
		fos.write('a');	fos.write('b');	fos.write('c');
		fos.write('��');	fos.write('��');	fos.write('��');
		char[] buf="\n�ݰ����ϴ�. FileOutputStream �����Դϴ�.\n".toCharArray();
		fos.write(buf);
		fos.write(buf,1,6);
		fos.write("�ȳ��ϼ���.	ȫ�浿�Դϴ�.");
		fos.flush();

	}

}
