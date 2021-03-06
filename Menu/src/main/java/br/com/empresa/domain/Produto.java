package br.com.empresa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUTO")
public class Produto {
	
	@Id
	@GeneratedValue
	@Column(name="id_produto")
	private int id;

	private String descricao;
	private float preco;
	private Object imagem;
	
	
	public Produto() {
		// TODO Construtor padr�o
	}
	
	
	
	public Produto(String descricao, float preco, Object imagem) {
		//TODO Contrutos puxando os atributos
		this.descricao = descricao;
		this.preco = preco;
		this.imagem = imagem;
	}
	
	
	
	//Getters e Setter dos atributos do Produto (Depois verificar se vai precisar de todos mesmo)
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public Object getImagem() {
		return imagem;
	}
	
	public void setImagem(Object imagem) {
		this.imagem = imagem;
	}
	
	
	

}
