package logical_sessions;

import java.util.Scanner;
// 0 1 1 2 3 5 7 
public class FibSeries2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("How many terms?");
	int size=sc.nextInt();
	int num1=0;
	int num2=1;
	int sum=0;
	System.out.print(num1+" ");
	for (int i = 0; i <=size-2 ; i++) {
		sum=num1+num2;
		if (i%2==1) {
			System.out.print(sum);
			num1=num2;
			num2=sum;
		}
	}
	
}
}
