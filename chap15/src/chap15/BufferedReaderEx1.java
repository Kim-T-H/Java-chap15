package chap15;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ������Ʈ��
 *		1.���ο� ����� �߰��ϴ� ��Ʈ�� 
 *		2.��ü ������ �ٸ� ��Ʈ���� �Ű������� �޴´�.****************
 *		new BufferedReader(Reader)
 *		new BufferedInputStream(InputStream)
 *		
 *BufferedReader: ���۱���� �߰��Ͽ� ���� ��� ��Ŵ.
 *=>readLine() : ���پ� ���� ���ִ� ��� �߰�
 *
 *Ű���忡�� �Է��� ������ ���پ� �о ȭ�鿡 ����ϰ� buffered.txt ���Ͽ� �����ϱ�
 *Scanner.nextLine() :���پ� �б�  => �����������
 * 
 */
public class BufferedReaderEx1 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //���پ� �о�� �ʹ�
		FileWriter fw = new FileWriter("buffered.txt"); //���پ��о���ִ¾ָ� ����
		String data =null;		//Ű���忡�� �Էµ� ��������
		while((data=br.readLine()) != null) {  //br�� Ű�����Է�     	EOF(������ ��): crtl+z
			System.out.println(data);
			fw.write(data+"\n"); // ���Ͽ� ����.
			
		}
		fw.flush();
		fw.close();

	}

}
