package inteiroFamilia;

import java.util.Scanner;

public class IrmaoDeUmInteiro {

	static int maiorIrmao(int numero){
		if(numero > 100000000 || numero <= 0){
			return -1;
		}
		
		if(numero < 11 ) {
			return numero;
		}
		
		String separador = Integer.toString(numero);
		int organizador[] = new int[separador.length()];
		
		for(int i = 0; i < organizador.length; ++i) { 
			organizador[i] = Character.getNumericValue(separador.charAt(i));
		}
		
		//bubble short decrescente
		int aux = 0;
		for(int i=0; i<organizador.length; i++) {
			for(int j = 0; j<organizador.length-1; j++){
				if(organizador[j] < organizador[j + 1]){
					aux = organizador[j];
					organizador[j] = organizador[j+1];
					organizador[j+1] = aux;
				}
			}
		}

		separador = "";
		StringBuilder unirNumeros = new StringBuilder(separador);
		
		for(int i=0; i<organizador.length; i++) {
			unirNumeros.insert(i, organizador[i]);
		}
		
		numero = Integer.parseInt(unirNumeros.toString());
		
		return numero;
	}
	
	 public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int teste = scan.nextInt();
		 System.out.println(maiorIrmao(teste));
		 scan.close();
	}
}
