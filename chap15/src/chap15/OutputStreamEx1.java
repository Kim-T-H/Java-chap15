package chap15;

/*
 * 
 * 
 * FileOutStream ����:���Ͽ������� ���
 * 					������ �������� ������ ���� ����
 * 					������ �����ϴ� ��� ������ ����.
 * 			
 * 		void write(int data):2����Ʈ ���
 * 		void write(char[] buf):buf�� ������ ���Ͽ� ���
 * 		void write(char[] buf,int start, int len):buf�� �ε��������� ������ ���Ͽ� len ũ�⸸ ���
 *		void write(String data):���ڿ� ���
 */


import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamEx1 {

	public static void main(String[] args) throws IOException {
		System.out.print("��� ��Ʈ������");
		OutputStream out =System.out;
		out.write('1');out.write('2');out.write('2');  //1byte
		out.write('a');out.write('b');out.write('b');
		out.write('��');out.write('��');out.write('��');  //2byte�� ��� ��µ�
		out.flush();//������ ������ ������ ������(�ܼ�)�� ���.
		//Writer ��ü�� �����ϱ�
		System.out.println();
		Writer w= new OutputStreamWriter(System.out);
		
		w.write('1');w.write('2');w.write('2');  //1byte
		w.write('a');w.write('b');w.write('b');
		w.write('��');w.write('��');w.write('��');  //2byte�� ��� ��µ�
		w.flush();
	}

}
