package flowcontrolls;

public class NestedForLoop {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=i;j++)
			{
				System.out.println(i+"  x "+j+"  =  "+(i*j));
			}
		}
	}

}