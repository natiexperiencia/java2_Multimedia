package com.zubiri.java2_Multimedia;

import java.util.Scanner;

public class Obra {
	
	//Atributos
	private String titulo;
	private Artista autor;
	private int anoEdicion;
	
	//Contructor 1
	public Obra(){}
	//Costructor 2
	public Obra(String titulo, Artista autor, int anoEdicion){
		this.titulo = titulo;
		this.autor = autor;
		this.anoEdicion = anoEdicion;
	}
	//Costructor 3
	public Obra(Scanner sc){
		System.out.println("\nIntroduce el título de la obra: ");
		this.setTitulo(sc.next());
		System.out.println("Ingresa el año de edición: ");
		this.setAnoEdicion(sc.nextInt());
		this.setAutor(new Artista(sc));
		Multiteca.sumarObra();
	}
	
	//Método que devuelve String con atributos de Obra formateado
	public String formattedObra(){
		String obra =
		"\nTítulo:\t" + this.getTitulo() + "\n"
		+ "\nAño de edición:\t" + this.getAnoEdicion() + "\n"
		 + Artista.formattedArtista();
		
		return obra;
	}

	//Getters y Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Artista getAutor() {
		return autor;
	}

	public void setAutor(Artista autor) {
		this.autor = autor;
	}

	public int getAnoEdicion() {
		return anoEdicion;
	}

	public void setAnoEdicion(int anoEdicion) {
		this.anoEdicion = anoEdicion;
	}
}
