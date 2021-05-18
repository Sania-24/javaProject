package assessment13;
class Adder{  
static int add(int a,int b){
	return a+b;
	}  
static int add(int a,int b,int c){
	return a+b+c;
	}
static double add(double a,double b) {
	return a+b;	
}
static float add(float a,float b) {
	return a+b;	
}
}  
class testoverload{  
public static void main(String[] args){  
System.out.println(Adder.add(10,10));  
System.out.println(Adder.add(12,20,12)); 
System.out.println(Adder.add(12,20.25)); 
System.out.println(Adder.add(12.5,0.25)); 
System.out.println(Adder.add(1.5,2.5)); 

}
}
