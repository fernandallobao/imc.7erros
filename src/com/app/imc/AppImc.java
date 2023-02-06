package com.app.imc;

import javax.swing.JOptionPane;

public class AppImc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instancia objeto
		Pessoa = new Pessoa();
		
		// Declara��o de vari�veis
		
		// Declara��o de array
		
		// Algoritmo
		do {
			// Recebe os valores do usu�rio
			valorAltura = JOptionPane.showInputDialog("Informe a altura (em metros):");
			valorPeso = JOptionPane.showInputDialog("Informe o peso (em kg):");
			
			// Troca a v�rgula por ponto
			valorAltura = valorAltura.replace(",", ".");
			valorPeso = valorPeso.replace(",", ".");
			
			// Retorna o IMC e a sa�de do usu�rio
			JOptionPane.showMessageDialog(null, "IMC: " + String.format("%.2f", usuario.calcularPeso(Double.parseDouble(valorAltura), Double.parseDouble(valorPeso))) + ".\n" + usuario.retornarImc());
			
			// Mostra as op��es para o usu�rio
			desejaContinuar = JOptionPane.showInputDialog(null, "Deseja Continuar?", "Continuar", JOptionPane.INFORMATION_MESSAGE, null, continuar, continuar[0]);
		} while (desejaContinuar == "Continuar");
		
		// Encerrar o programa
		System.exit(0);

	}

}
