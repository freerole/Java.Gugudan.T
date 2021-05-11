package gugudan;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
//		System.out.println("출력할 구구단은?");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		
//		System.out.println(number * 1);
//		System.out.println(number * 2);
//		System.out.println(number * 3);
//		System.out.println(number * 4);
//		System.out.println(number * 5);
//		System.out.println(number * 6);
//		System.out.println(number * 7);
//		System.out.println(number * 8);
//		System.out.println(number * 9);
		
		System.out.println("구구단 중 출력할 단수를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("사용자가 입력한 값: " + number);
		if(number <= 1) {
			System.out.println("값을 잘 못 입력하셨습니다.");
		}else if(number > 9) {
			System.out.println("값을 잘 못 입력하셨습니다.");
		}else {
			System.out.println("*" + number + "단");
			for(int i = 1; i <= 9; i++) {
				System.out.print(number * i + "  ");	
			}
		}
	}
}
