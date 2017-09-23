import java.util.Scanner;


public class first {
	public static  void doSome(int n){
		if(n>5000){
			System.out.println(n);	
			System.out.println(n);	
			return;				
		}else{
			System.out.println(n);
			doSome(2*n);
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		doSome(scan.nextInt());
	}
}
