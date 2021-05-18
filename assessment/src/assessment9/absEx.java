package assessment9;

abstract class Shape{  
abstract void draw();
void nonAbs() {
	System.out.println("this a non abstract method");
}
}    
class Rectangle extends Shape{  
 void draw()
  {
	System.out.println("drawing rectangle");
  }  
}  
class Circle1 extends Shape{
	int x=10;
void draw(){
	System.out.println("drawing circle");
	System.out.println(x);
	}  
}  
class absEx{  
public static void main(String args[]){  
Shape s=new Circle1();
Shape s1=new Rectangle();
s1.draw();  
s.draw();
s1.nonAbs();
}  
}  

