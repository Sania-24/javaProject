package assessment10;

interface printable{  
void print();  
}  
class interfaceEx implements printable{  
public void print(){
	System.out.println("Hello world");
	}  
  
public static void main(String args[]){  
interfaceEx obj = new interfaceEx();  
obj.print();  
 }  
}  
