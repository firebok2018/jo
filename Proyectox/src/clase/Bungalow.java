package clase;

public class Bungalow {
	private int numeroBungalow  ;
	private int categoria  ;
	private double precioDia;  
	private int estado  ;
	public Bungalow(int numeroBungalow, int categoria, double precioDia, int estado) {
		super();
		this.numeroBungalow = numeroBungalow;
		this.categoria = categoria;
		this.precioDia = precioDia;
		this.estado = estado;
	}
	public Bungalow() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getNumeroBungalow() {
		return numeroBungalow;
	}
	public void setNumeroBungalow(int numeroBungalow) {
		this.numeroBungalow = numeroBungalow;
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	public double getPrecioDia() {
		return precioDia;
	}
	public void setPrecioDia(double precioDia) {
		this.precioDia = precioDia;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
}
