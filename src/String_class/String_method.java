package String_class;

public class String_method {public static void main(String[] args) {
	String s1="velocity";
	String s2="VELOCITY";
	String s3="city";
	//length
	System.out.println(s1.length());//8
	//touppercase
	System.out.println(s1.toUpperCase());//VELOCITY
	//tolowercase
	System.out.println(s1.toLowerCase());//velocity
	//equals
	System.out.println(s1.equals(s2));//false
	//equalsignorecase
	System.out.println(s1.equalsIgnoreCase(s2));//true
	//contains
	System.out.println(s1.contains(s3));//true
	System.out.println(s2.contains(s3));//false
	//charat
	System.out.println(s1.charAt(4));//c
	//indexof
	System.out.println(s1.indexOf('i'));//5
	//concat
	System.out.println(s2.concat(s3));//VILOCITYcity
	//substring
	System.out.println(s1.substring(4));//city
	//startswith
	System.out.println(s1.startsWith("ve"));//true
	//endswith
	System.out.println(s1.endsWith("ty"));//true
	

}

}
