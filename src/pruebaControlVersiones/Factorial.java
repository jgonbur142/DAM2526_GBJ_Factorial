package pruebaControlVersiones;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int num=0;
		pedirNumero(num);
		
        if (num < 0) {
            System.out.println("ERROR: el número debe ser mayor o igual que 0.");
        } else {
            System.out.println("Has introducido el número: " + num);
        }
       
        System.out.println("RESULTADO - El factorial del número " + num + " es " + factorialRec(num));

        
	}
	
	static int pedirNumero(int num) {
		Scanner sc = new Scanner(System.in);

		boolean valido;

	    do {
	        System.out.print("Introduce un número entero mayor o igual que 0: ");
	        if (sc.hasNextInt()) {
	            num = sc.nextInt();
	            valido = true;
	        } else {
	            System.out.println("Entrada no válida. Introduce un entero.");
	            sc.next();
	            valido = false;
	            num = -1;
	        }
	    } while (!valido);

	    return num;
	}
	
	private static long factorialBucle(int num) {
		int aux=0;
		int falseNum = num;
		
		if (num==0 || num==1) {
			return 1;
		
		}else {
			while (falseNum!=0 || falseNum!=1)
				aux+=1;
				falseNum--;
		}
		
		return num*=aux;
	}
	
	/**
	 * Calcula el factorial de un número utilizando un enfoque recursivo.
	 *
	 * @param n Número entero del que se quiere obtener el factorial.
	 * @return Factorial de n, calculado mediante recursividad.
	 */
	private static long factorialRec(int n) {
	    if (n == 0 || n == 1) {
	      return 1;
	    }

	    return n * factorialRec(n - 1);
	}

}