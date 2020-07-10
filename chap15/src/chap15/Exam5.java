package chap15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * bin/chap/PrintStreamEx1.class ������ ���� �����̴�.
 * ���� ������ �о ȭ�鿡 16������ ����ϱ�.
 * 
 */
public class Exam5 {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		File f = new File("C:\\Users/GDJ24/Desktop/iop/PrintStreamEx1.class");
		FileInputStream fis =new FileInputStream(f);
		int len=0;
		byte [] buf=new byte[16];  //16���� ����
				while((len=fis.read(buf)) !=-1) {
					for(int i =0; i<len;i++) {
						System.out.printf("%02X ",buf[i]);  //�ݺ����� �̿��ؼ� 16���۾� �ϰ� 16������ ǥ��
					}
					System.out.println();
				}
			
	}

}
