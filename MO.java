class MO {
	static double add(double num1,double num2){
		return num1+num2;
	}
	static double sub(double num1,double num2){
		return num1-num2;
	}
	static double mul(double num1,double num2){
		return num1*num2;
	}
	static double div(double num1,double num2){
		return num1/num2;
	}
	static int rem(int num1,int num2){
		return num1%num2;
	}
	static double max(double num1,double num2){
		if(num1>num2)
		return num1;
		else
		return num2;
	}
	static double min(double num1,double num2){
		if(num1<num2)
		return num1;
		else
		return num2;
	}
	static boolean isEven_Odd(int num){
		if(num%2==0)
			return true;
		return false;
	} 
	static boolean isPalindrome(int num){
		int n=num;
		int rev=0;
		while(num!=0){
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		if(n==rev)
			return true;
		return false;

	}
	static boolean isStrong(int num){
		int n=num;
		int res=0;
		while(num!=0){
			int rem=num%10;
			res+=fact(rem);
			num/=10;
		}
		if(res==n)
				return true;
		return false;
	}
	static int fact(int num){
		int res=1;
		while(num!=0){
			res*=num;
			num--;
		}
		return res;

	}


}
