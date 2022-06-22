package c2ejercicio4;

import javax.swing.JOptionPane;

public class C2Ejercicio4 {

    public static void main(String[] args) {
        
            int ventana;
            String [] botones = {"Base mas comision", "Por comision"};
       
            ventana = JOptionPane.showOptionDialog(null,"Elige una opcion","Empleados", JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,botones,botones[0]);
            int opcion = ventana;
       
            switch(opcion)
            {
                case 0:
                    InterfazBaseMasComision baseComision = new InterfazBaseMasComision();
                    baseComision.setVisible(true);
                    break;
                case 1: 
                    InterfazPorComision comision = new InterfazPorComision();
                    comision.setVisible(true);
                    break;
            }
    }
    
}
