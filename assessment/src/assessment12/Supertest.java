package assessment12;
class area{  
area()
{
	System.out.println("area is created");
	}  
}  
class square extends area{  
square(){  
super();  
System.out.println("area of square is created");  
}  
}  
class Supertest{  
public static void main(String args[]){  
square d=new square();  
}
}  

