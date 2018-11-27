package es.rf.tienda.dominio;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import es.rf.tienda.exception.DomainException;

public class DireccionTest {

	public final static String BIEN = "Carlos4";
	public final static String NULL = null;
	public final static String MAL = "Carlos.";

	Direccion d;

	@Before
	public void inicioDireccionTest() {
		d = new Direccion();
	}

	@Test
	public void testGetDirNombre() throws DomainException {
		d.setDirNombre(BIEN);
		assertEquals(BIEN, d.getDirNombre());

	}

	@Test
	public void testSetDirNombre1() throws DomainException {
		d.setDirNombre(NULL);
		assertNull(d.getDirNombre());
	}

	@Test(expected = DomainException.class)
	public void testGetDirNombre2() throws DomainException {
		d.setDirNombre(MAL);
		assertEquals(MAL, d.getDirNombre());
	}

	@Test
	public void testGetDirDireccion() throws DomainException {
		d.setDirDireccion(BIEN);
		assertEquals(BIEN, d.getDirDireccion());
	}

	@Test
	public void testSetDirDireccion1() throws DomainException {
		d.setDirDireccion(NULL);
		assertNull(d.getDirDireccion());
	}

	@Test(expected = DomainException.class)
	public void testSetDirDireccion2() throws DomainException {
		d.setDirDireccion(MAL);
		assertEquals(MAL, d.getDirDireccion());
	}

	@Test
	public void testGetDirPoblacion() throws DomainException {
		d.setDirPoblacion(BIEN);
		assertEquals(BIEN, d.getDirPoblacion());
	}

	@Test
	public void testSetDirPoblacion1() throws DomainException {
		d.setDirPoblacion(NULL);
		assertNull(d.getDirDireccion());
	}

	@Test(expected = DomainException.class)
	public void testSetPoblacion3() throws DomainException {
		d.setDirPoblacion(MAL);
		assertEquals(MAL, d.getDirPoblacion());
	}

	@Test
	public void testGetDirCPostal() throws DomainException {
		d.setDirCPostal(BIEN);
		assertEquals(BIEN, d.getDirCPostal());
	}

	@Test
	public void testSetDirCPostal1() throws DomainException {
		d.setDirCPostal(NULL);
		assertNull(d.getDirCPostal());
	}

	@Test(expected = DomainException.class)
	public void testSetDirCPostal2() throws DomainException {
		d.setDirCPostal(MAL);
		assertEquals(MAL, d.getDirCPostal());
	}

	@Test
	public void testGetDirProvincia() throws DomainException {
		d.setDirProvincia(BIEN);
		assertEquals(BIEN, d.getDirProvincia());
	}

	@Test
	public void testSetDirProvincia1() throws DomainException {
		d.setDirProvincia(NULL);
		assertNull(d.getDirProvincia());

	}

	@Test(expected = DomainException.class)
	public void testSetDirProvincia2() throws DomainException {
		d.setDirProvincia(MAL);
		assertEquals(MAL, d.getDirProvincia());

	}

	@Test
	public void testGetDirPais() throws DomainException {
		d.setDirPais(BIEN);
		assertEquals(BIEN, d.getDirPais());
	}

	@Test
	public void testSetDirPais1() throws DomainException {
		d.setDirPais(NULL);
		assertNull(d.getDirPais());
	}

	@Test(expected = DomainException.class)
	public void testSetDirPais2() throws DomainException {
		d.setDirPais(MAL);
		assertEquals(MAL, d.getDirPais());
	}

	@Test
	public void testGetDirCorreoE() throws DomainException {
		d.setDirCorreoE(BIEN);
		assertEquals(BIEN, d.getDirCorreoE());
	}

	@Test
	public void testSetDirCorreoE1() throws DomainException {
		d.setDirCorreoE(NULL);
		assertNull(d.getDirCorreoE());
	}

	@Test(expected = DomainException.class)
	public void testSetDirCorreoE2() throws DomainException {
		d.setDirCorreoE(MAL);
		assertEquals(MAL, d.getDirCorreoE());
	}

}
