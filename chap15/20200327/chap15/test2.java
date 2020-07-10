package chap15;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * 1. src/chap15 ������ .java ���� �� InputStream ���� ��� �ҽ���  
InputStream����.txt  ���Ϸ� �����ϱ�
 InputStream ���� ��� �ҽ� : XXXInputStreamXXX.java
*/

public class test2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException{
		String filePath="src/chap15/";
		File f=new File(filePath);
		String []files =f.list();  //����Ʈ�� �迭
		OutputStream out= null;
		out=new FileOutputStream("InputStream����.txt");
		
		for(String f1 : files) {
			if((f1.indexOf("InputStream")) !=-1) {
				BufferedInputStream in = null;
				in = new BufferedInputStream(new FileInputStream 
						("src/chap15/"+f1));
				out.write(("============="+f1+"===============\n").getBytes());
				int data=0;
				while((data=in.read())  !=-1) {
				out.write(data);
				}
				
			}
		}
	}
	}