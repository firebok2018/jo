package arreglos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import clase.Bungalow;

public class ArregloBungalow {
	private ArrayList<Bungalow> bug;
	//public ArrayList<Boleta> bol = new ArrayList<>();
	public ArregloBungalow(){
		
		bug = new ArrayList<Bungalow>();
		//cargarBoleta();
		
	}
	public int tamaño(){
		return bug.size();
	}
    public void eliminar(Bungalow b){
    	bug.remove(b);
    }
    public void adicionar (Bungalow b){
    	bug.add(b);
    }                      
    public Bungalow  obtener(int p){
    	return bug.get(p);
    }                
    public Bungalow buscar(int x){
    	Bungalow b;
    	for (int i = 0; i < tamaño(); i++) {
			b=obtener(i);
			if (b.getNumeroBungalow()==x) {
				return b ;
			}
		}
       return null;
    	
    }
    void grabarboleta(){
    	try { 
    		PrintWriter p;
    		String l; 
    		Bungalow x;
    		
    		p= new PrintWriter(new FileWriter("Bungalow.txt"));
    		for (int i = 0; i < tamaño(); i++) {
				x=obtener(i);
				l=x.getNumeroBungalow()+";"+x.getCategoria()+";"+x.getPrecioDia()+";"+x.getEstado();
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
			String  num;
			String cad;
			String pre;
			String est; 
			while ((l=b.readLine())!= null) {
				s=l.split(";");
				num=s[0];
				cad=s[1].trim();
				pre=s[2].trim();
				est=s[3].trim();
				
				adicionar(new Bungalow(Integer.parseInt(num),Integer.parseInt(cad),Double.parseDouble(pre),Integer.parseInt(est)));
				
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No se pudo Cargar los datos");
			System.out.println(e.getMessage());
		}
	
	}



}
