package assessment11;

class Super {
    String s;
 
    public Super(){
    	System.out.println("Super");
    }
}
class subsuper extends Super {
 
    public subsuper(){
    	System.out.println("Sub");
    }
 
    public static void main(String[] args){
    	subsuper s = new subsuper();
    	//s.super();
    }
}

