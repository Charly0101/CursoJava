package es.rf.tienda.dominio;

import es.rf.tienda.exception.DomainException;
import es.rf.tienda.util.ErrorMessages;
import es.rf.tienda.util.Validator;

/**
 * 
 * Nombre Categoria Descripcion Lista de categorías
 * 
 * @author Carlos Antonio Galindo Luján
 * @version 21 de Noviembre de 2018
 *
 */
public class Categoria {

	final int LONGITUD_MINIMA_CAT_NOMBRE = 5;
	final int LONGITUD_MAXIMA_CAT_NOMBRE = 50;

	final String ERROR_LONGITUD_CAT_NOMBRE = " El campo de nombre de categoria no cumple con longitud entre 5 y 50 ";

	static int contador = 0;

	private int idCategoria; // identificador categoria

	private String catNombre; // nombre de la categoria

	private String catDescripcion; // descripcion de la categoria

	public Categoria() {
		idCategoria = ++contador;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getCatNombre() {
		return catNombre;
	}

	public void setCatNombre(String catNombre) throws DomainException {
		if (Validator.cumpleLongitud(catNombre, LONGITUD_MINIMA_CAT_NOMBRE, LONGITUD_MAXIMA_CAT_NOMBRE))
			this.catNombre = catNombre;
		else
			throw new DomainException(
					ErrorMessages.mensajes(ErrorMessages.PROERR_003, new String[] { "catNombre", "5", "50" }));
	}

	public String getCatDescripcion() {
		return catDescripcion;
	}

	public void setCatDescripcion(String catDescripcion) {
		this.catDescripcion = catDescripcion;
	}

	@Override
	public String toString() {
		return "Categoria [idCategoria=" + idCategoria + ", catNombre=" + catNombre + ", catDescripcion="
				+ catDescripcion + "]";
	}

}
