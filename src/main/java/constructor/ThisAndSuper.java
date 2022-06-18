package constructor;

class Parent{
	Parent(){
	 
		System.out.println("Parent deafault constaructor");
	}
	Parent(int i){
		//this();
		System.out.println("Parent parameterized constaructor");
	}
}
public class ThisAndSuper extends Parent{
	ThisAndSuper(){
		this(10);
		System.out.println("child deafult constructor");
	}
	ThisAndSuper(int j){
		//super();
		System.out.println("child parameterized  constructor");
	}

//public class ThisAndSuper {

	public static void main(String[] args) {
		ThisAndSuper c =new ThisAndSuper();
		

	}

}
