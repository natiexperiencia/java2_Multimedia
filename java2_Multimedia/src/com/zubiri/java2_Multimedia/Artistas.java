package com.zubiri.java2_Multimedia;

import java.util.ArrayList;

public class Artistas {
	//Atributos
	private static ArrayList<Artista> artistas = new ArrayList<Artista>();
	
	//Costructor
	public Artistas(){}
	
	//Método para buscar artista por nombre
	public static Artista buscarArtista(String nombre){
		Artista artista = null;
		if (artistas == null) {
			System.out.println("No se han cargado artistas en la lista....");
		}else {
			for (int i = 0; i < artistas.size(); i++) {
				if (artistas.get(i).getNombre().equalsIgnoreCase(nombre)) {
					artista = artistas.get(i);
				}
			}
		}
		return artista;
	}
	
	//Método para buscar artista por año
	public static ArrayList<Artista> buscarArtista(int ano){
		ArrayList<Artista> artistasPorAno = null;
		if (artistas == null) {
			System.out.println("No se han cargado artistas en la lista....");
		}else {
			for (int a = 0; a < artistas.size(); a++) {
				if (artistas.get(a).getAnoNacimiento() == ano) {
					artistasPorAno.add(artistas.get(a));
				}
			}
		}
		return artistasPorAno;
	}
	
	//Método para añadir artista a la lista
	
	
	//Getters y setters
	public static ArrayList<Artista> getArtistas() {
		return artistas;
	}

	public static void setArtistas(ArrayList<Artista> artistas) {
		Artistas.artistas = artistas;
	}
	
}
