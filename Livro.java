package br.com.unit.aula07;

public class Livro {
	
	private int codigo;
	private String titulo;
	private String isbn;
	private Editora editora;
	
	public Livro(int codigo, String titulo, String isbn, Editora editora) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.isbn = isbn;
		this.editora = editora;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public int getCodigo() {
		return codigo;
	}
	
	

}
