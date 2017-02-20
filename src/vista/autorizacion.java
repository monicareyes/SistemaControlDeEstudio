/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * autorizacion.java
 *
 * Created on 11/10/2010, 09:19:55 AM
 */

package vista;

import com.nilo.plaf.nimrod.NimRODLookAndFeel;
import com.nilo.plaf.nimrod.NimRODTheme;
import controlador.control_autorizacion;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import modelo.otros;

/**
 *
 * @author AN
 */
public class autorizacion extends javax.swing.JFrame {
    

    /** Creates new form autorizacion */
    public autorizacion() {
        initComponents();
     setLocationRelativeTo(null);
       
     control_autorizacion ca = new control_autorizacion(this);

     ingresar.addActionListener(ca);
     cedula.addKeyListener(ca);
     contraseña.addKeyListener(ca);

     otros o = new otros();
     o.sistema_operativo();

    }






    public JTextField getCedula() {
        return cedula;
    }

    public void setCedula(JTextField cedula) {
        this.cedula = cedula;
    }

    public JPasswordField getContraseña() {
        return contraseña;
    }

    public void setContraseña(JPasswordField contraseña) {
        this.contraseña = contraseña;
    }

    public JLabel getVersion() {
        return version;
    }

    public void setVersion(JLabel version) {
        this.version = version;
    }

  









    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cedula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();
        ingresar = new javax.swing.JButton();
        version = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AUTORIZACION..............Desarrollado por el Ing. Cusatti Andy");

        cedula.setToolTipText("coloque el numero de su cedula de identidad");
        cedula.setName("cedula"); // NOI18N

        jLabel1.setText("CEDULA:");

        jLabel2.setText("CONTRASEÑA:");

        contraseña.setToolTipText("ingrese su contraseña");
        contraseña.setName("contraseña"); // NOI18N

        ingresar.setText("INGRESAR");

        version.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        version.setText("V 8.2");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/actualizacion_de_datos/imagenes/candado.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(version, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(28, 28, 28)
                            .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(contraseña))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(version))
                        .addGap(12, 12, 12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) throws UnsupportedLookAndFeelException {

 NimRODTheme nt = new NimRODTheme();

        nt.setPrimary( new Color(153,244,51));
        nt.setPrimary1( new Color(133,224,31));
        nt.setPrimary2( new Color(143,234,41));
        nt.setPrimary3( new Color(153,244,51));

        nt.setSecondary(new Color(222,230,250));
        nt.setSecondary1(new Color(202,210,230));
        nt.setSecondary2(new Color(212,220,240));
        nt.setSecondary3(new Color(222,230,250));

        nt.setMenuOpacity(20);
        nt.setFrameOpacity(20);
        nt.setOpacity(20);

            NimRODLookAndFeel NimRODLF = new NimRODLookAndFeel();
            NimRODLF.setCurrentTheme( nt);
            UIManager.setLookAndFeel( NimRODLF);

     
      /*NimRODTheme nt = new NimRODTheme();
      NimRODLookAndFeel NimRODLF = new NimRODLookAndFeel();
      NimRODLF.setCurrentTheme( nt);
      UIManager.setLookAndFeel( NimRODLF);*/



        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new autorizacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cedula;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JButton ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel version;
    // End of variables declaration//GEN-END:variables

}
