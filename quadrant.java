import java.util.Scanner;

public class pr1008 {

	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	
	int x;
	int y;
	System.out.print("x값을 입력하세요 : ");
	x = sc.nextInt();
	System.out.print("y값을 입력하세요 : ");
	y = sc.nextInt();

	if(x >= 0 && y>=0) {
		System.out.println("2");
	}
	else if(x <0 && y>=0) {
		System.out.println("1");
	}
	else if(x >=0 && y < 0) {
		System.out.println("4");
	}
	else {
		System.out.println("3");
	}
	}

}
