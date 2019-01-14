import java.util.Scanner;
public class Check {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int out=convertStrinToInt(s);
	
		System.out.println(out);
		
		
		
	}
	
	static int convertStrinToInt(String in){
		int number = 0, i=0;
		boolean isNegative=false;
		int len = in.length();
		 if(in.charAt(0)=='-') {
			 isNegative=true;
			 i=1;
		 }
		 while(i<len) {
			 number *= 10;
			 number += (in.charAt(i++)-'0');
		 }
		 
		if(isNegative==true)
		number = -number;
		return number;
	}
}
