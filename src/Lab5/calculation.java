package Lab5;

import java.text.DecimalFormat;

public class calculation {
	public static void main(String args[]) {

	}

	public static double grade12() {
		int first = (int) (Math.random() * 100);
		int second = (int) (Math.random() * 100);
		int sym = (int) (Math.random());
		int result = 0;
		if (sym == 0) {
			result = first + second;
			System.out.println(first + "+" + second + "=?");
		} else if (sym == 1) {
			result = first - second;
			System.out.println(first + "-" + second + "=?");
		}
		double r = (double) result;
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
			System.out.print(str1+ "+" +str2+ "=?");
			double result_pre= Double.parseDouble(str1) + Double.parseDouble(str2);
			String result_num=df.format( result_pre );
			result= Double.parseDouble(result_num);
		}else if(sym==1){
			System.out.print(str1+ "-" +str2+ "=?");
			double result_pre= Double.parseDouble(str1) - Double.parseDouble(str2);
			String result_num=df.format( result_pre );
			result= Double.parseDouble(result_num);
		}else if(sym==2){
			System.out.print(str1+ "*" +str2+ "=?");
			double result_pre= Double.parseDouble(str1) * Double.parseDouble(str2);
			String result_num=df.format( result_pre );
			result= Double.parseDouble(result_num);
		}else{
			System.out.print(str1+ "/" +str2+ "=?");
			double result_pre= Double.parseDouble(str1) / Double.parseDouble(str2);
			String result_num=df.format( result_pre );
			result= Double.parseDouble(result_num);
		}
		
		return result;
	}

}
