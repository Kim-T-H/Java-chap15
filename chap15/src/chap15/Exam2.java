package chap15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

/*
 * ȭ�鿡�� ���ϸ��� �Է¹ް�,
 * ȭ�鿡 ������ �Է¹޾�, �Է¹��� ���ϸ� ������ �����ϱ�.
 * "exit" ������ �Է¹����� ���α׷� ����.
 * FileOutputStream ����ϱ�
 * [���]
 * ���ϸ��� �Է��ϼ���.
 * aaa.txt
 * ������ ������ �Է��ϼ���.
 * �ȳ��ϼ���
 * �ݰ����ϴ�.
 * 
 * aaa.txt ������ ����
 * �ȳ��ϼ���
 * �ݰ����ϴ�.
 * 
 */
public class Exam2 {

	public static void main(String[] args) throws IOException {
		System.out.println("���ϸ��� �Է��ϼ���");
		Scanner scan=new Scanner(System.in);
		String x = scan.next();
		
		FileOutputStream fos = new FileOutputStream(x+"txt");
		System.out.println("������ ������ �Է��ϼ���(����:exit)");
		
		while(true) {
			String data = scan.next();
			if(data.equals("exit")) break;
			fos.write((data+"\n").getBytes());
		}
		fos.flush();  //return �� ���
		fos.close();

	}

}
