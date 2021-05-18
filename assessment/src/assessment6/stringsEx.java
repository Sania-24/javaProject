package assessment6;

public class stringsEx {
   public static void main(String args[])
   {
	   String s1="java";//creating string by java string literal  
	   String s0="JAVA";
	   char ch[]={'s','t','r','i','n','g','s'};  
	   String s2=new String(ch);//converting char array to string  
	   String s3=new String("sania mirza");//creating java string by new keyword 
		   String s="java"+" programming";
		   int index1=s3.indexOf("sania");//returns the index of is substring  
		   int index2=s3.indexOf("mirza");//returns the index of index substring  
		   System.out.println(index1+"  "+index2);
		   System.out.println(s);   
	       System.out.println(s1);  
	       System.out.println(s2);  
	       System.out.println(s3);
	       System.out.println("string length is: "+s.length());//6 is the length of string 
	       System.out.println(s1.substring(1));//returns ava 
	       System.out.println(s1.compareTo(s2)); //-9 because "j" is 9 times lesser than "s"
	       System.out.println(s1.equals(s)); 
	       System.out.println(s1.equalsIgnoreCase(s0));
	       System.out.println(s1.startsWith("s"));  
	       System.out.println(s1.endsWith("a"));  
	       System.out.println(s.trim()+"language");//with trim()  
	       String replaceString=s1.replace('a','e');//replaces all occurrences of 'a' to 'e'  
	       System.out.println(replaceString);  
	       String[] words=s.split("\\s");//splits the string based on whitespace  
	       for(String w:words){  
	    	   System.out.println(w);  
	    	   }  
	       int i=200;  
	       String n=String.valueOf(i);  
	       System.out.println(i+100);//300 because + is binary plus operator 
	       String s3upper=s3.toUpperCase();  
	       System.out.println(s3upper);
	       String s0lower=s0.toLowerCase();  
	       System.out.println(s0lower);  



   }
}
