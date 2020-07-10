package chap15;
/*
 * File Ŭ������ FileInputStream ��ü �����Ͽ� �ϱ�
 * 
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileEx3 {

	public static void main(String[] args) throws IOException {

		File f = new File("bbb.txt");
		
			if(!f.exists()) {
				System.out.println("������ �������� �ʽ��ϴ�.");
				return;
			}
			FileInputStream fis= new FileInputStream(f);
			int data=0;
			byte buf[] = new byte[8096];
			while((data=fis.read(buf))  !=-1) {
				System.out.println(new String(buf,0,data));
			}
			f.delete();
			
	}

}
