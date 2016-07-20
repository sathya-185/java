public class Str {

	public static void main(String[] args) {
		String strOriginal="hai sathya";
		System.out.println("original string"+strOriginal);
		strOriginal=new StringBuffer(strOriginal).reverse().toString();
		System.out.println("reversed string:"+strOriginal);
	}

}
