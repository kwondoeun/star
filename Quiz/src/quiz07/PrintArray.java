package quiz07;
public class PrintArray {

	String toArray(int[] arr) {
		String str = "[";
		for(int i = 0; i < arr.length; i++) {
			str += arr[i];  //대괄호를 붙여주고 원소를 붙여줌
			if(i == arr.length-1) {
				str += "]";
				break;
			}
			str += ", ";	
		}
		return str;
	}
	String toArray(char[] arr) {
		String str = "[";
		for(int i = 0; i < arr.length; i++) {  //for(int i : arr)
			str += arr[i];  //대괄호를 붙여주고 원소를 붙여줌
			if(i == arr.length-1) {
				str += "]";
				break;
			}
			str += ", ";	
		}
		return str;
	}
	String toArray(String[] arr) {
		String str = "[";
		for(int i = 0; i < arr.length; i++) {
			str += arr[i];  //대괄호를 붙여주고 원소를 붙여줌
			if(i == arr.length-1) {
				str += "]";
				break;
			}
			str += ", ";	
		}
		return str;
	}	
}