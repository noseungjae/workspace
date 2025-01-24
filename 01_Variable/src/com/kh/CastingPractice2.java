package com.kh;

import java.util.Scanner;

public class CastingPractice2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double ko = sc.nextDouble();
		System.out.print("영어 : ");
		double en = sc.nextDouble();
		System.out.print("수학 : ");
		double ma = sc.nextDouble();
		
		System.out.println("총점 : " + (int)(ko + en + ma));
		System.out.println("평균 : " + (int)(ko + en + ma)/3);
		
		
		
		
		}

	}

	