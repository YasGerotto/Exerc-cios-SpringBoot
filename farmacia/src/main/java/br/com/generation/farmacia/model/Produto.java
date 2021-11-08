package br.com.generation.farmacia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


	@Entity
	@Table(name = "tb_produto")
	public class Produto {
		
				
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;

		@NotBlank( message =  " O atributo nome não pode ser branco !")
		@Size(min = 2, max = 30, message =  " O atributo nome deve ter entre 3 e 100 caracteres!")
		private String nome;
		
		@NotBlank( message =  " O atributo preço não pode ser nulo !")
		@Size(min = 2, max = 30, message =  " O atributo preço não pode ser nulo !")
		private double preco;
		
		@NotBlank( message =  " O atributo marca não pode ser branco !")
		@Size(min = 2, max = 30, message =  " O atributo marca deve ter entre 3 e 100 caracteres!")
		private String marca;
		
		
		@NotBlank( message =  " O atributo setor não pode ser branco !")
		@Size(min = 2, max = 30, message =  " O atributo setor deve ter entre 3 e 100 caracteres!")
		private String setor;
		
		
		@ManyToOne
		@JsonIgnoreProperties("produto")
		private Categoria categoria;


		public long getId() {
			return id;
		}


		public void setId(long id) {
			this.id = id;
		}


		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public double getPreco() {
			return preco;
		}


		public void setPreco(double preco) {
			this.preco = preco;
		}


		public String getMarca() {
			return marca;
		}


		public void setMarca(String marca) {
			this.marca = marca;
		}


		public String getSetor() {
			return setor;
		}


		public void setSetor(String setor) {
			this.setor = setor;
		}


		public Categoria getCategoria() {
			return categoria;
		}


		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}
		

}
