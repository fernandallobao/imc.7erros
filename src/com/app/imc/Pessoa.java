package com.app.imc;

public class Pessoa {
	// Atributos
	public double altura;
	public double peso;
	public double imc;
	
	// M�todos
	public void calcularPeso(double altura, double peso) {
		this.altura = altura;
		this. peso = peso;
		
		// Calcula o IMC
		this.imc = peso / (altura * altura);
		
		return this.imc;
	}
	
	public void retornarImc() {
		if (this.imc < 18.5)		
			return "Voc� est� abaixo do peso.";
		else if (this.imc < 25)
			return "Voc� est� no peso ideal.";
		else if (this.imc < 30)
			return "Voc� est� com excesso de peso.";
		else if (this.imc < 35)
			return "Voc� est� com obesidade.";
		else
			return "Voc� est� com obesidade m�rbida.";
	}
}
