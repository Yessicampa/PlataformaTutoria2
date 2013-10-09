import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import listaenlazada.Metodos;
import listaenlazada.Nodo;
public class Interfaz extends JFrame implements ActionListener {
	
        
        JLabel l1 = new JLabel("Codigo de la ciudad ");
	JLabel l2 = new JLabel("Numero habitantes");
	JLabel l3 = new JLabel("Extension territorial");
        JLabel l4 = new JLabel("Listado de ciudades");
       JLabel l5 = new JLabel("No Total habitantes");
               JLabel l6 = new JLabel("Promedio");
	TextArea ta1 = new TextArea("Para desplegar la lista",5,20,TextArea.SCROLLBARS_BOTH);
	
	JTextField t1 = new JTextField("1");
	JTextField t2 = new JTextField();
	JTextField t3 = new JTextField();
	JTextField t4 = new JTextField("0");
	JTextField t5 = new JTextField("0");
	JButton b1 = new JButton("Agregar");
	JButton b2 = new JButton("Listar 1");
	JButton b3 = new JButton("Listar 2");
        JButton b4 = new JButton("Listar 3");
        
        
	   Metodos met = new Metodos();
	String cadena = "";
		
	public Interfaz(){
		super("Ciudad");
		this.setLayout(null);
		
//		se crean las etiquetas y se agregan al formulario
		this.l1.setBounds(10, 10, 170, 23);
		this.add(l1);
		
		this.l2.setBounds(10, 35, 170, 23);
		this.add(l2);
		
		this.l3.setBounds(10, 60, 170, 23);
		this.add(l3);
		
		this.l4.setBounds(130, 120, 160, 23);
		this.add(l4);
                //se crean los textos y se agregan al formulario
		this.t1.setBounds(150, 10, 200, 23);
		this.add(t1);
		
		this.t2.setBounds(150, 35, 200, 23);
		this.add(t2);
		
	//	this.t3.setEditable(false);
		this.t3.setBounds(150, 60, 200, 23);
		this.add(t3);
                this.l5.setBounds(10, 310, 160, 23);
		this.add(l5);
                this.t4.setBounds(130, 310, 200, 23);
		this.add(t4);
                
                this.l6.setBounds(10, 340, 160, 23);
		this.add(l6);
                this.t5.setBounds(130, 340, 200, 23);
		this.add(t5);
                
                ta1.setEditable(false);
                
//		se crean los botones y se agregan el formulario
		this.b1.setBounds(100, 90, 160, 25);
		this.b1.addActionListener(this);
		this.add(b1);
		
		this.b2.setBounds(280, 155, 80, 25);
		this.b2.addActionListener(this);
		this.add(b2);

                this.b3.setBounds(280, 185, 80, 25);
		this.b3.addActionListener(this);
		this.add(b3);
                
                this.b4.setBounds(280, 220, 80, 25);
		this.b4.addActionListener(this);
		this.add(b4);
                
                
                this.ta1.setBounds(10, 150, 260, 150);
		this.add(ta1);
                
                
                
                t1.setEditable(false);
                t4.setEditable(false);
                t5.setEditable(false);
		//Cerrar el formulario
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(420,400);
		this.setResizable(false);
		this.setVisible(true);
	}
	public static void main (String arg[]){
		
            new Interfaz();
	}
	
	public void actionPerformed(ActionEvent arg0) {
if (arg0.getSource()==b1){
                    
			if (t1.getText().equals("") || t2.getText().equals("")|| t3.getText().equals("") ){
				JOptionPane.showMessageDialog(new JDialog(), "Faltan Datos");
			}else {
				Nodo no = new Nodo();
                                
				no.codigo= t1.getText();
				no.nHabitantes=Integer.parseInt(t2.getText());
                                no.extensionT=Integer.parseInt(t3.getText());
//Cambiar numero de ciudad
                                int n=1;
                                no.codigo=t1.getText();
                                n=(Integer.parseInt(no.codigo))+1;
                                t1.setText(Integer.toString(n));

				met.adicionar(no);
                            
                //      Halla el numero Total de habitantes
                        no.nHabitantes= Integer.parseInt(t2.getText());
                        int numero= Integer.parseInt(t4.getText());
                        numero=numero+no.nHabitantes;
                        t4.setText(Integer.toString(numero));
                        //Promedio actual
                        int promedio= (numero/(n-1));
                        t5.setText(Integer.toString(promedio));
			clear(); 
                        

                        }
}
                    
if (arg0.getSource()==b2){		
			cadena = met.listar();
			ta1.setText(cadena);

}
if (arg0.getSource()==b3){
    //cadena=  met.buscar();
    //ta1.setText(cadena);
   
}
if( arg0.getSource()==b4){
Nodo no= new Nodo();
    if( Integer.parseInt(t4.getText()) > Integer.parseInt(t5.getText()) ){
        //met.listado();
    }
}
	}
//Metodo limpiar
        public void clear(){
		t2.setText("");
                t3.setText("");
		t1.requestFocus();
		
	}
}

