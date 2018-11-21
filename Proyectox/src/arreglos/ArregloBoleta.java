package arreglos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import clase.Boleta;

public class ArregloBoleta {
	private ArrayList<Boleta> bolet;
	//public ArrayList<Boleta> bol = new ArrayList<>();
	public ArregloBoleta(){
		
		bolet = new ArrayList<Boleta>();
		//cargarBoleta();
		
	}
	public int tamaño(){
		return bolet.size();
	}
    public void eliminar(Boleta b){
    	bolet.remove(b);
    }
    public void adicionar (Boleta b){
    	bolet.add(b);
    }                      
    public Boleta  obtener(int p){
    	return bolet.get(p);
    }                
    public Boleta buscar(int x){
    	Boleta b;
    	for (int i = 0; i < tamaño(); i++) {
			b=obtener(i);
			if (b.getCodigoBoleta()==x) {
				return b ;
			}
		}
       return null;
    	
    }
    void grabarboleta(){
    	try { 
    		PrintWriter p;
    		String l; 
    		Boleta x;
    		
    		p= new PrintWriter(new FileWriter("boleta.txt"));
    		for (int i = 0; i < tamaño(); i++) {
				x=obtener(i);
				l=x.getCodigoBoleta()+";"+x.getCodigoIngreso()+";"+x.getPagoTotal();
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
			b= new BufferedReader(new FileReader("boleta.txt"));
			String l;
			String  cod;
			String codIngre;
			String total;
			while ((l=b.readLine())!= null) {
				s=l.split(";");
				cod=s[0];
				codIngre=s[1].trim();
				total=s[2].toString().trim();
				adicionar(new Boleta(Integer.parseInt(cod),Integer.parseInt(codIngre),Double.parseDouble(total)));
				
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No se pudo Cargar los datos");
			System.out.println(e.getMessage());
		}
	
	}

}
