package String_class;

public class String_method2 {
	public static void main(String[] args) {
		String v1="charita";
		String v2="CHARITA";
		String v3="kolhe";
		System.out.println(v1.length());
		System.out.println(v1.toUpperCase());
		System.out.println(v1.toLowerCase());
		System.out.println(v1.equals(v2));
		System.out.println(v1.equalsIgnoreCase(v2));
		System.out.println(v1.contains(v3));
		System.out.println(v1.charAt(3));
		System.out.println(v2.indexOf("4"));
		System.out.println(v1.concat(v3));
		System.out.println(v1.substring(2));
		System.out.println(v2.startsWith("CH"));
		System.out.println(v1.endsWith("ta"));
	}

}
