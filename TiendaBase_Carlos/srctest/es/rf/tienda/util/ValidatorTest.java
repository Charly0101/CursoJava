package es.rf.tienda.util;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;

public class ValidatorTest {

//***************************ALFANUMERIOG***********************************************

	public static final String ALFANUMERIC_PATTERN_BIEN = "cdr34ds4sw";
	public static final String ALFANUMERIC_PATTERN_NUMERO = "524522 14787";
	public static final String ALFANUMERIC_PATTERN_LETRAS = "asdf ds";
	public static final String ALFANUMERIC_PATTERN_NULL = null;
	public static final String ALFANUMERIC_PATTERN_VACIA = " ";

//****************************TELEFONO************************************************************	

	public static final String PHONE_PATTERN_BIEN = "521459658712546";
	public static final String PHONE_PATTERN_MAL = "52145965ASDF87546";
	public static final String PHONE_PATTERN_CORTO = "2546";
	public static final String PHONE_PATTERN_LARGO = "521456398745212365478965";

//******************************EMAIL**************************************************	

	public static final String EMAIL_PATTERN_BIEN = "holaha@akd.com";
	public static final String EMAIL_PATTERN_MAL = "holaja.@hol.com";
	public static final String EMAIL_PATTERN_VACIO = "";
	public static final String EMAIL_PATTERN_NULL = null;
	public static final String EMAIL_PATTERN_CORTO = "a@j.c";

//*******************************DNI*************************************

	public static final String DNI_PATTERN_BIEN = "23.063.640-E";
	public static final String DNI_PATTERN_NULO = null;
	public static final String DNI_PATTERN_MAL = "23.000.254-L";
	public static final String DNI_PATTERN_CORTO = "23.000-L";
	public static final String DNI_PATTERN_LARGO = "23.000.254.555-L";
	public static final String DNI_PATTERN_VACIO = "";

//*****************************LONGITUD MINIMA************************

	public static final String LONGITUD_MINIMA = "Esta es la longitud minima";
	public static final String LONGITUD_MAXIMA = "Esta es la longitud maxima y hay que respetarla si o si";
	public static final String LONGITUD_CUMPLIDA = "Esta es la longitud perfecta para poder estar";

//******************************PASSWORD*************************************************

	public static final String PASSWORD_BIEN = "C4t$=d4EC5%";
	public static final String PASSWORD_LETRAS = "jañlkioefc";
	public static final String PASSWORD_CORTA = "j4%$VC";
	public static final String PASSWORD_LARGA = "Je4#5%TrecFRtg7&()!qWEd";
	public static final String PASSWORD_NUMEROS = "12345689067";
	public static final String PASSWORD_NULO = null;

//********************************FECHA***************************************************

	public static final String FECHA_BUENA = "15/05/2005";
	public static final String FECHA_PASADA = "37/05/2005";
	public static final String FECHA_CORTA = "05/2005";
	public static final String FECHA_MAL_PUESTA = "15/2005/12";
	public static final String FECHA_FUTURO = "15/05/2051";
	public static final String FECHA_LARGA = "150/05/2005";
	public static final Calendar FECHA_MINIMA = new GregorianCalendar(1900, 01, 01);
	public static final Calendar FECHA_MINIMA_MAL = new GregorianCalendar(1898, 01, 01);
	public static final Calendar FECHA_MINIMA_BIEN = new GregorianCalendar(1955, 01, 01);
	public static final Calendar FECHA_MINIMA_CORTA = new GregorianCalendar(1898, 13, 01);
	public static final Calendar FECHA_MINIMA_NULA = null;
	public static final Calendar FECHA_MAXIMA = new GregorianCalendar(2050, 12, 31);
	public static final Calendar FECHA_MAXIMA_MAL = new GregorianCalendar(2051, 01, 01);
	public static final Calendar FECHA_MAXIMA_BIEN = new GregorianCalendar(2018, 01, 01);
	public static final Calendar FECHA_MAXIMA_NULA = null;

//***********************************CODIGO_PRODUCTO*************************************

	public static final String COD_PRODUCTO_BUENO = "RT258";
	public static final String COD_PRODUCTO_MAL = "re789";
	public static final String COD_PRODUCTO_LARGO = "GFD543";
	public static final String COD_PRODUCTO_NULL = null;
	public static final String COD_PRODUCTO_VACIO = " ";
	public static final String COD_PRODUCTO_CORTO = "R43";
	public static final String COD_PRODUCTO_MAS_NUMERO = "T1234";

	Validator vat;

	@Before
	public void inicioValidator() {
		vat = new Validator();
	}

//ALFANUMERICO
	@Test
	public void esAfanumericNull() {
		assertTrue(vat.isAlfanumeric(ALFANUMERIC_PATTERN_NULL));
	}

	@Test
	public void esAlfanumerioc() {
		assertTrue(vat.isAlfanumeric(ALFANUMERIC_PATTERN_BIEN));

	}

	@Test
	public void esAfanumerica1() {
		assertFalse(vat.isAlfanumeric(ALFANUMERIC_PATTERN_LETRAS));
	}

	@Test
	public void esAfanumerica2() {
		assertFalse(vat.isAlfanumeric(ALFANUMERIC_PATTERN_NUMERO));
	}

//VACIA
	@Test
	public void estaVacia() {
		assertTrue(vat.isVacio(ALFANUMERIC_PATTERN_VACIA));
	}

	@Test
	public void estaVacia1() {
		assertFalse(vat.isVacio(ALFANUMERIC_PATTERN_BIEN));
	}

	@Test
	public void estaVacia2() {
		assertFalse(vat.isVacio(ALFANUMERIC_PATTERN_LETRAS));
	}

//TELEFONO
	@Test
	public void telefono() {
		assertTrue(vat.cumplePhoneNumber(PHONE_PATTERN_BIEN));
	}

	@Test
	public void telefono1() {
		assertFalse(vat.cumplePhoneNumber(PHONE_PATTERN_MAL));
	}

	@Test
	public void telefono2() {
		assertFalse(vat.cumplePhoneNumber(PHONE_PATTERN_CORTO));
	}

	@Test
	public void telefono3() {
		assertFalse(vat.cumplePhoneNumber(PHONE_PATTERN_LARGO));
	}

//EMAIL
	@Test
	public void email() {
		assertTrue(vat.isEmailValido(EMAIL_PATTERN_BIEN));
	}

	@Test
	public void email1() {
		assertFalse(vat.isEmailValido(EMAIL_PATTERN_MAL));
	}

	@Test
	public void email2() {
		assertFalse(vat.isEmailValido(EMAIL_PATTERN_NULL));
	}

	@Test
	public void email3() {
		assertFalse(vat.isEmailValido(EMAIL_PATTERN_VACIO));

	}

	@Test
	public void email4() {
		assertFalse(vat.isEmailValido(EMAIL_PATTERN_CORTO));
	}

	@Test
	public void dni() {
		assertTrue(vat.cumpleDNI(DNI_PATTERN_BIEN));
	}

	@Test
	public void dni1() {
		assertFalse(vat.cumpleDNI(DNI_PATTERN_NULO));
	}

	@Test
	public void dni2() {
		assertFalse(vat.cumpleDNI(DNI_PATTERN_MAL));
	}

	@Test
	public void dni3() {
		assertFalse(vat.cumpleDNI(DNI_PATTERN_CORTO));
	}

	@Test
	public void dni4() {
		assertFalse(vat.cumpleDNI(DNI_PATTERN_LARGO));
	}

	@Test
	public void dni5() {
		assertFalse(vat.cumpleDNI(DNI_PATTERN_VACIO));
	}

	@Test
	public void rango() {
		assertTrue(vat.cumpleRango(15, 10, 25));
	}

	@Test
	public void rango1() {
		assertFalse(vat.cumpleRango(50, 55, 25));
	}

	@Test
	public void rango2() {
		assertFalse(vat.cumpleRango(25, 80, 10));
	}

	@Test
	public void rango3() {
		assertTrue(vat.cumpleRango(85, 25, 155));
	}

	@Test
	public void longitudMinima() {
		assertTrue(vat.cumpleLongitudMin(LONGITUD_MINIMA, 12));
	}

	@Test
	public void longitudMinima1() {
		assertFalse(vat.cumpleLongitudMin(LONGITUD_MINIMA, 55));
	}

	@Test
	public void longitudMaxima() {
		assertTrue(vat.cumpleLongitudMax(LONGITUD_MAXIMA, 55));
	}

	@Test
	public void longitudMaxima2() {
		assertFalse(vat.cumpleLongitudMax(LONGITUD_MAXIMA, 15));
	}

	@Test
	public void cumpleLongitud() {
		assertTrue(vat.cumpleLongitud(LONGITUD_CUMPLIDA, 15, 55));
	}

	@Test
	public void cumpleLongitud1() {
		assertFalse(vat.cumpleLongitud(LONGITUD_CUMPLIDA, 55, 15));
	}

	@Test
	public void password() {
		assertTrue(vat.esPasswordValida(PASSWORD_BIEN));
	}

	@Test
	public void password1() {
		assertFalse(vat.esPasswordValida(PASSWORD_CORTA));
	}

	@Test
	public void password2() {
		assertFalse(vat.esPasswordValida(PASSWORD_LARGA));
	}

	@Test
	public void password3() {
		assertFalse(vat.esPasswordValida(PASSWORD_LETRAS));
	}

	@Test
	public void password4() {
		assertFalse(vat.esPasswordValida(PASSWORD_NUMEROS));
	}

	@Test
	public void password5() {
		assertFalse(vat.esPasswordValida(PASSWORD_NULO));
	}

	@Test
	public void fechaMin() {
		assertTrue(vat.valDateMin(FECHA_MINIMA_BIEN, FECHA_MINIMA));
	}

	@Test
	public void fechaMin1() {
		assertFalse(vat.valDateMin(FECHA_MINIMA_CORTA, FECHA_MINIMA));
	}

	@Test
	public void fechaMin2() {
		assertFalse(vat.valDateMin(FECHA_MINIMA_MAL, FECHA_MINIMA));
	}

	@Test
	public void fechaMin3() {
		assertFalse(vat.valDateMin(null, FECHA_MINIMA));
	}

	@Test
	public void fechaMax1() {
		assertTrue(vat.valDateMax(FECHA_MAXIMA_BIEN, FECHA_MAXIMA));
	}

	@Test
	public void fechaMax2() {
		assertFalse(vat.valDateMax(FECHA_MAXIMA_MAL, FECHA_MAXIMA));
	}

	@Test
	public void fechaMax3() {
		assertFalse(vat.valDateMax(FECHA_MAXIMA_NULA, FECHA_MAXIMA));
	}

	@Test
	public void fechaValida() {
		assertFalse(vat.esFechaValida(FECHA_CORTA));
	}

	@Test
	public void fechaValida1() {
		assertTrue(vat.esFechaValida(FECHA_BUENA));
	}

	@Test
	public void fechaValida2() {
		assertFalse(vat.esFechaValida(FECHA_LARGA));
	}

	@Test
	public void fechaValida3() {
		assertFalse(vat.esFechaValida(FECHA_MAL_PUESTA));
	}

	@Test
	public void fechaValida4() {
		assertFalse(vat.esFechaValida(FECHA_LARGA));
	}

	@Test
	public void codProducto() {
		assertTrue(vat.idCodigoProducto(COD_PRODUCTO_BUENO));
	}

	@Test
	public void codProducto1() {
		assertFalse(vat.idCodigoProducto(COD_PRODUCTO_MAL));
	}

	@Test
	public void codProducto2() {
		assertFalse(vat.idCodigoProducto(COD_PRODUCTO_NULL));
	}

	@Test
	public void codProducto3() {
		assertFalse(vat.idCodigoProducto(COD_PRODUCTO_LARGO));
	}

	@Test
	public void codProducto4() {
		assertFalse(vat.idCodigoProducto(COD_PRODUCTO_VACIO));
	}

	@Test
	public void codProducto5() {
		assertFalse(vat.idCodigoProducto(COD_PRODUCTO_MAS_NUMERO));
	}

	@Test
	public void codProducto6() {
		assertFalse(vat.idCodigoProducto(COD_PRODUCTO_CORTO));
	}

}
