package br.sp.academia;

import java.time.LocalDate;
import java.time.Period;

import br.sp.academia.model.NivelAtividade;

public class Aluno {
	
		private String nome;
		private int peso;
		private double altura;
		private String genero;
		private LocalDate dataNascimento;
		private double nivelAtividade;
		private double calcularImc;
		private double calcularNcd;
		private String status;
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String getNome() {
			return this.nome;
		}
		
		public void setPeso(int peso) {
			this.peso = peso;
		}
		 
		public int getPeso() {
			return this.peso;
		}
		
		public void setAltura(double altura) {
			this.altura = altura;
		}
		
		public double getAltura() {
			return this.altura;
		}
		
		public void setGenero(String genero) {
			this.genero = genero;
		}
		
		public String getGenero() {
			if(this.genero == "m") {
				return "masculino";
			}else {
				return "feminino";
			}
		}
		
		public void setDataNascimento(LocalDate dataNascimento) {
			this.dataNascimento = dataNascimento;
		}
		
		public LocalDate getDataNascimento() {
			return this.dataNascimento;
		}
		
		public int getIdade() {
			LocalDate hoje = LocalDate.now();
			Period periodo = Period.between(this.dataNascimento,hoje);
			return periodo.getYears();
		}
		
		public void setNivelAtividade(double nivelAtividade) {
			this.nivelAtividade = nivelAtividade;
		}
		
		 public double getNivelAtividade() {
			return this.nivelAtividade;
		}
		 
		 
		
		public void setCalcularImc(double calcularImc) {
			this.calcularImc = calcularImc;
		}
		
		public double getCalcularImc() {
			return this.peso/(this.altura*this.altura);
		}
		
		public void setCalcularNcd(double calcularNcd) {
			this.calcularNcd = calcularNcd;
		}
		
		public double getCalcularNcd() {
			double ncd = 0;
				// man
		
			if(this.genero == "Masculino") {
				
				if(this.getIdade() >= 18 && this.getIdade() <30) {
					ncd = 15.3 * this.peso + 697;
				}else if (this.getIdade() >= 31 && this.getIdade() < 61) {
					ncd = 11.6 * this.peso + 879;
				}else {
					ncd = 13.5 * this.peso + 489;
				}
				
				
				if(this.nivelAtividade == NivelAtividade.leve) {
					ncd*= 1.5;
				}else if (this.nivelAtividade == NivelAtividade.moderado) {
					ncd*=1.8;
				}else if (this.nivelAtividade == NivelAtividade.intenso) {
					ncd *= 2.1;
				}

				
			}
			
			//women
			
			if(this.genero == "Feminino") {
				
				if(this.getIdade() >= 18 && this.getIdade() < 30) {
					ncd = 14.7 * this.peso +496;
				}else if (this.getIdade() >= 31 && this.getIdade() < 61) {
					ncd = 8.7 * this.peso + 829;
				}
				else {
					ncd = 10.5 * this.peso + 596;
				}
				
				
				if(this.nivelAtividade == NivelAtividade.leve2) {
					ncd*= 1.6;
				}else if (this.nivelAtividade == NivelAtividade.moderado2) {
					ncd*=1.6;
				}else if (this.nivelAtividade == NivelAtividade.intenso2) {
					ncd *= 1.8;
				}
			}
			return ncd;
		}
		
		
		
		
		
		public void setStatus(String status) {
			this.status = status;
		}
		
		public String getStatus() {
			if ( this . getCalcularImc () <=  18.6 ) {
				return  " Abaixo do Peso " ;
			} else  if ( this . getCalcularImc () >  18.6  &&  this . getCalcularImc () <  25 ) {
				return  " Peso Ideal " ;
			} else  if ( this . getCalcularImc () >  25  &&  this . getCalcularImc () <  29.9 ) {
				return  " Levemente acima do peso " ;
			} else  if ( this . getCalcularImc () >  30  &&  this . getCalcularImc () <  34.9 ) {
				return   "Obesidade I";
			} else  if ( this . getCalcularImc () >  35  &&  this . getCalcularImc () <  39.9 ) {
				return   "Obesidade II";
			} else {
				return   "Obesidade III";
			}
		}

		
			
		

		

}
