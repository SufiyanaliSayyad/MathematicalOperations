import java.util.Scanner;
class MathematicalOperation{
	static boolean flag=true;
	static double a,b;
	static int num;
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Choose the operation which you want to perform");
		System.out.println("1. Arithmatic operation");
		System.out.println("2. Max and Min of two numbers");
		System.out.println("3. Verifying a number is even or not");
		System.out.println("4. Is a number palindrome number or not");
		System.out.println("5. Is a number strong number or not");
		System.out.println("6. Factorial of a number");
		System.out.println("7. Exit");
		while(flag==true){
		System.out.println("Enter your choice");
		int option=scn.nextInt();scn.nextLine();
		if(option==1 || option==2){
			System.out.println("Enter Fno");
			 a=scn.nextDouble();scn.nextLine();
			System.out.println("Enter Sno");
			 b=scn.nextDouble();scn.nextLine();
		}else if(option<7){
			System.out.println("Enter a number of Integer type");
			num =scn.nextInt();scn.nextLine();
		}
		
		
		 switch(option){
			case 1:
				System.out.println("Choose the operation which you want to perform");
				System.out.println("1. Addition");
				System.out.println("2. Substraction");
				System.out.println("3. Multiplication");
				System.out.println("4. Division");
				System.out.println("5. Remainder");
				System.out.println("Choose an option");
				option=scn.nextInt();scn.nextLine();
				switch(option){
					case 1:
						System.out.printf("The addition of %f and %f is %f\n",a,b,MO.add(a,b));
						break;
					case 2:
						System.out.printf("The Substraction of %f and %f is %f\n",a,b,MO.sub(a,b));
						break;
					case 3:
						System.out.printf("The Multiplication of %f and %f is %f\n",a,b,(MO.mul(a,b)));
						break;
					case 4:
						System.out.printf("The Division of %f and %f is %f\n",a,b,MO.div(a,b));
						break;
					case 5:
						System.out.printf("The Remainder of %d and %d is %d\n",(int)a,(int)b,MO.rem((int)a,(int)b));
						break;
					default:	
						System.out.println("Invalid option");
				}
				break;
			case 2:
				System.out.println("1. Max number");
				System.out.println("2. Min number");
				option=scn.nextInt();scn.nextLine();
				switch(option){
					case 1:
						System.out.printf("%f is the maximum number b/w %f and %f\n",MO.max(a,b),a,b);
						break;
					case 2:
						System.out.printf("%f is the minimum number b/w %f and %f\n",MO.min(a,b),a,b);
						break;
					default:	
						System.out.println("Invalid option");
				}
				break;
			case 3:
				System.out.printf("1. Even\t");
				System.out.printf("2. Odd:\t");
				option=scn.nextInt();scn.nextLine();
				switch(option){
					case 1:
						System.out.printf("%d  is Even: %b\n",num,MO.isEven_Odd(num));
						break;
					case 2:
						System.out.printf("%d  is Even: %b\n",num,MO.isEven_Odd(num));
						break;
					default:	
						System.out.println("Invalid option");
				}
				break;

			case 4:
				System.out.printf("%d isPalindrome: %b\n",num,MO.isPalindrome(num));
				break;
			case 5:
				System.out.printf("%d isStrong: %b\n",num,MO.isStrong(num));
				break;
			case 6:
				System.out.printf("The factorial of %d is: %d\n",num,MO.fact(num));
				break;
			case 7:
				flag=false;
				break;
			default:
				System.out.println("Invalid option");
				
		 }
		}				
	}
}
