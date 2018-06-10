package boletin23;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Boletin23_3 {
    JFrame marco;
    JPanel panel;
    JButton boton1, boton2;

    public Boletin23_3() {
        
      
        marco = new JFrame("Boletin 23 Programacion");
        panel = new JPanel();
        boton1 = new JButton("Saludo");
        boton2 = new JButton("Despedida");
        
       
        marco.setSize(400, 200);
        panel.add(boton1);
        panel.add(boton2);
        marco.add(panel);
        mostrarMensaje mess = new mostrarMensaje();
        
        
        boton1.addActionListener(mess);
        boton2.addActionListener(mess);
        
        
        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    
    public class mostrarMensaje implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            Object boton = ae.getSource();
            if (boton == boton1) {
                JOptionPane.showMessageDialog(null, "Un saludo a DAM");
            } else {
                JOptionPane.showMessageDialog(null, "Fin de programa");
            }
        }

    }
    
}
