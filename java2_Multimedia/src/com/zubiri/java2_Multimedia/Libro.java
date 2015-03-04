package com.zubiri.java2_Multimedia;

import java.util.Scanner;

public class Libro extends Obra {
	
	//Atributos
	private String editorial;
	private int numPaginas;
	
	//Constructor
	public Libro(String titulo, Artista autor, int anoEdicion, String editorial, int numPaginas){
		super(titulo, autor, anoEdicion);
		this.editorial = editorial;
		this.numPaginas = numPaginas;
	}
	
	//Constructor 2
	public Libro(Scanner sc){
		super(sc);
		System.out.println("Introduce el nombre de la editorial: ");
		this.setEditorial(sc.next());
		System.out.println("Introduce el número de páginas: ");
		this.setNumPaginas(sc.nextInt());
	}
	
	//String formateado de Libro
	@Override
	public String formattedObra(){
		String libroFormateada =
				super.formattedObra() +
				"Editorial: \t" + this.getEditorial() +
				"\nNúmero de páginas: \t" + this.getNumPaginas() + "\n";
		return libroFormateada;
	}
	
	//Getters y setters
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	
}
