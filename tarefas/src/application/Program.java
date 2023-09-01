package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Rectangle rectangle = new Rectangle(); 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cauculo de area");
		System.out.print("Qual e a largura do retangulo??");
		rectangle.width = sc.nextDouble();
		
		System.out.println();
		
		System.out.print("Qual e a altura do retangulo??");
		rectangle.height = sc.nextDouble();
		
		
		System.out.printf("A área do retangulo e de %.2f \n" , rectangle.area());
		System.out.printf("O perímetro do retangulo e de %.2f \n", rectangle.perimeter());
		System.out.printf("A diagonal do retangulo e de %.2f \n", rectangle.diagonal());
		
	}

}
