package arreglos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import clase.Ingreso;



public class ArregloIngreso {
private ArrayList<Ingreso> ing;
	
	public ArregloIngreso(){
		
		ing = new ArrayList<Ingreso>();
		//cargarBoleta();
		
	}
	public int tamaño(){
		return ing.size();
	}
    public void eliminar(Ingreso b){
    	ing.remove(b);
    }
    public void adicionar (Ingreso b){
    	ing.add(b);
    }                      
    public Ingreso  obtener(int p){
    	return ing.get(p);
    }                
    public Ingreso buscar(int x){
    	Ingreso b;
    	for (int i = 0; i < tamaño(); i++) {
			b=obtener(i);
			if (b.getCodigoIngreso()==x) {
				return b ;
			}
		}
       return null;
    	
    }
    public void grabarIngreso(){
    	try { 
    		PrintWriter p;
    		String l; 
    		Ingreso x;
    		
    		p= new PrintWriter(new FileWriter("Ingreso.txt"));
    		for (int i = 0; i < tamaño(); i++) {
				x=obtener(i);
				l=x.getCodigoIngreso()+";"+x.getCodigoSocio()+";"+x.getFechaIngreso()
				+";"+x.getHoraIngreso()+";"+x.getNumeroInvitados()+";"+x.getCostoIngreso()+";"+x.getEstado();
				p.println(l);
			}
    		p.close();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No se pudo Guardar los datos");
			System.out.println(e.getMessage());
		}
    }
		public void cargarIngreso() {
		try {
			
			BufferedReader b ;
			String s[];
			b= new BufferedReader(new FileReader("Ingreso.txt"));
			String l;
			String ing;
			String soc;
			String fing;
			String hing;
			String invi;
			String cing;
			String est;
			while ((l=b.readLine())!= null) {
				s=l.split(";");
				ing=s[0].trim();
				soc=s[1].trim();
				fing=s[2].trim();
				hing=s[3].trim();
				invi=s[4].trim();
				cing=s[5].trim();
				est=s[6].trim();
				
				adicionar(new Ingreso(Integer.parseInt(ing),Integer.parseInt(soc),fing,
						hing,Integer.parseInt(invi),Double.parseDouble(cing),Integer.parseInt(est)));
				
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No se pudo Cargar los datos");
			System.out.println(e.getMessage());
		}
	
	}
	
	public int code(){
		if(tamaño()==0){
			return 10001;
		}else{
			return obtener(tamaño()-1).getCodigoIngreso()+1;
		}
	}



}
