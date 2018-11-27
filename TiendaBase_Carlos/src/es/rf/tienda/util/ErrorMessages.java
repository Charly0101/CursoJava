package es.rf.tienda.util;

/* *****************************************************
 * NOMBRE: ErrorMessages.java
 * 
 * DESCRIPCION:  
 * 			Clase con los String que contienen los mensajes de error 
 * 			especificados por las reglas de negocio.
 * 
 *  @version	Noviembre 2018
 *  
 *  @author 	Carlos Galindo
 *  
 *  *****************************************************/
public class ErrorMessages {

	/**
	 * Codigo de producto
	 */
	public final static String PROERR_001 = "Formato codigo erroneo";
	public final static String PROERR_002 = "Longitud de codigo erroneo";
	public final static String PROERR_004 = "El campo tipoUsuario tiene que ser mayor que 0";
	public final static String PROERR_005 = "La fecha es erronea";
	/**
	 * Campo con longitud erronea
	 */
	public final static String PROERR_003 = "La longitud de ? ha de estar entre ? y ?";

	public static String mensaje(String msg, String[] param) {
		return "";
	}

	public static String mensajes(String mensaje, String... datos) {
		String salida = "";
		int contador = 0;
		for (int a = 0; a < mensaje.length(); a++) {
			if (mensaje.charAt(a) == '?') {
				if (contador <= datos.length)
					salida += datos[contador++];
				else
					salida += "?" + contador++ + "?";

			} else
				salida += mensaje.charAt(a);
		}
		return salida;
	}

}
