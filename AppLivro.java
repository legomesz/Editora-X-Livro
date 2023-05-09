package br.com.unit.aula07;

public class AppLivro {

	public static void main(String[] args) {

		
		Editora editora1 = new Editora(1, "Saraiva", "Jose", "9999999");
		Editora editora2 = new Editora(4, "Atlas", "Flavia", "666666");
		
		Livro livro1 = new Livro(3, "Aprendendo OO", "8585858", editora1);
		Livro livro2 = new Livro(23, "Banco de dados", "66666668", editora1);
		Livro livro3 = new Livro(18, "Eng. de Requisitos", "111111", editora1);
		Livro livro4 = new Livro(85, "Lógica de programação", "33333", editora2);
		Livro livro5 = new Livro(30, "Sql rapidinho", "333333", editora2);
		Livro livro6 = new Livro(3, "Programação Web", "444444", editora2);
		
		System.out.printf("\nTítulo: %s\nISBN: %s\nEditora: %s",
				           livro1.getTitulo(),
				           livro1.getIsbn(),
				           livro1.getEditora().getRazaoSocial());

		
		System.out.printf("\nTítulo: %s\nISBN: %s\nEditora: %s",
		           livro1.getTitulo(),
		           livro1.getIsbn(),
		           livro1.getEditora().getRazaoSocial());
		System.out.println("\n=======================================");
		System.out.printf("\nTítulo: %s\nISBN: %s\nEditora: %s",
		           livro2.getTitulo(),
		           livro2.getIsbn(),
		           livro2.getEditora().getRazaoSocial());
		System.out.println("\n=======================================");
		
		System.out.printf("\nTítulo: %s\nISBN: %s\nEditora: %s",
		           livro3.getTitulo(),
		           livro3.getIsbn(),
		           livro3.getEditora().getRazaoSocial());
		System.out.println("\n=======================================");
		
		System.out.printf("\nTítulo: %s\nISBN: %s\nEditora: %s",
		           livro4.getTitulo(),
		           livro4.getIsbn(),
		           livro4.getEditora().getRazaoSocial());
		System.out.println("\n=======================================");
		
		System.out.printf("\nTítulo: %s\nISBN: %s\nEditora: %s",
		           livro5.getTitulo(),
		           livro5.getIsbn(),
		           livro5.getEditora().getRazaoSocial());
		System.out.println("\n=======================================");
		
		System.out.printf("\nTítulo: %s\nISBN: %s\nEditora: %s",
		           livro6.getTitulo(),
		           livro6.getIsbn(),
		           livro6.getEditora().getRazaoSocial());
		System.out.println("\n=======================================");

		
		
		
	}

}
