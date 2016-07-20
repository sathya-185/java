public class ControlStatement {
	public static void main(String[] args){
	String input = "SATHYA"; 
	StringBuilder output = new StringBuilder();
	 
	char[] characters = input.toCharArray();
	 
	for (int i = 0; i < characters.length; i++)
	{
	  if (i % 2 == 0)
	  {
	    if((i+1) < characters.length )
	    {
	     output.append(characters[i + 1]);
	          
	      
	    }
	      StringBuilder ch1= output.append(characters[i]);
	      System.out.println(ch1);        
	  }
	}
}}
