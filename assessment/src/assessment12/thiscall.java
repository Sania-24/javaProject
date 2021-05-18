package assessment12;

class A{  
A(){
	System.out.println("hello ");
}  
A(int x){  
this();  
System.out.println(x);  
}  
}  
class thiscall{  
public static void main(String args[]){  
A a=new A(10);  
}
}  

