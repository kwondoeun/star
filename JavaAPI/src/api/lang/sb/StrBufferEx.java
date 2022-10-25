package api.lang.sb;

public class StrBufferEx {
	public static void main(String[] args) {
		
		String str = new String("Java");
		
		StringBuffer sb = new StringBuffer("Java");
		
		System.out.println(str);
		System.out.println(sb);
		
		str = str + "Program"; //문자열 (새로운 문자열 생성)
		
		sb.append("Program"); //버퍼클래스 (붙이긴만 함)
		
		System.out.println(str);
		System.out.println(sb);
		
		//문자열 마지막에 추가
		sb.append("기존 문자열 마지막에 추가");
		
		System.out.println(sb);
		
		//중간에 추가
		sb.insert(11, "-");
		System.out.println(sb);
		
		//문자열 변경
		sb.replace(0, 4, "자바");
		System.out.println(sb);
		
		//문자열 삭제
		sb.delete(0, 2);
		System.out.println(sb);
		
		//문자열로 형변환
		//System.out.println(str.equals(sb));
		String result = sb.toString();
		
		//거꾸로
		sb.reverse();
		System.out.println(sb);
	}

}
