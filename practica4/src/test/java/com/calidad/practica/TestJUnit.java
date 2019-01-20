package com.calidad.practica;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.calidad.practica.Tienda;

public class TestJUnit {

	Tienda tienda = new Tienda();

	String[] testString = { "camiseta", "pantalon", "deportivas", "chaqueta" };

	private int testArticulos = 4;
	
	static long endTime;
	static long startTime;
	
	// Annotations
	
	@Before
	public void crearTienda() {
		System.out.println("BEFORE - creando nueva tienda antes del test");
		
		tienda = new Tienda();
		
	}
	
	@After
	public void vaciarTienda() {
		System.out.println("AFTER - Vaciando tienda despues del test");
		
		tienda = null;
	}
	
	@BeforeClass
	public static void inicioTest() {
		System.out.println("BEFORE CLASS - Se va a iniciar un cronometro");
		
		startTime = System.currentTimeMillis();
	}
	
	@AfterClass
	public static void finTest() {
		System.out.println("AFTER CLASS - Fin del cronometro");
		
		endTime = System.currentTimeMillis();
		long time = endTime - startTime;
		System.out.println("Tiempo: " + time);
	}
	
	@Ignore
	public static void ignorarTest() {
		
		while (true) {
			System.out.println("Espera Infinita");
		}
		
	}
	

	// Caso Correcto

	@Test
	public void testNumArticulos() {
		System.out.println("Comprobacion de numero de articulos de la tienda");

		assertEquals(testArticulos, tienda.getnArticulos());
	}

	// Caso Correcto

	@Test
	public void testComprobarArticulos() {
		System.out.println("Comprobacion de que haya tantos articulos como numero de articulos");

		assertTrue(tienda.comprobarArticulos());
	}

	// Caso Fallido

	@Test
	public void testComprobarArticulosFalse() {
		System.out.println("Comprobacion de que haya tantos articulos como numero de articulos FF");

		assertFalse(tienda.comprobarArticulos());
	}

	// Caso Fallido

	@Test
	public void testTiendaNoVacia() {
		System.out.println("Comprobacion de que usuario no esta vacio FF");
		assertNotNull(tienda.getUsuario());
	}

	// Caso Correcto

	@Test
	public void testTiendaVacia() {
		System.out.println("Comprobacion de que la lista de articulos esta vacia");

		assertNull(tienda.hacerCompra());
	}

	// Caso Fallido

	@Test
	public void testIguales() {
		System.out.println("Comprobacion de que la lista de articulos es la misma FF");
		assertSame(testString, tienda.listarMarcas());
	}

	// Caso Correcto

	@Test
	public void testNoIguales() {
		System.out.println("Comprobacion de que la lista de articulos no es la misma");
		assertNotSame(testString, tienda.listarMarcas());
	}

	// Caso Fallido

	@Test
	public void testCompararArray() {
		System.out.println("Comprobacion de que el array de tienda y el de test es el mismo FF");
		assertArrayEquals(testString, tienda.hacerCompra());
	}

}
