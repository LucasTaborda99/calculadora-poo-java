package lucastaborda.com.github.programa;

import java.util.Locale;
import java.util.Scanner;
import lucastaborda.com.github.classes.Divisao;
import classes.Multiplicacao;
import classes.Soma;
import classes.Subtracao;


public class Main {
	
	public static Integer[] makeIntArrays(int qty) {
	    Integer[] intArr = new Integer[qty];
	    try (Scanner scan = new Scanner(System.in)) {
			for (int i = 0; i < qty; i++) {
			  System.out.println("Digite o " + (i + 1) + "° número: ");
			  intArr[i] = scan.nextInt();
			}
		}

	    return intArr;
	  }

	  public static Float[] makeFloatArrays(int qty) {
	    Float[] floatArr = new Float[qty];
	    try (Scanner scan = new Scanner(System.in)) {
			scan.useLocale(Locale.ENGLISH);

			for (int i = 0; i < qty; i++) {
			  System.out.println("Digite o " + (i + 1) + "° número: ");
			  floatArr[i] = scan.nextFloat();
			}
		}
	    return floatArr;
	  }

	  public static Double[] makeDoubleArrays(int qty) {
	    Double[] doubleArr = new Double[qty];
	    try (Scanner scan = new Scanner(System.in)) {
			scan.useLocale(Locale.ENGLISH);

			for (int i = 0; i < qty; i++) {
			  System.out.println("Digite o " + (i + 1) + "° número: ");
			  doubleArr[i] = scan.nextDouble();
			}
		}
	    return doubleArr;
	  }
	
	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    String confirmation;
	    boolean again = true;
	    String operation = "";
	    String typeSelection = "";
	    int qtySelection = 0;

	    do {
	      System.out.println("Seja bem-vindo ao Calcula já!");
	      System.out.println("Você deseja fazer uma soma, subtracao, multiplicacao ou divisao?");
	      operation = scan.next();

	      if (operation.equals("soma") ||
	          operation.equals("subtracao") ||
	          operation.equals("multiplicacao") ||
	          operation.equals("divisao")
	      ) {
	        again = false;
	      }

	    } while (again);

	    do {
	      System.out.println("Será uma " + operation + " de quantos números?(Mínimo de 2 números!)");
	      qtySelection = scan.nextInt();
	    } while (qtySelection < 2);

	    do {
	      System.out.println("Serão " + qtySelection + " números do tipo inteiro, float ou double?");
	      typeSelection = scan.next();

	      again = !typeSelection.equals("inteiro") &&
	          !typeSelection.equals("float") &&
	          !typeSelection.equals("double");
	    } while (again);


	    do {
	      double resultado = 0;

	      switch (operation) {
	      
			
			  case "soma": Soma soma = new Soma();
				  switch (typeSelection) {
				  case "inteiro":
		              resultado = (Integer) soma.calcula(makeIntArrays(qtySelection));
		              System.out.println("O resultado da divisao solicitada é " + ((int)resultado) + ".");
		              break;
		            case "float":
		              resultado = (Float) soma.calcula(makeFloatArrays(qtySelection));
		              System.out.println("O resultado da divisao solicitada é " + ((float)resultado) + ".");
		              break;
		            case "double":
		              resultado = (Double) soma.calcula(makeDoubleArrays(qtySelection));
		              System.out.println("O resultado da divisao solicitada é " + ((double)resultado) + ".");
		              break;
		          }
		          break;
			  
			  case "subtracao": 
				  Subtracao subtracao = new Subtracao(); 
				  switch (typeSelection) {
				  case "inteiro":
		              resultado = (Integer) subtracao.calcula(makeIntArrays(qtySelection));
		              System.out.println("O resultado da divisao solicitada é " + ((int)resultado) + ".");
		              break;
		            case "float":
		              resultado = (Float) subtracao.calcula(makeFloatArrays(qtySelection));
		              System.out.println("O resultado da divisao solicitada é " + ((float)resultado) + ".");
		              break;
		            case "double":
		              resultado = (Double) subtracao.calcula(makeDoubleArrays(qtySelection));
		              System.out.println("O resultado da divisao solicitada é " + ((double)resultado) + ".");
		              break;
		          }
		          break;
			  
			  case "multiplicacao": 
				  Multiplicacao multiplicacao = new Multiplicacao();
				  switch (typeSelection) {
			  case "inteiro":
	              resultado = (Integer) multiplicacao.calcula(makeIntArrays(qtySelection));
	              System.out.println("O resultado da divisao solicitada é " + ((int)resultado) + ".");
	              break;
	            case "float":
	              resultado = (Float) multiplicacao.calcula(makeFloatArrays(qtySelection));
	              System.out.println("O resultado da divisao solicitada é " + ((float)resultado) + ".");
	              break;
	            case "double":
	              resultado = (Double) multiplicacao.calcula(makeDoubleArrays(qtySelection));
	              System.out.println("O resultado da divisao solicitada é " + ((double)resultado) + ".");
	              break;
	          }
	          break;
			 

	        case "divisao":
	          Divisao divisao = new Divisao();
	          switch (typeSelection) {
	            case "inteiro":
	              resultado = (Integer) divisao.calcula(makeIntArrays(qtySelection));
	              System.out.println("O resultado da divisao solicitada é " + ((int)resultado) + ".");
	              break;
	            case "float":
	              resultado = (Float) divisao.calcula(makeFloatArrays(qtySelection));
	              System.out.println("O resultado da divisao solicitada é " + ((float)resultado) + ".");
	              break;
	            case "double":
	              resultado = (Double) divisao.calcula(makeDoubleArrays(qtySelection));
	              System.out.println("O resultado da divisao solicitada é " + ((double)resultado) + ".");
	              break;
	          }
	          break;

	        default:
	          System.out.println("Operação inválida. Tente novamente.");
	          again = true;
	      }
	    } while (again);
	  }
}
