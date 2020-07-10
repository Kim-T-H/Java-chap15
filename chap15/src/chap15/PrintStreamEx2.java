package chap15;
/*
 * printf 메서드 예제: 형식 지정 문자(서식 지정문자) 사용 가능
 * 					%d,%s,%c...
 * 					String.format() 메서드도 똑같이 사용이 가능함.
 * 
 */
public class PrintStreamEx2 {

	public static void main(String[] args) {
		//char 형식지정문자 : %c ,  %n==\n
		System.out.printf("%c%n",'A');	//A문자 출력 
		System.out.printf("%5c%n",'A');	//5자리 확보하여 A 문자 출력 =>우측정렬
		System.out.printf("%-5c%n",'A');//5자리 확보하여 A문자 출력. 음수가들어가면 좌측정렬
		//정수 출력:%d(10진수 출력),%o(8진수),%x(16진수 출력,소문자로출력),%X(16진수 출력,대문자로 출력)
		System.out.printf("%d%n", 12345);			//10진수 출력
		System.out.printf("%,d%n", 12345);			//세자리마다 ,넣어서 10진수 출력   (돈을관리할때 주로 필요함.)
		System.out.printf("%10d%n", 12345);			//10자리 확보하여 10진수 출력. 우측정렬
		System.out.printf("%010d%n", 12345);		//10자리 확보하여 10진수 출력하고 빈공간을 0으로 채우기
		System.out.printf("%3d%n", 12345);			//최소3자리 확보.
		System.out.printf("%-10d%n", 12345);		//10자리확보하여 10진수 출력 .좌측정렬
		System.out.printf("%,10d%n", 12345);		//10자리 확보하여 10진수 출력. 우측정렬. 세자리마다,출력
		System.out.printf("%-,10d%n", 12345);		//10자리 확보하여 10진수 출력. 좌측정렬. 세자리마다,출력
		System.out.printf("%,010d%n", 12345);		//10자리 확보하여 10진수 출력. 우측정렬. 빈자리0으로 채우기.  세자리마다,출력
		System.out.printf("%o%n", 12345);			//8진수 출력
		System.out.printf("%x%n",255);				//16진수 출력(소문자로 출력)
		//실수 출력:%f(소수표현) ,%e(지수표현),%g(근사실수)
		System.out.printf("%f%n", 12345.12345); //실수표현
		System.out.printf("%.2f%n", 12345.12345);//소숫점이하 2자리까지만 출력.반올림.
		System.out.printf("%10.2f%n", 12345.12345);//전체자리수 10자리를 확보하고 소숫점이하 2자리까지만 출력.반올림.
		System.out.printf("%,10.2f%n", 12345.12345); //전체자리수 10자리를 확보하고 소숫점이하 2자리까지만 출력.반올림. 세자리마다 ,출력
		System.out.printf("%-,10.2f%n", 12345.12345);//전체자리수 10자리를 확보하고 소숫점이하 2자리까지만 출력.반올림. 세자리마다 ,출력. 좌측정렬
		System.out.printf("%,010.2f%n", 12345.12345);//세자리, 10자리를 확보빈자리 0으로 채움.소숫점이하 2자리
		System.out.printf("%e%n",12345.12345);		//지수표현으로 출력    1.234512*10^4
		System.out.printf("%g%n",12345.12345);		//근사지수표현으로 출력 
		//논리형:%b 
		System.out.printf("%b !=%b%n", true,false);
		System.out.printf("(2>3) == %b%n", (2>3));
		
		//문자열:%s
		System.out.printf("%s은 %s이다.","홍길동","의적");
		System.out.printf("%10s는 %10s이다.%n","홍길동","의적");//10자리를 확보해서 문자열을 출력
		
		//문제 10진수 255는 8진수 377이고, 16진수  FF다.  printf로 출력하기
		System.out.printf("%d%n",255);
		System.out.printf("%o%n", 255);
		System.out.printf("%x%n", 255);
		String hex=String.format("%X", 255);
		String octal =String.format("%o", 255);
		System.out.println("255의 16진수" +hex);
		System.out.println("255의 8진수"+octal);
	}

}
