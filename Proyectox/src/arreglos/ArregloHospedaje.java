package arreglos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import clase.Hospedaje;



public class ArregloHospedaje {
	private ArrayList<Hospedaje> hos;
	
	public ArregloHospedaje(){
		
		hos = new ArrayList<Hospedaje>();
		//cargarBoleta();
		
	}
	public int tamaño(){
		return hos.size();
	}
    public void eliminar(Hospedaje b){
    	hos.remove(b);
    }
    public void adicionar (Hospedaje b){
    	hos.add(b);
    }                      
    public Hospedaje  obtener(int p){
    	return hos.get(p);
    }                
    public Hospedaje buscar(int x){
    	Hospedaje b;
    	for (int i = 0; i < tamaño(); i++) {
			b=obtener(i);
			if (b.getCodigoHospedaje()==x) {
				return b ;
			}
		}
       return null;
    	
    }
    void grabarboleta(){
    	try { 
    		PrintWriter p;
    		String l; 
    		Hospedaje x;
    		
    		p= new PrintWriter(new FileWriter("Bungalow.txt"));
    		for (int i = 0; i < tamaño(); i++) {
				x=obtener(i);
				l=x.getCodigoHospedaje()+";"+x.getCodigoIngreso()+";"+x.getNumeroBungalow()
				+";"+x.getFechaSalida()+";"+x.getHoraSalida()+";"+x.getCostoHospedaje()+";"+x.getEstado();
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
			String hosp;
			String ing;
			String num;
			String fsal;
			String hsal;
			String cos;
			String est;
			while ((l=b.readLine())!= null) {
				s=l.split(";");
				hosp=s[0];
				ing=s[1].trim();
				num=s[2].trim();
				fsal=s[3].trim();
				hsal=s[4].trim();
				cos=s[5].trim();
				est=s[6].trim();
				
				adicionar(new Hospedaje(Integer.parseInt(hosp),Integer.parseInt(ing),Integer.parseInt(num),
						fsal,hsal,Double.parseDouble(cos),Integer.parseInt(est)));
				
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No se pudo Cargar los datos");
			System.out.println(e.getMessage());
		}
	
	}



}


