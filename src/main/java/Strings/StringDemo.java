package Strings;

public class StringDemo {

	public static void main(String[] args) {
		String str ="Hyderabad";
		System.out.println("String Length = "+str.length());
		System.out.println("0 index character = "+str.charAt(0));
		System.out.println("d character index value = "+str.indexOf('d'));
		System.out.println("bad is there in str = "+str.contains("bad"));
		System.out.println("Sub String value = "+str.substring(6,8));
		System.out.println("Uppercase = "+str.toUpperCase());
		System.out.println("Lowercase = "+str.toLowerCase());
		System.out.println("Hello "+str);
		String str1= "Hi";
		System.out.println(str1+ " "+str);
		System.out.println(str1.trim());
		
	}

}
