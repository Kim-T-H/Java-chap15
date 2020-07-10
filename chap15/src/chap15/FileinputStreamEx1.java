package chap15;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

/*
 * FileInputStream: ������ ������ �о����.����Ʈ �Է½�Ʈ��.
 * int read() : 1byte�� �о ����
 * int read(byte[] buf) : buf�� ũ�⸸ŭ �о �����͸� buf�� ������.
 * 							������ ���� ����Ʈ�� ����.
 * int read(byte[] buf,int start,int len) : buf�� ũ�⿡�� len��ŭ  �����͸� �о �����͸�  buf�� start�ε������� ������.
 * 											������ ���� ����Ʈ�� ����.
 */
public class FileinputStreamEx1 {

	public static void main(String[] args) throws IOException {
		//fis:src/chap15/InputStreamEx1.java ����
		FileInputStream fis = new FileInputStream("src/chap15/InputStreamEx1.java"); //�ݵ�� IOException ���ؾ���
		System.out.println("======read()�޼��� �̿��Ͽ� �б�");
		int data=0;
		while((data=fis.read()) !=-1) {  //read �� ����ó���ؾ���
			System.out.print((char)data);
		}
		
		
		System.out.println("======read(byte[] buf)�޼��� �̿��Ͽ� �б�");
		fis = new FileInputStream("src/chap15/InputStreamEx1.java");
		//fis.available(): �б� ���� ����Ʈ ��. ������ byte���� ����.
		byte[] buf= new byte[fis.available()];//������ ũ�⸦ ������ ũ�⸸ŭ ����.
		while((data=fis.read(buf)) !=-1) {	//���۸�ŭ�а�     -1: EOF  ������ ��   != -1�� ������ ���� �ƴѵ��� �о��! while ��
			System.out.println(new String(buf,0,data));  //data: �������� ����Ʈ�� ����.    ������ 0������ ������ ���� �����Ͱ����� ����ض�
														//buf: ������ ����
		}
		
		
		System.out.println("======read(byte[] buf)�޼��� �̿��Ͽ� �б�");
		fis = new FileInputStream("src/chap15/InputStreamEx1.java");
		buf = new byte[fis.available()];
		while((data=fis.read(buf,0,buf.length)) !=-1) {
			System.out.println(new String(buf,0,data));
		}
	}

}
