package arreglos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import clase.Producto;



public class ArregloProducto {
private ArrayList<Producto> pro;
	
	public ArregloProducto(){
		
		pro = new ArrayList<Producto>();
		//cargarBoleta();
		
	}
	public int tamaño(){
		return pro.size();
	}
    public void eliminar(Producto b){
    	pro.remove(b);
    }
    public void adicionar (Producto b){
    	pro.add(b);
    }                      
    public Producto  obtener(int p){
    	return pro.get(p);
    }                
    public Producto buscar(int x){
    	Producto b;
    	for (int i = 0; i < tamaño(); i++) {
			b=obtener(i);
			if (b.getCodigoProducto()==x) {
				return b ;
			}
		}
       return null;
    	
    }
    void grabarboleta(){
    	try { 
    		PrintWriter p;
    		String l; 
    		Producto x;
    		
    		p= new PrintWriter(new FileWriter("Bungalow.txt"));
    		for (int i = 0; i < tamaño(); i++) {
				x=obtener(i);
				l=x.getCodigoProducto()+";"+x.getDetalle()+";"+x.getStock()
				+";"+x.getPrecioUnitario();
				p.println(l);
			}
    		p.close();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No se pudo Guardar los datos");
			System.out.println(e.getMessage());
		}
    }
	@SuppressWarnings("resource")
	void cargarBoleta() {
		try {
			
			BufferedReader b ;
			String s[];
			b= new BufferedReader(new FileReader("Bungalow.txt"));
			String l;
			String cod;
			String det;
			String sto;
			String uni;
			
			while ((l=b.readLine())!= null) {
				s=l.split(";");
				cod=s[0].trim();
				det=s[1].trim();
				sto=s[2].trim();
				uni=s[3].trim();
			
				adicionar(new Producto(Integer.parseInt(cod),det,
						Integer.parseInt(sto),Double.parseDouble(uni)));
				
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No se pudo Cargar los datos");
			System.out.println(e.getMessage());
		}
	
	}



}
