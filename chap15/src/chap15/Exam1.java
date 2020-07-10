package chap15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/*
 * ȭ�鿡�� ���ϸ��� �Է¹޾� �ش��� ������ ������ ȭ�鿡 ����ϱ�
 * �ѱ� ������ �ʵ��� �ϰ�, FileInputStream�� �̿��ϱ�
 * �ش� ������ ���� ��� '�ش� ���� ����' �޼��� ����ϱ�.
 * 
 */
public class Exam1 {

	public static void main(String[] args) throws IOException {
		System.out.println("���ϸ��� �Է��ϼ���.");
		Scanner scan= new Scanner(System.in);
		String x=scan.next();
		try {
		FileInputStream fis = new FileInputStream("src/chap15/" + x + ".java");   //x�� ���ϸ�
		int data;
		byte[] buf= new byte[fis.available()];
		while((data=fis.read(buf)) !=-1) {
			System.out.print(new String(buf,0,data));	
		}
		
		
		}
		catch(FileNotFoundException e) { 
			System.out.println("�ش����� ����");    //try ~ catch ����� ������ ����Ͽ��� ���ܼ��� 
		}	catch(Exception e) {
			e.printStackTrace();
		}
	}
}
