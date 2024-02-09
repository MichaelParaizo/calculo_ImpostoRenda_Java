import java.util.Locale;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		int y = 32;
//		double x = 10.35784;
//		
//		System.out.println(y);
//		System.out.println("Bom dia");
//		
//		System.out.printf("%.2f%n",x);
//		System.out.printf("%.4f%n",x);
//		Locale.setDefault(Locale.US);
//		System.out.printf("%.4f%n",x);
//		System.out.println("RESULTADO = " + x + " METROS");
//		System.out.printf("RESULTADO = %.2f metros%n", x );

//		String product1 = "Computer";
//		String product2 = "Office desk";
//		
//		int age = 30;
//		int code = 5290;
//		char gender = 'F';
//		
//		double price1 = 2100.0;
//		double price2 = 650.50;
//		double measure = 53.234567;
//		
//		System.out.println("Products:");
//		System.out.printf("%s, which price is $ %.2f %n ", product1,price1);
//		System.out.println(product2 + "," + " which price is " + price2);
//		System.out.println("\n");
//		System.out.printf("Record: %d years old, code %d and gender: %c %n", age,code,gender);
//		System.out.println("\n");
//		System.out.printf("Measue with eight decimal places: %.8f %n", measure);
//		System.out.printf("Rouded: %.3f %n", measure);
//		Locale.setDefault(Locale.US);
//		System.out.printf("Rouded: %.3f", measure);

		Locale.setDefault(Locale.US);

		Scanner sc = new java.util.Scanner(System.in);

//		String x;
//		x = sc.next();
//		System.out.println("Voce digitou " + x);
//		
//		int y;
//		y = sc.nextInt();
//		System.out.println("Voce digitou " + y);

//		double z;
//		z = sc.nextDouble();
//		System.out.printf("Voce digitou: %.2f%n ", z);

//		char w;
//		w = sc.next().charAt(0);
//		System.out.println("Voce digitou: " + w);

//		String a;
//		int b;
//		double c;
//
//		a = sc.next();
//		b = sc.nextInt();
//		c = sc.nextDouble();
//
//		System.out.println("Dados digitados: ");
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
				
//		double pi = 3.14159;
//		double raio;
//		
//		System.out.printf("Digite o valor do raio do circulo: ");
//		raio = sc.nextDouble();
//		System.out.println();
//		double area = pi*Math.pow(raio, 2.0);
//		System.out.printf("AREA = %.3f", area);
		
	
	

		
		System.out.print("Renda anual com salário: ");
		double salarioAnual = sc.nextDouble();
		System.out.printf("Renda anual com prestação de serviço: ");
		double rendaAnualPrestacaoServico = sc.nextDouble();
		System.out.printf("Renda anual com ganho de capital: ");
		double rendaAnualGanhoCapital = sc.nextDouble();
		System.out.printf("Gastos médicos: ");
		double gastosMedicos = sc.nextDouble();
		System.out.printf("Gastos educacionais: ");
		double gastosEducacionais = sc.nextDouble();
		
		System.out.println("-----------------------------");
		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
		System.out.println("-----------------------------");
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println("CONSOLIDADO DE RENDA: ");
		System.out.println("-----------------------------");
		System.out.println();
		
		double salarioMensal = salarioAnual/12; 
		
//------------------------------------------------------------------------
		if(salarioMensal < 3000) {
			
			System.out.println("ISENTO");
			
		}else if(salarioMensal >= 3000 && salarioMensal <= 5000 ) {
			
			salarioAnual *=0.1; 
			System.out.printf("Imposto sobre salário: %.2f%n",salarioAnual);
			
		}else if (salarioMensal > 5000) {
			
			salarioAnual*=0.2;
			System.out.printf("Imposto sobre salário: %.2f%n",salarioAnual);
		}
//-------------------------------------------------------------------------------		
		
		if(rendaAnualPrestacaoServico == 0) {
			
			System.out.printf("Imposto sobre serviços: %.2f%n", rendaAnualPrestacaoServico);
			
		}else {
			
			rendaAnualPrestacaoServico*=0.15;
			System.out.printf("Imposto sobre serviços: %.2f%n", rendaAnualPrestacaoServico);
		}
		
//----------------------------------------------------------------------------------
		
	if(rendaAnualGanhoCapital == 0) {
			
			System.out.printf("Imposto sobre ganho de capital: %.2f%n", rendaAnualGanhoCapital);
			
		}else {
			
			rendaAnualGanhoCapital*=0.2;
			System.out.printf("Imposto sobre ganho de capital: %.2f%n", rendaAnualGanhoCapital);
		}
		
//----------------------------------------------------------------------------------------------		
	System.out.println("-----------------------------");
	System.out.println("DEDUÇÕES: ");
	System.out.println("-----------------------------");
	System.out.println();
	
	double maxDedutive = salarioAnual + rendaAnualGanhoCapital + rendaAnualPrestacaoServico ;
	
	maxDedutive *=0.3; 
	System.out.printf("Máximo dedutível: %.2f%n", maxDedutive);
	
	double gastosDedutivel= gastosMedicos+gastosEducacionais;
	
	System.out.printf("Gastos dedutíveis: %.2f%n", gastosDedutivel);
	
//----------------------------------------------------------------------------------------------
	System.out.println("-----------------------------");
	System.out.println("RESUMO: ");
	System.out.println("-----------------------------");
	System.out.println();
	double impostoBrutoTotal = salarioAnual + rendaAnualGanhoCapital + rendaAnualPrestacaoServico;
	System.out.printf("Imposto bruto total: %.2f%n", impostoBrutoTotal);
	
	if (maxDedutive < gastosDedutivel) {
		System.out.printf("Abatimento: %.2f%n", maxDedutive);
		double impostoDevido = impostoBrutoTotal - maxDedutive;
		System.out.printf("Imposto devido: %.2f%n", impostoDevido);
		
	}else {
		System.out.printf("Abatimento: %.2f%n", gastosDedutivel);
		double impostoDevido = impostoBrutoTotal - gastosDedutivel;
		System.out.printf("Imposto devido: %.2f%n", impostoDevido);
	}

	

		sc.close();

	}

}
