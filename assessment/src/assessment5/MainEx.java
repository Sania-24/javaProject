package assessment5;
public class MainEx
{
public static void main(String[] args) {
    display();  //calling without object
    MainEx t = new MainEx();
    t.show();  //calling using object
  }

  static void display() {
    System.out.println("Programming is amazing.");
  }
 
  void show(){
    System.out.println("Java is awesome.");
  }
}
