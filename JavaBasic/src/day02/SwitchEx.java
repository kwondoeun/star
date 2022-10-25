package day02;

public class SwitchEx {
	public static void main(String[] args) {
		
		int a = 4;
		
		//switch구문의 ()에는 값이나 값에 대한 연산식이 들어갈수 있음   //컨트롤+알트 방향키 아래로 복사  //컨트롤+ d 삭제 
		switch (a) {
		case -1:
		case 0:
		case 1:
			System.out.println("1입니다");
			break;
		case 2:
			System.out.println("2입니다");
			break;
		case 3:
			System.out.println("3입니다");
			break;
		case 4:
			System.out.println("4입니다");
			break;

		default:
			System.out.println("1~4가 아닙니다~");
			break;
		}
		
		
		
		
	}

}
