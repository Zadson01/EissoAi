package Entities;

import java.util.Scanner;

public class AlistamentoMilitar {


	private int ano;
	private double telefone;
	private double altura;
	private double peso;
	private double nascimento;
	private String nome;
	private String mae;
	private String pai;
	private String email;
	
	// Construtor Nomes
	public AlistamentoMilitar(String nome, String mae,  String pai, String email) {
		this.nome = nome;
		this.mae = mae;
		this.pai = pai;
		this.email = email;
	}
	
	//Constutor DadosNúmericos
	public AlistamentoMilitar( double telefone, double altura, double peso) {
		this.telefone = telefone;
		this.altura = altura;
		this.peso = peso;
	}
	//Calculo para somar a multa
	public void ano(double ano) {
		ano += nascimento  * 5.00;
		
	}
	
	//Métodos GET e SET 
	public int getAno() {
		return ano;
	}
	public double getTelefone() {
		return telefone;
	}
	public double getAltura() {
		return altura;
	}
	public double getPeso() {
		return peso;
	}
	public String getNome() {
		return nome;
	}
	public String getMae() {
		return mae;
	}
	public String getPai() {
		return pai;
	}
	public String getEmail() {
		return email;
	}
	public void soldados(Scanner sc) {
		System.out.println("Informe a data de nascimento: ");
		this.nascimento = sc.nextDouble();
		System.out.println("Informe o nome: ");
		this.nome = sc.next();
		System.out.println("Nome da maê: ");
		this.mae = sc.next();
		System.out.println("Informe telefone para contato: ");
		this.telefone = sc.nextDouble();
		System.out.println("Informe o e-mail: ");
		this.email = sc.next();
		System.out.println("Informe a altura: ");
		this.altura = sc.nextDouble();
		System.out.println("Informe o peso: ");
		this.peso = sc.nextDouble();
		
		
	}
	
	
}
