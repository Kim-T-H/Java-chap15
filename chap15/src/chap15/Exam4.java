package chap15;

import java.io.File;

/*
 * C:\\windows ������ �����Ͽ� ������ ���� ���� ������ ������ ����,
 * ������ ��ũ�⸦ ����ϱ�
 * 
 *���� ����� ������ �ʱ�ȭ ������ ������ �����ϸ� += 1 �� ����
 *
 *sum1++
 *sum2++ �̷��Ե� ī��Ʈ �Ҽ� ����.
 *
 */

public class Exam4 {

	public static void main(String[] args) {
		String filePath="c:\\windows";
		File f1 =new File(filePath);
		String files[] = f1.list();
		int sum1 = 0;
		int sum2 = 0;
		long sum3 = 0;
		for(String f: files) {
			File f2= new File(filePath,f);
			if(f2.isDirectory()) {
				sum1 += 1;
			}
			
			else if(f2.isFile()) {
				sum2 += 1;
				sum3 += f2.length();
			}
			
		}
			System.out.println("������ ����:"+sum1);
			System.out.println("������ ����:"+sum2);
			System.out.printf("������ �� ũ��:%,dbyte",sum3); //printf �� �ΰ�
	}

}
