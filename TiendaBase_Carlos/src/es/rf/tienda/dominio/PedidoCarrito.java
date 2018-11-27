package es.rf.tienda.dominio;

import java.util.Calendar;

public class PedidoCarrito {

	private int idPedido;
	private int idUsuario;
	private String idProducto;
	private int carCantidad;
	private double carPrecio;
	private Direccion carEnvio;
	private Direccion carPago;
	private String carTarjeta;
	private Calendar carFeCadud;
	private int carCcv;
	private String carNombre;
	private int carStat;
	private String[] carFeCambio;

	public PedidoCarrito() {

	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}

	public int getCarCantidad() {
		return carCantidad;
	}

	public void setCarCantidad(int carCantidad) {
		this.carCantidad = carCantidad;
	}

	public double getCarPrecio() {
		return carPrecio;
	}

	public void setCarPrecio(double carPrecio) {
		this.carPrecio = carPrecio;
	}

	public Direccion getCarEnvio() {
		return carEnvio;
	}

	public void setCarEnvio(Direccion carEnvio) {
		this.carEnvio = carEnvio;
	}

	public Direccion getCarPago() {
		return carPago;
	}

	public void setCarPago(Direccion carPago) {
		this.carPago = carPago;
	}

	public String getCarTarjeta() {
		return carTarjeta;
	}

	public void setCarTarjeta(String carTarjeta) {
		this.carTarjeta = carTarjeta;
	}

	public Calendar getCarFeCadud() {
		return carFeCadud;
	}

	public void setCarFeCadud(Calendar carFeCadud) {
		this.carFeCadud = carFeCadud;
	}

	public int getCarCcv() {
		return carCcv;
	}

	public void setCarCcv(int carCcv) {
		this.carCcv = carCcv;
	}

	public String getCarNombre() {
		return carNombre;
	}

	public void setCarNombre(String carNombre) {
		this.carNombre = carNombre;
	}

	public int getCarStat() {
		return carStat;
	}

	public void setCarStat(int carStat) {
		this.carStat = carStat;
	}

	public String[] getCarFeCambio() {
		return carFeCambio;
	}

	public void setCarFeCambio(String[] carFeCambio) {
		this.carFeCambio = carFeCambio;
	}

}
