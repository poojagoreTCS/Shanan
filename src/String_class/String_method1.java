package String_class;

public class String_method1 {
	public static void main(String[] args) {
		String a1="poojagore";
		String a2="shital";
		String a3="POOJAGORE";
		System.out.println(a1.length());
		System.out.println(a1.toUpperCase());
		System.out.println(a1.toLowerCase());
		System.out.println(a1.equals(a2));//false
		System.out.println(a1.equalsIgnoreCase(a2));//false
		System.out.println(a1.contains(a3));//false
		System.out.println(a2.contains(a3));//TRUE
		System.out.println(a1.charAt(5));
		System.out.println(a1.indexOf("ja"));
		System.out.println(a1.concat(a2));
		System.out.println(a1.substring(4));
		System.out.println(a1.startsWith("po"));
		System.out.println(a2.endsWith("al"));
		System.out.println();
	}

}
