public class Recurse {
	 String reverse = "";
     
	    public String reverseString(String str){
	         
	        if(str.length() == 1){
	            return str;
	        } else {
	            reverse += str.charAt(str.length()-1)
	                    +reverseString(str.substring(0,str.length()-1));
	            return reverse;
	        }
	    }
	     
	    public static void main(String a[]){
	        Recurse srr = new Recurse();
	        System.out.println("Result: "+srr.reverseString("hi guvi"));
	    }
	

}
