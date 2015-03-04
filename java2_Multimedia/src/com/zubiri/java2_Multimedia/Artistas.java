package com.zubiri.java2_Multimedia;

import java.util.ArrayList;
import java.util.Scanner;

public class Artistas {
	//Atributos
	private static ArrayList<Artista> artistas = new ArrayList<Artista>();
	
	//Costructor
	public Artistas(){}
	
	//Crear artistas
	public static ArrayList<Artista> crearArtistas(Scanner sc){
		int opcion;
		System.out.println("¿Cuantos artistas son?: ");
		opcion = sc.nextInt();
		for (int a = 0; a < opcion; a++) {
			artistas.add(new Artista(sc));
		}
		return artistas;
	}
	
	//String de artistas formateado
	public static String formattedArtistas(ArrayList<Artista> arrayArtistas){
		String artistasFormateados = "";
		for (int i = 0; i < arrayArtistas.size(); i++) {
			artistasFormateados += arrayArtistas.get(i).formattedArtista();
		}
		return artistasFormateados;	
	}
	
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
	public static ArrayList<Artista> buscarArtistas(int ano){
		ArrayList<Artista> artistasPorAno = new ArrayList<Artista>();
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
	public static void anadirArtista(Artista artista){
		artistas.add(artista);
	}
	
	//Método para borrar artista
	public static void borrarArtista(String nombre){
		artistas.remove(buscarArtista(nombre));
	}
	
	//Getters y setters
	public static ArrayList<Artista> getArtistas() {
		return artistas;
	}

	public static void setArtistas(ArrayList<Artista> artistas) {
		Artistas.artistas = artistas;
	}
	
}
