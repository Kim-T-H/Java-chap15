package chap15;
/*
 * printf �޼��� ����: ���� ���� ����(���� ��������) ��� ����
 * 					%d,%s,%c...
 * 					String.format() �޼��嵵 �Ȱ��� ����� ������.
 * 
 */
public class PrintStreamEx2 {

	public static void main(String[] args) {
		//char ������������ : %c ,  %n==\n
		System.out.printf("%c%n",'A');	//A���� ��� 
		System.out.printf("%5c%n",'A');	//5�ڸ� Ȯ���Ͽ� A ���� ��� =>��������
		System.out.printf("%-5c%n",'A');//5�ڸ� Ȯ���Ͽ� A���� ���. ���������� ��������
		//���� ���:%d(10���� ���),%o(8����),%x(16���� ���,�ҹ��ڷ����),%X(16���� ���,�빮�ڷ� ���)
		System.out.printf("%d%n", 12345);			//10���� ���
		System.out.printf("%,d%n", 12345);			//���ڸ����� ,�־ 10���� ���   (���������Ҷ� �ַ� �ʿ���.)
		System.out.printf("%10d%n", 12345);			//10�ڸ� Ȯ���Ͽ� 10���� ���. ��������
		System.out.printf("%010d%n", 12345);		//10�ڸ� Ȯ���Ͽ� 10���� ����ϰ� ������� 0���� ä���
		System.out.printf("%3d%n", 12345);			//�ּ�3�ڸ� Ȯ��.
		System.out.printf("%-10d%n", 12345);		//10�ڸ�Ȯ���Ͽ� 10���� ��� .��������
		System.out.printf("%,10d%n", 12345);		//10�ڸ� Ȯ���Ͽ� 10���� ���. ��������. ���ڸ�����,���
		System.out.printf("%-,10d%n", 12345);		//10�ڸ� Ȯ���Ͽ� 10���� ���. ��������. ���ڸ�����,���
		System.out.printf("%,010d%n", 12345);		//10�ڸ� Ȯ���Ͽ� 10���� ���. ��������. ���ڸ�0���� ä���.  ���ڸ�����,���
		System.out.printf("%o%n", 12345);			//8���� ���
		System.out.printf("%x%n",255);				//16���� ���(�ҹ��ڷ� ���)
		//�Ǽ� ���:%f(�Ҽ�ǥ��) ,%e(����ǥ��),%g(�ٻ�Ǽ�)
		System.out.printf("%f%n", 12345.12345); //�Ǽ�ǥ��
		System.out.printf("%.2f%n", 12345.12345);//�Ҽ������� 2�ڸ������� ���.�ݿø�.
		System.out.printf("%10.2f%n", 12345.12345);//��ü�ڸ��� 10�ڸ��� Ȯ���ϰ� �Ҽ������� 2�ڸ������� ���.�ݿø�.
		System.out.printf("%,10.2f%n", 12345.12345); //��ü�ڸ��� 10�ڸ��� Ȯ���ϰ� �Ҽ������� 2�ڸ������� ���.�ݿø�. ���ڸ����� ,���
		System.out.printf("%-,10.2f%n", 12345.12345);//��ü�ڸ��� 10�ڸ��� Ȯ���ϰ� �Ҽ������� 2�ڸ������� ���.�ݿø�. ���ڸ����� ,���. ��������
		System.out.printf("%,010.2f%n", 12345.12345);//���ڸ�, 10�ڸ��� Ȯ�����ڸ� 0���� ä��.�Ҽ������� 2�ڸ�
		System.out.printf("%e%n",12345.12345);		//����ǥ������ ���    1.234512*10^4
		System.out.printf("%g%n",12345.12345);		//�ٻ�����ǥ������ ��� 
		//������:%b 
		System.out.printf("%b !=%b%n", true,false);
		System.out.printf("(2>3) == %b%n", (2>3));
		
		//���ڿ�:%s
		System.out.printf("%s�� %s�̴�.","ȫ�浿","����");
		System.out.printf("%10s�� %10s�̴�.%n","ȫ�浿","����");//10�ڸ��� Ȯ���ؼ� ���ڿ��� ���
		
		//���� 10���� 255�� 8���� 377�̰�, 16����  FF��.  printf�� ����ϱ�
		System.out.printf("%d%n",255);
		System.out.printf("%o%n", 255);
		System.out.printf("%x%n", 255);
		String hex=String.format("%X", 255);
		String octal =String.format("%o", 255);
		System.out.println("255�� 16����" +hex);
		System.out.println("255�� 8����"+octal);
	}

}