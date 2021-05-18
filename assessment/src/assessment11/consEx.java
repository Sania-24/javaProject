package assessment11;

class consEx{ 
	int id;
	String name;
	String college;
	//creating a default constructor  
	consEx(){
		System.out.println("Default constructor is created");
	}
	 consEx(String s){
		college=s;
	}
	 void display() {
		System.out.println(college);
	}
	 consEx(int i, String n){
		id=i;
		name=n;
	}
	 void disp() {
		System.out.println(id+" "+name);
	}
	//main method  
	public static void main(String args[]){  
	//calling a default constructor  
	consEx a=new consEx();
	consEx b=new consEx("sree chaitanya college of engineering"); 
	consEx c=new consEx(101,"sania");
	b.display();
	c.disp();
	//a.disp();
	//b.disp();
	}  
	}  
