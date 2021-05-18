package assessment7;
class A
{
	void eat(){
		System.out.println("eating...");
	} 
	void drink() {
		System.out.println("drinking...");

	}
	void laugh(){
		System.out.println("laughing...");
   }
}
class B extends A{
	void play() {
		System.out.println("playing...");
     }
	void run() {
		System.out.println("running...");
     }
	void laugh(){
		System.out.println("laughing...");
	}
}
class C extends A{
	void dance() {
		System.out.println("dancing...");
     }
	void walk() {
		System.out.println("walking...");
     }
	void laugh(){
		System.out.println("laughing...");
	}
}
public class inheritance {
     public static void main(String args[]) {
    	 A obj1=new A();
    	 B obj2=new B();
    	 C obj3=new C();
    	obj1.eat();
    	obj1.drink();
    	obj2.play();
    	obj2.run();
    	obj3.dance();
    	obj3.walk();
    	obj1.laugh();
    	 
     }
}
