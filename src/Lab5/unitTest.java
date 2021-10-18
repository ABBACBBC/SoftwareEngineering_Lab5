package Lab5;
import java.text.DecimalFormat;
import java.util.*;

public class unitTest {
	public static void main(String[] args) {
		int grade=0,number=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your grade?");
		grade=sc.nextInt();
		System.out.println("Please enter the number of questions?");
		number=sc.nextInt();
		calculate(grade,number);
		sc.close();
	}
	
	
	public static void calculate(int grade,int number)
	{
		double result=0,answer=0;
		int right=0;
		if(grade == 1 || grade == 2)
		{
			for(int i=0;i<number;i++) 
			{
				Scanner sc=new Scanner(System.in);
				result = grade12();
				answer=sc.nextDouble();
				if(answer == result)
				{
					right++;
				}
				sc.close();
			}
		}
		else if(grade == 3 || grade == 4)
		{
			for(int i=0;i<number;i++) 
			{
				Scanner sc=new Scanner(System.in);
				result = grade34();
				answer=sc.nextDouble();
				if(answer == result)
				{
					right++;
				}
				sc.close();
			}
		}
		else if(grade == 5 || grade == 6)
		{
			for(int i=0;i<number;i++) 
			{
				Scanner sc=new Scanner(System.in);
				result = grade56();
				answer=sc.nextDouble();
				if(answer == result)
				{
					right++;
				}
				sc.close();
			}
		}
		if(right == number)
		{
			System.out.println("end! All right, that's great! Your score is 100.");
		}
		else
		{
			System.out.println("end! Wrong question, your score is "+100*right/number);
		}
	}
	
	public static double grade12() {
		int first=(int)(Math.random()*100);
		int second=(int)(Math.random()*100);
		int sym=(int)(Math.random());
		int result = 0;
		if(sym==0) {
			result=first+second;
			System.out.println(first+"+"+second+"=?");
		}
		else if(sym==1){
			result=first-second;
			System.out.println(first+"-"+second+"=?");
		}
		double r=(double)result;
		System.out.println("当前计算机保存的随机后的结果是："+r);
		return r;

		}

	
	public static double grade34() {
		int opr = (int) (Math.random() * 3);
		int a = (int) (Math.random() * 500);
		int b = (int) (Math.random() * 500);
		double res = 0;
		String res1 = "";
		if (opr == 0) {
			System.out.println(a + "+" + b + "=?");
			res = a + b;
		} else if (opr == 1) {
			System.out.println(a + "-" + b + "=?");
			res = a - b;
		} else if (opr == 2) {
			System.out.println(a + "*" + b + "=?");
			res = a * b;
		} else {
			System.out.println(a + "/" + b + "=?");
			if (b == 0) {
				while (b == 0) {
					b = (int) (Math.random() * 500);
				}
			}
			res = (double) a / b;
			res1 = String.format("%.2f", res);
			res = Double.parseDouble(res1);
		}
		System.out.println("当前计算机保存的随机后的结果是："+res);

		return res;
	}
	
	
	public static double grade56(){

		double result = 0;
		
		DecimalFormat df = new DecimalFormat( "0.00" );
		double d1=Math.random() * 100;
	    String str1=df.format( d1 );
	    double d2=Math.random() * 100;
    	String str2=df.format( d2 );
		
		int sym = (int) (Math.random() * 4);
		if(sym==0) {
			System.out.println(str1+ "+" +str2+ "=?");
			double result_pre= Double.parseDouble(str1) + Double.parseDouble(str2);
			String result_num=df.format( result_pre );
			result= Double.parseDouble(result_num);
		}else if(sym==1){
			System.out.println(str1+ "-" +str2+ "=?");
			double result_pre= Double.parseDouble(str1) - Double.parseDouble(str2);
			String result_num=df.format( result_pre );
			result= Double.parseDouble(result_num);
		}else if(sym==2){
			System.out.println(str1+ "*" +str2+ "=?");
			double result_pre= Double.parseDouble(str1) * Double.parseDouble(str2);
			String result_num=df.format( result_pre );
			result= Double.parseDouble(result_num);
		}else{
			System.out.println(str1+ "/" +str2+ "=?");
			double result_pre= Double.parseDouble(str1) / Double.parseDouble(str2);
			String result_num=df.format( result_pre );
			result= Double.parseDouble(result_num);
		}
		System.out.println("当前计算机保存的随机后的结果是："+result);

		return result;
	}
}