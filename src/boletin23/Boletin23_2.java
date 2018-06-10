package boletin23;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Boletin23_2 {
    JFrame marco;
    JPanel panel;
    JButton boton1, boton2;

    public Boletin23_2() {
      
        
        marco = new JFrame("CURSO DAM");
        panel = new JPanel();
        boton1 = new JButton("Programacion");
        boton2 = new JButton("Bases");
        
        
        marco.setSize(400, 200);
        panel.add(boton1);
        panel.add(boton2);
        marco.add(panel);
        cambiarTitulo tit = new cambiarTitulo();
        
       
        boton1.addActionListener(tit);
        boton2.addActionListener(tit);
        
        
        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    
    public class cambiarTitulo implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
          
            Object boton = ae.getSource();
            if (boton == boton1) {
                marco.setTitle("Programacion");
            } else {
                marco.setTitle("Bases de Datos");
            }
        }

    }    
}
