package es.rf.tienda.dominio;

import es.rf.tienda.exception.DomainException;
import es.rf.tienda.util.ErrorMessages;
import es.rf.tienda.util.Validator;

public class Direccion {

	private String dirNombre;
	private String dirDireccion;
	private String dirPoblacion;
	private String dirCPostal;
	private String dirProvincia;
	private String dirPais;
	private String dirCorreoE;

	public Direccion() {

	}

	public String getDirNombre() {
		return dirNombre;
	}

	public void setDirNombre(String dirNombre) throws DomainException {
		if (Validator.isAlfanumeric(dirNombre))
			this.dirNombre = dirNombre;
		else
			throw new DomainException(ErrorMessages.PROERR_001);
	}

	public String getDirDireccion() {
		return dirDireccion;
	}

	public void setDirDireccion(String dirDireccion) throws DomainException {
		if (Validator.isAlfanumeric(dirDireccion))
			this.dirDireccion = dirDireccion;
		else
			throw new DomainException(ErrorMessages.PROERR_001);
	}

	public String getDirPoblacion() {
		return dirPoblacion;
	}

	public void setDirPoblacion(String dirPoblacion) throws DomainException {
		if (Validator.isAlfanumeric(dirPoblacion))
			this.dirPoblacion = dirPoblacion;
		else
			throw new DomainException(ErrorMessages.PROERR_001);
	}

	public String getDirCPostal() {
		return dirCPostal;
	}

	public void setDirCPostal(String dirCPostal) throws DomainException {
		if (Validator.isAlfanumeric(dirCPostal))
			this.dirCPostal = dirCPostal;
		else
			throw new DomainException(ErrorMessages.PROERR_001);
	}

	public String getDirProvincia() {
		return dirProvincia;
	}

	public void setDirProvincia(String dirProvincia) throws DomainException {
		if (Validator.isAlfanumeric(dirProvincia))
			this.dirProvincia = dirProvincia;
		else
			throw new DomainException(ErrorMessages.PROERR_001);
	}

	public String getDirPais() {
		return dirPais;
	}

	public void setDirPais(String dirPais) throws DomainException {
		if (Validator.isAlfanumeric(dirPais))
			this.dirPais = dirPais;
		else
			throw new DomainException(ErrorMessages.PROERR_001);
	}

	public String getDirCorreoE() {
		return dirCorreoE;
	}

	public void setDirCorreoE(String dirCorreoE) throws DomainException {
		if (Validator.isAlfanumeric(dirCorreoE))
			this.dirCorreoE = dirCorreoE;
		else
			throw new DomainException(ErrorMessages.PROERR_001);
	}

}
