public class Hex2Dec {
	
	public static void main(String[] args) {
		int m = Hex2Dec.hexToDecimal("AB8C");
		System.out.println(m);
		
	}
	public static int hexToDecimal(String hex){
		int decimalValue = 0;
		for(int i = 0; i < hex.length(); i++){
			char hexChar = hex.charAt(i);
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
		}
		return decimalValue;
	}
	
	public static int hexCharToDecimal(char ch) {
		if(ch >= 'A' && ch <= 'F'){
			return 10 + ch - 'A';
		} else {
			return ch - '0';
		}
		
		
	}
	
}
