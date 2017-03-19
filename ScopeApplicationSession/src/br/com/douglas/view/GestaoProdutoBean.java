package br.com.douglas.view;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.douglas.domain.Produto;

@ManagedBean
@SessionScoped
public class GestaoProdutoBean {
	private Produto produto;
	private List<Produto> produtos;

	public GestaoProdutoBean() {
		this.produto = new Produto();
		this.produtos = new ArrayList<Produto>();
	}

	public void cadastrar() {
		this.produtos.add(this.produto);
		this.produto = new Produto();
	}

	public Produto getProduto() {
		return produto;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

}
