package Javabasic;

public class Homeworkandtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * 
		 * 
		 * 
		 */
		
		//Two ways to create string
		//String literal,by using new memory operator 
		
		
		
		String str ="We are learning java";
				System.out.println(str.length());
				System.out.println(str.charAt(2));
				System.out.println(str.indexOf("W"));
				System.out.println(str.indexOf("a"));// first occurance
				System.out.println(str.indexOf("a",str.indexOf("a")+1));// second occurance 
				System.out.println("i am second occurance" + str.indexOf("a",str.indexOf("a")+1));// second occurance 
				
			
		
		
		//String concatination 
				
		 String s="Kamal";
		 String k="Millat";
		 
		 s.concat(k);
		 System.out.println(s.concat(k)); 
		 
		 
		 // Substring 
		 //*"We are learning java";
		 
		str.substring(0, 5);
		
		System.out.println(str.substring(4, 13));
		
		 
		 
	
		
		
		
		
	}

}
