package es.rf.tienda.dominio;

import java.util.Calendar;

import es.rf.tienda.exception.DomainException;
import es.rf.tienda.util.ErrorMessages;
import es.rf.tienda.util.Validator;

public class Producto {

	private Calendar c = Calendar.getInstance();

	private String idProducto;
	private String proDescripcion;
	private String proDesLarga;
	private double proPrecio;
	private int proStock;
	private Calendar proFecRepo;
	private Calendar proFecActi;
	private Calendar proFecDesac;
	private String proUniVenta;
	private double proCantXUniVenta;
	private String proUniUltNivel;
	private int idPais;
	private String proUsoRecomendado;
	private int idCategoria;
	private int proStkReservado;
	private int proNStkAlto;
	private int proNStkBajo;
	private char proStat;

	public Producto() {

	}

	public String getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(String idProducto) throws DomainException {
		if (Validator.idCodigoProducto(idProducto))
			this.idProducto = idProducto;
		else
			throw new DomainException(ErrorMessages.mensaje(ErrorMessages.PROERR_001, new String[] {}));
	}

	public String getProDescripcion() {
		return proDescripcion;
	}

	public void setProDescripcion(String proDescripcion) throws DomainException {
		if (Validator.cumpleLongitud(proDescripcion, 5, 100))
			this.proDescripcion = proDescripcion;
		else
			throw new DomainException(
					ErrorMessages.mensaje(ErrorMessages.PROERR_003, new String[] { "ProDescripcion", "5", "100" }));
	}

	public String getProDesLarga() {
		return proDesLarga;
	}

	public void setProDesLarga(String proDesLarga) throws DomainException {
		if (Validator.cumpleLongitud(proDesLarga, 5, 2000))
			this.proDesLarga = proDesLarga;
		else
			throw new DomainException(
					ErrorMessages.mensaje(ErrorMessages.PROERR_003, new String[] { "ProDesLarga", "5", "100" }));

	}

	public double getProPrecio() {
		return proPrecio;
	}

	public void setProPrecio(double proPrecio) throws DomainException {
		if (Validator.cumpleRango(proPrecio, 0, 100))
			this.proPrecio = proPrecio;
		else
			throw new DomainException(
					ErrorMessages.mensaje(ErrorMessages.PROERR_003, new String[] { "ProPrecio", "0", "100" }));
	}

	public int getProStock() {
		return proStock;
	}

	public void setProStock(int proStock) {
		this.proStock = proStock;
	}

	public Calendar getProFecRepo() {
		return proFecRepo;
	}

	public void setProFecRepo(Calendar proFecRepo) throws DomainException {
		if (Validator.valDateMax(proFecRepo, c))
			this.proFecRepo = proFecRepo;
		else
			throw new DomainException(ErrorMessages.mensaje(ErrorMessages.PROERR_005, new String[] {}));
	}

	public Calendar getProFecActi() {
		return proFecActi;
	}

	public void setProFecActi(Calendar proFecActi) throws DomainException {
		if (Validator.valDateMax(proFecActi, c))
			this.proFecActi = proFecActi;
		else
			throw new DomainException(ErrorMessages.mensaje(ErrorMessages.PROERR_005, new String[] {}));
	}

	public Calendar getProFecDesac() {
		return proFecDesac;
	}

	public void setProFecDesac(Calendar proFecDesac) {
		if (Validator.valDateMax(proFecDesac, c)) {
		} else {
			if (Validator.valDateMax(proFecDesac, proFecActi))
				this.proFecDesac = proFecDesac;
		}
	}

	public String getProUniVenta() {
		return proUniVenta;
	}

	public void setProUniVenta(String proUniVenta) {
		this.proUniVenta = proUniVenta;
	}

	public double getProCantXUniVenta() {
		return proCantXUniVenta;
	}

	public void setProCantXUniVenta(double proCantXUniVenta) {
		this.proCantXUniVenta = proCantXUniVenta;
	}

	public String getProUniUltNivel() {
		return proUniUltNivel;
	}

	public void setProUniUltNivel(String proUniUltNivel) {
		this.proUniUltNivel = proUniUltNivel;
	}

	public int getIdPais() {
		return idPais;
	}

	public void setIdPais(int idPais) {
		this.idPais = idPais;
	}

	public String getProUsoRecomendado() {
		return proUsoRecomendado;
	}

	public void setProUsoRecomendado(String proUsoRecomendado) {
		this.proUsoRecomendado = proUsoRecomendado;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public int getProStkReservado() {
		return proStkReservado;
	}

	public void setProStkReservado(int proStkReservado) {
		this.proStkReservado = proStkReservado;
	}

	public int getProNStkAlto() {
		return proNStkAlto;
	}

	public void setProNStkAlto(int proNStkAlto) {
		this.proNStkAlto = proNStkAlto;
	}

	public int getProNStkBajo() {
		return proNStkBajo;
	}

	public void setProNStkBajo(int proNStkBajo) {
		this.proNStkBajo = proNStkBajo;
	}

	public char getProStat() {
		return proStat;
	}

	public void setProStat(char proStat) {
		this.proStat = proStat;
	}

}
