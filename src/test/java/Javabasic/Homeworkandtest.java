package Javabasic;

public class Homeworkandtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * Two ways create string 
		 * String literal etc: String s="i like automation software:;
		 * by using new memory operator. etc : String st= new String ("Like automation software");
		 * Using String buffer and String builder  
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
		
		// String comparison 
		String s1= "kamal";
		String s2 = "Kamal";
		s1.equals(s2);//==
		System.out.println(s1.equals(s2));// True 
		System.out.println(s1.equals(s2));// False 
		
		// equal ignore case 
		System.out.println(s1.equalsIgnoreCase(s2));
		
		
		//Trim 
		
		String p ="I am on train";
	    System.out.println("before trim : "+p);
		String p1=p.trim(); 
		System.out.println("after trim :"+p1);
		
		p.split(p1);  
	
		
		
		
		
	}

}
