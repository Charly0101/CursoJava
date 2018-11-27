package es.rf.tienda.dominio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import es.rf.tienda.exception.DomainException;

public class CategoriaTest {
	
	public final static String NOMBRE_BIEN= "hola58";
	public final static String NOMBRE_MAL= "holla";
	public final static String NOMBRE_CORTO = "g5";
	public final static String NOMBRE_LARGO = "as4d5c8ge52adsdffert4t8d5a1sftesasfd4x1g58asdfasdfasdfasdfasdf";
	public final static String DESCRIPCION_BIEN= "hjs344";
	public final static String DESCRIPCION_MAL = "asdf";
	public final static String DESCRIPCION_NULL= null;

	Categoria c;
	
	@Before
	public void inicioTestCategoria() {
		c = new Categoria();
	}

	@Test
	public void testGetCatNombre() throws DomainException {
		c.setCatNombre(NOMBRE_BIEN);
		assertEquals(NOMBRE_BIEN, c.getCatNombre());
	}
	
	@Test
	public void testGetCatNombre1() throws DomainException {
		c.setCatNombre(NOMBRE_MAL);
		assertEquals(NOMBRE_MAL, c.getCatNombre());
	}
	
	@Test(expected = DomainException.class)
	public void testGetCatNombre2() throws DomainException {
		c.setCatNombre(NOMBRE_LARGO);
		assertEquals(NOMBRE_LARGO, c.getCatNombre());
	}
	
	@Test(expected = DomainException.class)
	public void testGetCatNombre3() throws DomainException {
		c.setCatNombre(NOMBRE_CORTO);
		assertEquals(NOMBRE_CORTO, c.getCatNombre());
	}

	@Test
	public void testGetCatDescripcion() throws DomainException {
		c.setCatDescripcion(DESCRIPCION_BIEN);
		assertEquals(DESCRIPCION_BIEN, c.getCatDescripcion());
	}
	
	@Test
	public void testGetCatDescripcion1() throws DomainException {
		c.setCatDescripcion(DESCRIPCION_MAL);
		assertEquals(DESCRIPCION_MAL, c.getCatDescripcion());
	}
	
	@Test
	public void testSetDirNombre() throws DomainException {
		c.setCatDescripcion(DESCRIPCION_NULL);
		assertNull(c.getCatDescripcion());
	}
}


