public class Postiv {
	public static void main(String[] args) {
		int x;
		x=Integer.parseInt(args[0]);
		if(x==0){
			System.out.println("number is either positive or negative");
		}
		else if(x>0){
			System.out.println("number is positive");
		}
		else {
			System.out.println("number is negative");
		}
	}

}
