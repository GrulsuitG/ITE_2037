package homework3;


public class homework3 {
	
	public void pass(int num1, int num2, int num3)
	{
		int ave = (num1 +num2 +num3)/3;
		if(ave >=60)
			System.out.println("합격입니다.");
		else
			System.out.println("불합격입니다.");
	}
	
	public boolean pass1(int num1, int num2, int num3)
	{
		int ave = (num1 + num2 + num3)/3;
		if(ave >= 60)
			return true;
		else
			return false;
	}
	
	public String pass2(int num1, int num2, int num3)
	{
		int ave= (num1 + num2 + num3)/3;
		if(ave>= 60)
			return "합격";
		else
			return "불합격";
	}
	
	
	public static void main(String[] args) {
		
		int num1= 90, num2 = 80, num3 = 90;
		homework3 hw = new homework3();
		hw.pass(num1, num2, num3);
		
		if(hw.pass1(num1, num2, num3))
			System.out.println("합격입니다.");
		else	
			 System.out.println("불합격입니다.");
		System.out.println(hw.pass2(num1,num2,num3)+"입니다.");
		
	}

}
