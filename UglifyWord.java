
public class UglifyWord {

	public static void main(String[] args) {
		uglifyWord("aaa-bbb-ccc");
	}

	public static String uglifyWord(String str) {
		
		StringBuilder result = new StringBuilder();
		int flag = 1;
		
		for(char value : str.toCharArray()) {
			if(Character.isAlphabetic(value) && flag == 1) {
				result.append(Character.toUpperCase(value));
				flag = flag == 1? 0 : 1;
			}	
			else if(Character.isAlphabetic(value) && flag == 0){
				result.append(Character.toLowerCase(value));
				flag = flag == 1? 0 : 1;
			}
			else {
				result.append(value);
				flag = 1;
			}
		}
		return result.toString();
	}

}
