package com.zubiri.java2_Multimedia;

import java.util.ArrayList;
import java.util.Scanner;

public class Pelicula extends Obra {
	
	//Atributos
	private String productora;
	private ArrayList<Artista> interpretes;
	
	//Constructor
	public Pelicula(String titulo, Artista autor, int anoEdicion, String productora, ArrayList<Artista> interpretes){
		super(titulo, autor, anoEdicion);
		this.productora = productora;
		this.interpretes = interpretes;
	}
	
	//Contructor 2
	public Pelicula(Scanner sc){
		super(sc);
		System.out.println("Introduce el nombre de la productora: ");
		this.setProductora(sc.next());
		this.setInterpretes(Artistas.crearArtistas(sc));
	}
	
	//Película formateada en un String
	@Override
	public String formattedObra(){
		String pelicula =
				super.formattedObra() + 
				"\nProductora: \t" + this.getProductora() +
				"\nIntérpretes: " +
				Artistas.formattedArtistas(this.getInterpretes());
		return pelicula;
	}
	
	public String getProductora() {
		return productora;
	}
	public void setProductora(String productora) {
		this.productora = productora;
	}
	public ArrayList<Artista> getInterpretes() {
		return interpretes;
	}
	public void setInterpretes(ArrayList<Artista> interpretes) {
		this.interpretes = interpretes;
	}
}
