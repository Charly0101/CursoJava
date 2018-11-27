package es.rf.tienda.dominio;

import java.util.Calendar;

import es.rf.tienda.exception.DomainException;
import es.rf.tienda.util.ErrorMessages;
import es.rf.tienda.util.Validator;

public class Usuario {

	final int LONGITUD_MINIMA_USER_NOMBRE = 5;
	final int LONGITUD_MAXIMA_USER_NOMBRE = 100;

	static int contador = 0;
	private int idUsuario;
	private String userNombre;
	private String userEmail;
	private String userPass;
	private int userTipo;
	private String userDni;
	private Calendar userFecAlta;
	private Calendar userFecConfirmacion;
	private Direccion userPago;
	private Direccion userEnvio;

	public Usuario() {
		idUsuario = ++contador;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {

		this.idUsuario = idUsuario;
	}

	public String getUserNombre() {
		return userNombre;
	}

	public void setUserNombre(String userNombre) throws DomainException {
		if (Validator.cumpleLongitud(userNombre, LONGITUD_MINIMA_USER_NOMBRE, LONGITUD_MAXIMA_USER_NOMBRE))
			this.userNombre = userNombre;
		else
			throw new DomainException(
					ErrorMessages.mensaje(ErrorMessages.PROERR_003, new String[] { "userNombre", "5", "100" }));
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) throws DomainException {
		if (Validator.isEmailValido(userEmail))
			this.userEmail = userEmail;
		else
			throw new DomainException(
					ErrorMessages.mensajes(ErrorMessages.PROERR_003, new String[] { "userEmail", "6", "100" }));
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) throws DomainException {
		if (Validator.esPasswordValida(userPass))
			this.userPass = userPass;
		else
			throw new DomainException(ErrorMessages.mensaje(ErrorMessages.PROERR_001, new String[] {}));

	}

	public int getUserTipo() {
		return userTipo;
	}

	public void setUserTipo(int userTipo) throws DomainException {
		if (userTipo>0)
		this.userTipo = userTipo;
		else 
			throw new DomainException(ErrorMessages.mensaje(ErrorMessages.PROERR_004, new String[] {}));
	}

	public String getUserDni() {
		return userDni;
	}

	public void setUserDni(String userDni) throws DomainException {
		if (Validator.cumpleDNI(userDni))
			this.userDni = userDni;
		else
			throw new DomainException(ErrorMessages.mensaje(ErrorMessages.PROERR_001, new String[] {}));
	}

	public Calendar getUserFecAlta() {
		return userFecAlta;
	}

	public void setUserFecAlta(Calendar userFecAlta) {
		this.userFecAlta = userFecAlta;
	}

	public Calendar getUserFecConfirmacion() {
		return userFecConfirmacion;
	}

	public void setUserFecConfirmacion(Calendar userFecConfirmacion) {
		this.userFecConfirmacion = userFecConfirmacion;
	}

	public Direccion getUserPago() {
		return userPago;
	}

	public void setUserPago(Direccion userPago) {
		this.userPago = userPago;
	}

	public Direccion getUserEnvio() {
		return userEnvio;
	}

	public void setUserEnvio(Direccion userEnvio) {
		this.userEnvio = userEnvio;
	}

}
