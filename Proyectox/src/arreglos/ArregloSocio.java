package arreglos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import clase.Socio;



public class ArregloSocio {
private ArrayList<Socio> soc;
	
	public ArregloSocio(){
		
		soc = new ArrayList<Socio>();
		//cargarBoleta();
		
	}
	public int tamaño(){
		return soc.size();
	}
    public void eliminar(Socio b){
    	soc.remove(b);
    }
    public void adicionar (Socio b){
    	soc.add(b);
    }                      
    public Socio  obtener(int p){
    	return soc.get(p);
    }                
    public Socio buscar(int x){
    	Socio b;
    	for (int i = 0; i < tamaño(); i++) {
			b=obtener(i);
			if (b.getCodigoSocio()==x) {
				return b ;
			}
		}
       return null;
    	
    }
    void grabarboleta(){
    	try { 
    		PrintWriter p;
    		String l; 
    		Socio x;
    		
    		p= new PrintWriter(new FileWriter("Bungalow.txt"));
    		for (int i = 0; i < tamaño(); i++) {
				x=obtener(i);
				l=x.getCodigoSocio()+";"+x.getNombres()+";"+x.getApellidos()
				+";"+x.getDni()+";"+x.getTelefono();
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
			String soc;
			String nom;
			String ape;
			String dni;
			String telf;
			while ((l=b.readLine())!= null) {
				s=l.split(";");
				soc=s[0].trim();
				nom=s[1].trim();
				ape=s[2].trim();
				dni=s[3].trim();
				telf=s[4].trim();
				
				
				adicionar(new Socio(Integer.parseInt(soc),nom,
						ape,dni,telf));
				
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No se pudo Cargar los datos");
			System.out.println(e.getMessage());
		}
	
	}


}
