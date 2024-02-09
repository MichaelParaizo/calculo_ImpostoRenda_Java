import java.util.Locale;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);

		Scanner sc = new java.util.Scanner(System.in);

		
		System.out.print("Renda anual com sal�rio: ");
		double salarioAnual = sc.nextDouble();
		System.out.printf("Renda anual com presta��o de servi�o: ");
		double rendaAnualPrestacaoServico = sc.nextDouble();
		System.out.printf("Renda anual com ganho de capital: ");
		double rendaAnualGanhoCapital = sc.nextDouble();
		System.out.printf("Gastos m�dicos: ");
		double gastosMedicos = sc.nextDouble();
		System.out.printf("Gastos educacionais: ");
		double gastosEducacionais = sc.nextDouble();
		
		System.out.println("-----------------------------");
		System.out.println("RELAT�RIO DE IMPOSTO DE RENDA");
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
			System.out.printf("Imposto sobre sal�rio: %.2f%n",salarioAnual);
			
		}else if (salarioMensal > 5000) {
			
			salarioAnual*=0.2;
			System.out.printf("Imposto sobre sal�rio: %.2f%n",salarioAnual);
		}
//-------------------------------------------------------------------------------		
		
		if(rendaAnualPrestacaoServico == 0) {
			
			System.out.printf("Imposto sobre servi�os: %.2f%n", rendaAnualPrestacaoServico);
			
		}else {
			
			rendaAnualPrestacaoServico*=0.15;
			System.out.printf("Imposto sobre servi�os: %.2f%n", rendaAnualPrestacaoServico);
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
	System.out.println("DEDU��ES: ");
	System.out.println("-----------------------------");
	System.out.println();
	
	double maxDedutive = salarioAnual + rendaAnualGanhoCapital + rendaAnualPrestacaoServico ;
	
	maxDedutive *=0.3; 
	System.out.printf("M�ximo dedut�vel: %.2f%n", maxDedutive);
	
	double gastosDedutivel= gastosMedicos+gastosEducacionais;
	
	System.out.printf("Gastos dedut�veis: %.2f%n", gastosDedutivel);
	
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
