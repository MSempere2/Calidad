package com.calidad.practica;

public class Tienda {

	private Integer nArticulos = 4;
	private Integer tamArray = 4;
	String usuario;
	
	public int getnArticulos() {
		return nArticulos;
	}
	public String getUsuario() {
		return usuario;
	}
	
	public String[] hacerCompra() {
		String[] compra = {"camiseta", "pantalon", "deportivas", "chaqueta"};
		System.out.println("se ha comprado: " + compra.toString());
		
		return compra;
	}
	
	public String[] listarMarcas() {
		String[] marcas = {"puma", "kelme", "nike", "adidas"};
		System.out.println("se han encontrado: " + marcas.toString());
		
		return marcas;
	}
	
	public boolean comprobarArticulos() {
		return nArticulos.equals(tamArray);
	}
	
}
