import java.util.Scanner;

public class CubeOfTheNumber{
	public static void main(String args[]){
		//This is git commit file im stallionRunner...
		Scanner Input=new Scanner(System.in);
		int i=1;
		System.out.print("Input number of terms : ");
		int num=Input.nextInt();
		System.out.print("\n");
		
		while(i<=num){
			System.out.print("Number is : " + i + " and cube of " + i + " is : " + (i*i*i));
			System.out.print("\n\n");
			i++;
		}
	}
}