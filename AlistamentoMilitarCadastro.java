package Aplication;

import java.util.Scanner;

import Entities.AlistamentoMilitar;


public class AlistamentoMilitarCadastro {

	public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
		    
		    AlistamentoMilitar alistamento = new AlistamentoMilitar(0, 0, 0);
		    alistamento.soldados(sc);
		   
		    sc.close();
			
			}
		


	
}

