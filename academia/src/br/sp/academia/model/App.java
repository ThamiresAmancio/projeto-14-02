package br.sp.academia.model;

import java.time.LocalDate;

import br.sp.academia.Aluno;


public class App {
	
 

	public static void main(String[] args) {

		Aluno alana = new Aluno();
		

		alana.setAltura(1.64);
		alana.setPeso(60);
		alana.setDataNascimento(LocalDate.of(2001, 9, 10));
		alana.getCalcularNcd();
		alana.setGenero("Feminino");
		alana.setNivelAtividade(NivelAtividade.leve2);
		
		System.out.println(alana.getNivelAtividade());
		System.out.println(alana.getCalcularNcd());
		System.out.println(alana.getIdade());
		System.out.println(alana.getCalcularImc());
		System.out.println(alana.getGenero());
		System.out.println(alana.getStatus());
		System.out.println("-------------------------------------------");
		
		Aluno alice = new Aluno();
		
		alice.setAltura(1.72);
		alice.setPeso(49);
		alice.setDataNascimento(LocalDate.of(2001, 2, 10));
		alice.getCalcularNcd();
		alice.setGenero("Feminino");
		alice.setNivelAtividade(NivelAtividade.leve2);
		
		System.out.println( alice.getNivelAtividade());
		System.out.println(alice.getCalcularNcd());
		System.out.println(alice.getIdade());
		System.out.println(alice.getCalcularImc());
		System.out.println(alice.getGenero());
		System.out.println(alice.getStatus());
		System.out.println("-------------------------------------------");
		
		
		
		Aluno emanuel  = new Aluno();
		
		emanuel.setNome("Emanuel");
		emanuel.setPeso(80);
		emanuel.setAltura(1.65);
		emanuel.setDataNascimento(LocalDate.of(1969, 11, 18));
		emanuel.setGenero("Masculino");
		emanuel.setNivelAtividade(NivelAtividade.moderado);
		
		System.out.println("Nome: " + emanuel.getNome());
		System.out.println("Idade: " + emanuel.getIdade());
		System.out.println("IMC: " + emanuel.getCalcularImc());
		System.out.println(emanuel.getCalcularNcd());
		System.out.println("Nivel de Atividade: " + emanuel.getNivelAtividade());
		System.out.println("Situação: " + emanuel.getStatus());
		System.out.println("-----------------------------------------------");
		
		
		
		Aluno erick  = new Aluno();
		
		erick.setNome("Erick");
		erick.setPeso(120);
		erick.setAltura(1.88);
		erick.setDataNascimento(LocalDate.of(1995, 3, 15));
		erick.setGenero("Masculino");
		erick.setNivelAtividade(NivelAtividade.intenso);
		
		System.out.println("Nome: " + erick.getNome());
		System.out.println("Idade: " + erick.getIdade());
		System.out.println("IMC: " + erick.getCalcularImc());
		System.out.println("NCD: " + erick.getCalcularNcd());
		System.out.println("Situação: " + erick.getStatus());
		System.out.println("Nivel de Atividade: " + erick.getNivelAtividade());
		
		
		
	}

}
