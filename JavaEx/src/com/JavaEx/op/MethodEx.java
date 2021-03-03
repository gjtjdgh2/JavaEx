package com.JavaEx.op;

public class MethodEx {

	public static void main(String[] args) {
		printDivide(5,2);
		printDivide(5,0);
		printDivide(5,1);
		double reseult = getSum(4,6);
		System.out.println("4+6= "+reseult);
		
		System.out.println("getsum: "+getsum(new double[] {
				1,2,3,4,5,6,7,8,9
		}));
		System.out.println("getSumma: "+getSumma(1,2,3,4,5,6,7,8,9));
	}
	
	private static double getSumma(double ...values) {
		return getsum(values);
	}
	
	//매개변수 개수를 모를때
	private static double getsum(double[] values) {
		double total =0;
		for(double value: values) {
		total += value;
		}
		return total;
	}
	private static double getSum(double num1,double num2) {
		return num1+num2;
	}
	
	
	//바환값을 void 로 설정
	private static void printDivide(int num1, int num2) {
		if(num2==0) {
			System.out.println("0으로 나눌수 없다");
			return;//return 문을 만나면 남은 문장은 수행 하지 않는다
		}
		System.out.println(num1/num2);
	}
}
