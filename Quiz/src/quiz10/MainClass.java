package quiz10;
import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {

		/* 문제1
		 * 1. 클래스 User를 생성하세요
		 * 2. 멤버변수 name: String ,  rrn : int, int age 를 선언후 은닉 처리합니다 (private 지정)
		 * 3. User 클래스에는 기본생성자, 모든 멤버변수를  초기화 하는 생성자  2개를 생성하세요.
		 * 4. main에서 User객체를  생성 후  
		 *    (홍길동, 20, 123123 )을 저장 하고 값을 확인하세요.
		 */
		
		User u1 = new User("홍길동", 20, 123123);
		System.out.println(u1.getName() + "-" + u1.getAge() + "-" + u1.getRrn());
		
		/* 문제2
		 * 1. 2개의 크기를 갖는 User배열을 선언하세요. (User배열은 User클래스를 저장할 수 있습니다.)
		 * 2. 두번째 User객체를 생성하세요. ("김길동", 30, rrn값)을 저장.
		 * 3. User배열에 두 객체를 저장하세요.
		 * 4. 향상된 포문을 사용해서  *모든변수*를 출력하세요.
		 * ex) User[] arr = new User[2]; //클래스도 타입, 변수명으로 집어넣으면 됨
		 */
//		String[] arr = new String[2];
		
		User u2 = new User("김길동", 30, 24234);
		
		User[] arr = new User[2];
		arr[0] = u1;
		arr[1] = u2;
		
//		for(int i = 0; i < arr.length; i++) {
//			User u = arr[i];
//			System.out.println(u.getName());
//			System.out.println(u.getAge());
//			System.out.println(u.getRrn());
//		}
		
		for(User u : arr) {  //i만큼 배열을 돌린다
			System.out.println(u.getName());
			System.out.println(u.getAge());
			System.out.println(u.getRrn());
		}
		
		/* 문제 3
		 * 1. 5개의 크기를 갖는 User배열을 선언하세요.
		 * 2. 5번회전하는 while 안에서 Scanner객체를 이용하여 name, rrn, age을 입력받으세요
		 * 3. while문 안에서 User객체를 생성하고, 입력받은 name과 rrn, age을 저장하세요.
		 * 4. while문 안에서 User객체를 User배열에 저장하세요.
		 * 5. Arrays.toString(배열명) 을 이용하여 저장되는 값을 확인하세요. 
		 */
	
		Scanner scan = new Scanner(System.in); //한번만 선언
		User[] uArr = new User[2]; //한번만 선언
		
		int j = 0;
		while(j < uArr.length) {
			//입력
			System.out.println("이름>");
			String n = scan.next();
			
			System.out.println("나이");
			int a = scan.nextInt();
			
			System.out.println("rrn");
			int r = scan.nextInt();
			
			//setter or 생성자를 이용하여 저장가능
//			User u = new User(n, a, r);  //생성자
			User u = new User(); //setter, 반복문 안에 선언
			u.setName(n);
			u.getName();
			u.setAge(a);
			u.getAge();
			u.setRrn(r);
			u.getRrn();
			
			uArr [j] = new User (n, a, r);
			j++;
			
			System.out.println(Arrays.toString(uArr));
		}
	}
}
