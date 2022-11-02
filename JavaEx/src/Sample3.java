import java.io.BufferedReader;
import java.io.FileReader;

public class Sample3 {

	public static void main(String[] args) {
		
		try {
			//문자 데이터를 줄 단위로 읽을 수 있는 인스턴스 생성
			BufferedReader br = new BufferedReader(new FileReader("./ch.txt"));
			
			//줄 단위로 읽어서 출력하기
			while(true) {
				//한줄 읽기
				String line = br.readLine();
				//읽은 데이터가 없으면 종료
				if(line == null) {
					break;
				}
				//읽은 데이터 출력
				//System.out.println(line);
				
				//읽은 문자열에서 ,를 기준으로 앞의 데이터만 출력
				String[] ar = line.split(",");
				System.out.println(ar[0]);
			}
			br.close();
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}

	}

}
