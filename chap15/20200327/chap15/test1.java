package chap15;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

/*
 * 1. �ݺ����� �̿��Ͽ� 
   ���ϸ��� �Է¹޾Ƽ� �ش� ������ �����ϸ� �ش����ϸ�.bak ���� �����ϱ�
   ���ϸ� exit �� �ԷµǸ�, ���α׷� ����.
   �ش� ������ ������ �ش� ������ �����ϴ�. �޼��� ���


[���]
 ���ϸ��� �Է��ϼ���(����:exit)
 aaa.txt  =>�����ϴ� ���
 aaa.bak ���Ͽ� aaa.txt�� ������ �����ϱ�

 ���ϸ��� �Է��ϼ���(����:exit)
 bbb.txt  =>�������� �ʴ� ���
 �ش� ������ �����ϴ�. 
 */
public class test1 {

	public static void main(String[] args) throws IOException{
		
		Scanner scan= new Scanner(System.in);
//		BufferedInputStream in = null;
//		OutputStream out = null;
		
		while(true) {
		
		System.out.println("���ϸ��� �Է��ϼ���(����:exit)");
		String name=scan.next();
		
		
		try {
		if(name.equals("exit")) break;
		FileInputStream fis =new FileInputStream(name+".txt");
		System.out.println("�ش� ������ ����");
		
		BufferedInputStream in = null;
		OutputStream out = null;
		in = new BufferedInputStream(new FileInputStream (name+".txt"));
		out = new FileOutputStream(name+".bak"); 
		int data =0;
		while((data=in.read()) !=-1){
				out.write(data);
		}
		
		
		}catch(FileNotFoundException e) { 
			System.out.println("�ش����� ����");    //try ~ catch ����� ������ ����Ͽ��� ���ܼ��� 
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		}
	}
}
		
		
		

	

