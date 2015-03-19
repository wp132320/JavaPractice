package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		int t_l1 = 9, t_l2 = 10, p_l = 9;
		double t_h = 5.8, p_h = 5.4;
		double trapezoid = (t_l1+t_l2) * t_h / 2;
		double parallelogram = p_l * p_h;
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : " + trapezoid);
		System.out.println("평행사변형 넓이 : " + parallelogram);
		if(trapezoid > parallelogram)
			System.out.println("사다리꼴이 평행사변형 보다 " + (trapezoid - parallelogram) + " 더 큽니다.");
		else if(trapezoid == parallelogram)
			System.out.println("사다리꼴과 평행사변형의 넓이가 같습니다.");
		else if(trapezoid < parallelogram)
			System.out.println("평행사변형이 사다리꼴 보다 " + (parallelogram - trapezoid) + " 더 큽니다.");
	}

}
