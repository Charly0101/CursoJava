package es.rf.tienda.dominio;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import es.rf.tienda.exception.DomainException;
import es.rf.tienda.util.Validator;
import es.rf.tienda.util.ValidatorTest;

public class UsuarioTest {

	Usuario u;

	public final static String BIEN = "Carlos4";
	public final static String CORTO = "Ca4";
	public final static int TIPO_BIEN = 4;
	public final static int TIPO_MAL = 0;

	@Before
	public void inicioTestUsuario() {
		u = new Usuario();
	}

	@Test
	public void testGetUserNombre() throws DomainException {
		u.setUserNombre(BIEN);
		assertEquals(BIEN, u.getUserNombre());
	}

	@Test(expected = DomainException.class)
	public void testGetUserNombre2() throws DomainException {
		u.setUserNombre(CORTO);
		assertEquals(CORTO, u.getUserNombre());
	}

	@Test
	public void testGetUserEmail() throws DomainException {
		u.setUserEmail(ValidatorTest.EMAIL_PATTERN_BIEN);
		assertEquals(ValidatorTest.EMAIL_PATTERN_BIEN, u.getUserEmail());
	}

	@Test(expected = DomainException.class)
	public void testGetUserEmail1() throws DomainException {
		u.setUserEmail(ValidatorTest.EMAIL_PATTERN_MAL);
		assertEquals(ValidatorTest.EMAIL_PATTERN_MAL, u.getUserEmail());
	}

	@Test(expected = DomainException.class)
	public void testGetUserEmail3() throws DomainException {
		u.setUserEmail(ValidatorTest.EMAIL_PATTERN_NULL);
		assertNull(u.getUserEmail());
	}

	@Test
	public void testGetUserPass() throws DomainException {
		u.setUserPass(ValidatorTest.PASSWORD_BIEN);
		assertEquals(ValidatorTest.PASSWORD_BIEN, u.getUserPass());
	}

	@Test(expected = DomainException.class)
	public void testGetUserPass1() throws DomainException {
		u.setUserPass(ValidatorTest.PASSWORD_CORTA);
		assertEquals(ValidatorTest.PASSWORD_CORTA, u.getUserPass());
	}

	@Test(expected = DomainException.class)
	public void testGetUserPass2() throws DomainException {
		u.setUserPass(ValidatorTest.PASSWORD_NULO);
		assertNull(u.getUserPass());
	}

	@Test
	public void testGetUserTipo() throws DomainException {
		u.setUserTipo(TIPO_BIEN);
		assertTrue(u.getUserTipo() > 0);
	}

	@Test(expected = DomainException.class)
	public void testGetUserTipo2() throws DomainException {
		u.setUserTipo(TIPO_MAL);
		assertFalse(u.getUserTipo() > 0);
	}

	@Test
	public void testGetUserDni() throws DomainException {
		u.setUserDni(ValidatorTest.DNI_PATTERN_BIEN);
		assertEquals(ValidatorTest.DNI_PATTERN_BIEN, u.getUserDni());
	}

	@Test(expected = DomainException.class)
	public void testGetUserDni2() throws DomainException {
		u.setUserDni(ValidatorTest.DNI_PATTERN_MAL);
		assertEquals(ValidatorTest.DNI_PATTERN_MAL, u.getUserDni());
	}
	
	@Test(expected = DomainException.class)
	public void testGetUserDni3() throws DomainException {
		u.setUserDni(ValidatorTest.DNI_PATTERN_NULO);
		assertNull(u.getUserDni());	
	}
}
