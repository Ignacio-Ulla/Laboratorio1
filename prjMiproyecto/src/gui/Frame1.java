package gui;

import java.awt.Color;
import java.awt.Dimension;

import java.awt.Font;
import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Frame1 extends JFrame {
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JLabel jLabel3 = new JLabel();
    private JTextField txtN1 = new JTextField();
    private JTextField txtN2 = new JTextField();
    private JTextField txtResultado = new JTextField();
    private JButton btnNuevo = new JButton();
    private JButton btnSumar = new JButton();
    private JButton btnSalir = new JButton();
    private JButton btnRestar = new JButton();
    private JButton btnMultiplicar = new JButton();
    private JButton btnDividir = new JButton();

    public Frame1() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize( new Dimension(400, 300) );
        this.setTitle("EJERCICIO 1");
        jLabel1.setText("NUMERO 1");
        jLabel1.setBounds(new Rectangle(30, 60, 80, 15));
        jLabel1.setFont(new Font("Comic Sans MS", 1, 14));
        jLabel1.setForeground(Color.blue);
        jLabel2.setText("NUMERO 2");
        jLabel2.setBounds(new Rectangle(30, 95, 80, 15));
        jLabel2.setFont(new Font("Comic Sans MS", 1, 14));
        jLabel2.setForeground(Color.blue);
        jLabel3.setText("RESULTADO");
        jLabel3.setBounds(new Rectangle(30, 130, 90, 15));
        jLabel3.setFont(new Font("Comic Sans MS", 1, 14));
        jLabel3.setForeground(Color.blue);
        txtN1.setBounds(new Rectangle(145, 55, 65, 20));
        txtN2.setBounds(new Rectangle(145, 90, 65, 20));
        txtResultado.setBounds(new Rectangle(145, 125, 90, 20));
        btnNuevo.setText("NUEVO");
        btnNuevo.setBounds(new Rectangle(25, 230, 75, 21));
        btnNuevo.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    btnNuevo_actionPerformed(e);
                }
            });
        btnSumar.setText("SUMAR");
        btnSumar.setBounds(new Rectangle(260, 35, 75, 21));
        btnSumar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    btnSumar_actionPerformed(e);
                }
            });
        btnSalir.setText("SALIR");
        btnSalir.setBounds(new Rectangle(300, 230, 75, 21));
        btnSalir.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    btnSalir_actionPerformed(e);
                }
            });
        btnRestar.setText("RESTAR");
        btnRestar.setBounds(new Rectangle(260, 70, 75, 21));
        btnRestar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    btnRestar_actionPerformed(e);
                }
            });
        btnMultiplicar.setText("MULTIPLICAR");
        btnMultiplicar.setBounds(new Rectangle(260, 105, 100, 20));
        btnMultiplicar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    btnMultiplicar_actionPerformed(e);
                }
            });
        btnDividir.setText("DIVIDIR");
        btnDividir.setBounds(new Rectangle(260, 140, 75, 21));
        btnDividir.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    btnDividir_actionPerformed(e);
                }
            });
        this.getContentPane().add(btnDividir, null);
        this.getContentPane().add(btnMultiplicar, null);
        this.getContentPane().add(btnRestar, null);
        this.getContentPane().add(btnSalir, null);
        this.getContentPane().add(btnSumar, null);
        this.getContentPane().add(btnNuevo, null);
        this.getContentPane().add(txtResultado, null);
        this.getContentPane().add(txtN2, null);
        this.getContentPane().add(txtN1, null);
        this.getContentPane().add(jLabel3, null);
        this.getContentPane().add(jLabel2, null);
        this.getContentPane().add(jLabel1, null);
    }

    private void btnSumar_actionPerformed(ActionEvent e) {
        //Declaración de variables
        int n1,n2,re;
        
        //Asignación de datos a las variables
        /*
         * Las variables n1 y n2 deben recibir lo ingresado en las cajas de texto, sin
         * embargo, al ser de tipo entero no pueden recibir directamente lo que las cajas
         * contienen (String). Para solucionarlo, se hace uso de la función 
         * "Integer.parseInt(String)" con el fin de convertir a tipo entero el String recibido
         * de la respectiva caja.
         */
        n1 = Integer.parseInt(txtN1.getText());
        n2 = Integer.parseInt(txtN2.getText());
        
        //Procedimiento
        re = n1 + n2;
        
        //Devolver valores a las cajas de texto
        /*
         * Nuevamente, para mostrar el resultado en la caja de texto, necesitamos entregarle
         * un String, el tema es que "re" (variable que contiene el resultado que queremos
         * mostrar) es de tipo entero. Para resolver esto, se debe "forzar" a que la variable
         * de tipo entero se vea como variable de tipo String. Esto se hace con ""+variable.
         */
        txtResultado.setText(""+re);
    }

    private void btnNuevo_actionPerformed(ActionEvent e) {
        txtN1.setText("");
        txtN2.setText("");
        txtResultado.setText("");
        
        /*
         * También haremos uso del método ".requestFocus()" el cual permite enfocar
         * la caja de texto con el cursor. Esto quiere decir que, al presionar el botón
         * "Nuevo", la caja de texto "Numero 1" automáticamente quedará con el cursor colocado
         * para escribir en ella directamente.
         */
        txtN1.requestFocus();
    }

    private void btnRestar_actionPerformed(ActionEvent e) {
        int n1,n2,re;
        
        n1 = Integer.parseInt(txtN1.getText());
        n2 = Integer.parseInt(txtN2.getText());
        
        re = n1 - n2;
        
        txtResultado.setText(""+re);
    }

    private void btnMultiplicar_actionPerformed(ActionEvent e) {
        int n1,n2,re;
      
        n1 = Integer.parseInt(txtN1.getText());
        n2 = Integer.parseInt(txtN2.getText());
      
        re = n1 * n2;
      
        txtResultado.setText(""+re);
    }

    private void btnDividir_actionPerformed(ActionEvent e) {
        int n1,n2;
        double re;
      
        n1 = Integer.parseInt(txtN1.getText());
        n2 = Integer.parseInt(txtN2.getText());
      
        re = n1 / n2;
      
        txtResultado.setText(""+re);
    }

    private void btnSalir_actionPerformed(ActionEvent e) {
        //Salir del formulario
        
        /*
         * Hay dos métodos para hacerlo:
         *  - this.dispose() -> Cierra el objeto actual
         *  - System.exit(0) -> Cierra la aplicación
         *  
         *  En este caso usaremos el primero
         */
        System.exit(0);
    }
}
