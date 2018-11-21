package clase;

public class Producto {
	
	private int codigoProducto; 
	private String detalle;
	private  int stock;
	private double precioUnitario;
	
	public Producto(int codigoProducto, String detalle, int stock, double precioUnitario) {
		super();
		this.codigoProducto = codigoProducto;
		this.detalle = detalle;
		this.stock = stock;
		this.precioUnitario = precioUnitario;
	}

	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

}
