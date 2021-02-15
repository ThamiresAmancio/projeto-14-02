package br.sp.academia.gui;



import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import br.sp.academia.Aluno;
import br.sp.academia.model.NivelAtividade;

public class JanelaAluno {


	public void criarTela() {
		
		
		JFrame telaAluno = new JFrame ();
		telaAluno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaAluno.setTitle("Calculando o IMC e NCD");
		telaAluno.setSize(600, 550);
		Color azulBebe = new Color(153, 217, 234);
		
		
		
		
		// Name
		
			JLabel labelNome = new JLabel();
		labelNome.setText("Nome do Aluno:");
		labelNome.setBounds(10, 20, 120, 30);
		labelNome.setFont(new Font ("Arial", Font.BOLD,13));
		
		JTextField textNome = new JTextField();
		textNome.setBounds(120, 20, 150, 30);
		
		// Data of birth
		
		JLabel labelNascimento = new JLabel ();
		labelNascimento.setText("Data de Nascimento: ");
		labelNascimento.setBounds(10, 70, 140, 30);
		labelNascimento.setFont(new Font ("Arial", Font.BOLD,13));
		
		JTextField textNascimento = new JTextField();
		textNascimento.setBounds(170, 70, 90, 30);
		
		// Genre
		
		 
		JLabel labelGenero = new JLabel();
		labelGenero.setText("Gênero: ");
		labelGenero.setBounds(10, 120, 80, 30);
		labelGenero.setFont(new Font ("Arial", Font.BOLD,13));
		
		
		JRadioButton radioMasculino = new JRadioButton("Masculino");
		radioMasculino.setBounds(80, 120, 90, 30);
		JRadioButton radioFeminino = new JRadioButton("Feminino");
		radioFeminino.setBounds(170, 120, 80, 30);
		ButtonGroup bg = new ButtonGroup();
		bg.add(radioMasculino);bg.add(radioFeminino);
		Color azulbebe = new Color(153, 217, 234);
		radioMasculino.setBackground(azulbebe);
		radioFeminino.setBackground(azulbebe);
		
		
		
		//Weight
		
		JLabel labelPeso = new JLabel ();
		labelPeso.setText("Peso: ");
		labelPeso.setBounds(10, 160, 80, 30);
		labelPeso.setFont(new Font ("Arial", Font.BOLD,13));
		
		
		JTextField textPeso = new JTextField();
		textPeso.setBounds(80, 160, 80, 30);
		
		//Height
		
		JLabel labelAltura = new JLabel ();
		labelAltura.setText("Altura: ");
		labelAltura.setBounds(10, 220, 80, 30);
		labelAltura.setFont(new Font ("Arial", Font.BOLD,13));
		
		
		JTextField textAltura = new JTextField();
		textAltura.setBounds(80, 210, 80, 30);
		
		//Physical activity
		
		JLabel labelFisica = new JLabel();
		labelFisica.setText("Atividade Física: ");
		labelFisica.setBounds(10, 275, 120, 30);
		labelFisica.setFont(new Font ("Arial", Font.BOLD,13));
		
		JComboBox<String> box = new JComboBox<String>();
		box.setBounds(120,275 , 120, 30);
		 
		 JPanel container = new JPanel();
		 
		 box.addItem("Escolha um Item");
		 box.addItem("Leve");
		 box.addItem("Moderado");
		 box.addItem("Intenso");
		 container.add(box);
		 
		 

		 //Button
		 
		 JButton buttonCalcular = new JButton();
		 buttonCalcular.setText("Calcular");
		 buttonCalcular.setBounds(150, 400 , 110, 30);
		 Color green = new Color(20, 143, 14);
		 buttonCalcular.setBackground(green);
		 buttonCalcular.setFont(new Font ("Arial", Font.BOLD,13));
			
		 
		 
		 JButton buttonLimpar = new JButton();
		 buttonLimpar.setText("Limpar");
		 buttonLimpar.setBounds(275, 400, 110, 30);
		 Color red = new Color(215, 0, 0);
		 buttonLimpar.setBackground(red);
		 buttonLimpar.setFont(new Font ("Arial", Font.BOLD,13));
			
		 //Resultados
		 
		 
		 JLabel labelResultados = new JLabel ();
		 labelResultados.setText("Resultados");
		 labelResultados.setFont(new Font ("Arial", Font.BOLD,15));
		 labelResultados.setBounds(400, 50, 80, 30);
		
		 
		 
		 
		 //IMC
		 
		 JLabel labelImc = new JLabel ();
		 labelImc.setText("IMC:");
		 labelImc.setBounds(400, 80, 160, 30);
		 labelImc.setFont(new Font ("Arial", Font.BOLD,13));
		 
		 
		 JTextField textImc = new JTextField();

		 //	NCD
		 
		 
		 JLabel labelNCD = new JLabel ();

		 labelNCD.setText("NCD:");
		 labelNCD.setBounds(400,180, 80, 30);
		 labelNCD.setFont(new Font ("Arial", Font.BOLD,13));
		 
		 JTextField textNCD = new JTextField();
		 
		
		 
		 
		 
		 
		telaAluno.getContentPane().add(textNCD);
		telaAluno.getContentPane().add(labelNCD); 
		telaAluno.getContentPane().add(textImc);
		telaAluno.getContentPane().add(labelImc);
		telaAluno.getContentPane().add(labelResultados);
		telaAluno.getContentPane().add(buttonLimpar);
		telaAluno.getContentPane().add(buttonCalcular);
		telaAluno.getContentPane().add(labelFisica);
		telaAluno.getContentPane().add(container);
		telaAluno.getContentPane().add(box);
		telaAluno.getContentPane().add(textAltura);
		telaAluno.getContentPane().add(labelAltura);
		telaAluno.getContentPane().add(textPeso);
		telaAluno.getContentPane().add(labelPeso);
		telaAluno.getContentPane().add(radioFeminino);
		telaAluno.getContentPane().add(radioMasculino);
		telaAluno.getContentPane().add(labelGenero);
		telaAluno.getContentPane().add(textNascimento);
		telaAluno.getContentPane().add(labelNascimento);
		telaAluno.getContentPane().add(textNome);
		telaAluno.getContentPane().add(labelNome);
		telaAluno.getContentPane().setBackground(azulBebe);
		telaAluno.setLayout(null);
		telaAluno.setVisible(true);
		
		
		
		//Cliques da tela
		
		
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Aluno a = new Aluno();
				
				
				a.setPeso(60);
				a.setAltura(1.64);
				
				labelImc.setText(String.valueOf("IMC:" + a.getCalcularImc()));
				labelImc.setText(String.valueOf("IMC:" + a.getCalcularImc()));
				
				
				a.setDataNascimento(LocalDate.of(2001, 9, 27));
				a.setGenero("Feminino");
				a.setNivelAtividade(NivelAtividade.leve2);
				
				labelNCD.setText(String.valueOf("NCD:" + a.getCalcularNcd()));
				labelNCD.setText(String.valueOf( "NCD:  " +a.getCalcularNcd()));
				labelNCD.setText(String.valueOf( "NCD: " +a.getCalcularNcd()));	
				
				
				
				
				
				
				a.setPeso(80);
				a.setAltura(1.70);
				
				labelImc.setText(String.valueOf("IMC:" + a.getCalcularImc()));
				labelImc.setText(String.valueOf("IMC:" + a.getCalcularImc()));
				
				
				a.setDataNascimento(LocalDate.of(1970,3, 15));
				a.setGenero("Masculino");
				a.setNivelAtividade(NivelAtividade.moderado);
				
				labelNCD.setText(String.valueOf("NCD:" + a.getCalcularNcd()));
				labelNCD.setText(String.valueOf( "NCD:  " +a.getCalcularNcd()));
				labelNCD.setText(String.valueOf( "NCD: " +a.getCalcularNcd()));	
				
				
			}
		});
		
		
		
		buttonLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				labelImc.setText("IMC: ");
				labelNCD.setText("NCD:");
				
				
				
			}
		});
		
		

		
	}
	
	
	
	
}
