package com.prueba.aldeamo.util;

import java.util.ArrayList;
import java.util.List;

public class Utils {

	public static int[] primos = {2,3,5,7, 11, 13, 17, 19, 23, 29, 31};
	
	public static void main(String[] args) {

		List<Integer> i = getPrimos();
		for (int j : i) {
			System.out.println(j);
		}
	}

	public static List<Integer> getPrimos() {
		int numero, divisor = 2;
		boolean esPrimo = true;
		List<Integer>listaPrimos = new ArrayList<>();
		numero = 30;
		numero--;
		while (esPrimo && divisor <= numero) {
			esPrimo = numero % divisor != 0;
			divisor++;
			if (esPrimo == true) {
				listaPrimos.add(numero);
				divisor = 2;
				numero--;
			}else {
				esPrimo=true;
				divisor = 2;
				numero--;
			}
		}
		return listaPrimos;
	}

}
