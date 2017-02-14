/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * inicio.java
 *
 * Created on 07-jul-2009, 21:11:31
 */

package vista;

import com.nilo.plaf.nimrod.NimRODLookAndFeel;
import com.nilo.plaf.nimrod.NimRODTheme;
import controlador.control_inicio;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author AACM
 */
public class inicio extends javax.swing.JFrame {

    private String periodo_actual, privilegio;



    /** Creates new form inicio */
    public inicio() {
        initComponents();
        this.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);


      control_inicio ci = new control_inicio(this);

       entrar.addActionListener(ci);
       cedula.addKeyListener(ci);
       clave.setVisible(false);
       clave_etiqueta.setVisible(false);

       clave.addKeyListener(ci);
 //      if(!privilegio.equals("123 - ESTUDIANTE")) clave.setVisible(false);//si es cualquier privilegio distinto a estudiante se dehabilita la opcion de la clave


       entrar.setEnabled(false);
       entrar.setVisible(false);

    }




    public JLabel getClave_etiqueta() {
        return clave_etiqueta;
    }

    public void setClave_etiqueta(JLabel clave_etiqueta) {
        this.clave_etiqueta = clave_etiqueta;
    }





    public JTextField getCedula() {
        return cedula;
    }

    public String getPeriodo_actual() {
        return periodo_actual;
    }

    public void setPeriodo_actual(String periodo_actual) {
        this.periodo_actual = periodo_actual;
    }

    public JPasswordField getClave() {
        return clave;
    }

    public void setClave(JPasswordField clave) {
        this.clave = clave;
    }

    public String getPrivilegio() {
        return privilegio;
    }

    public void setPrivilegio(String privilegio) {
        this.privilegio = privilegio;
    }








    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        clave = new javax.swing.JPasswordField();
        clave_etiqueta = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SISTEMA DE VERIFICACION.....Desarrollado por el Ing. Cusatti Andy");

        entrar.setText("ENTRAR");

        jLabel1.setText("CEDULA");

        cedula.setName("cedula"); // NOI18N

        clave.setName("clave"); // NOI18N

        clave_etiqueta.setText("CLAVE");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(41, 41, 41)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel1)
                    .add(clave_etiqueta))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, clave)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, cedula, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(42, 42, 42)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(cedula, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(clave, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(clave_etiqueta))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel14.setFont(new java.awt.Font("Arial", 1, 11));
        jLabel14.setText("REPUBLICA BOLIVARIANA DE VENEZUELA");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 11));
        jLabel15.setText("MINISTERIO DEL PODER POPULAR PARA LA DEFENSA");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 11));
        jLabel16.setText("UNIVERSIDAD NACIONAL EXPERIMENTAL POLITÉCNICA DE LA FUERZA ARMADA NACIONAL");

        jLabel19.setFont(new java.awt.Font("Arial", 1, 11));
        jLabel19.setText("NUCLEO ARAGUA - EXTENSION CAGUA");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/actualizacion_de_datos/imagenes/unafa_mod_1.png"))); // NOI18N

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(38, 38, 38)
                .add(jLabel13)
                .add(60, 60, 60)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(115, 115, 115)
                        .add(jLabel14))
                    .add(layout.createSequentialGroup()
                        .add(84, 84, 84)
                        .add(jLabel15))
                    .add(layout.createSequentialGroup()
                        .add(126, 126, 126)
                        .add(jLabel19))
                    .add(jLabel16))
                .addContainerGap(101, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(341, Short.MAX_VALUE)
                .add(entrar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 92, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(322, 322, 322))
            .add(layout.createSequentialGroup()
                .add(245, 245, 245)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(228, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(24, 24, 24)
                .add(jLabel14)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel15)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel16)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel19)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 85, Short.MAX_VALUE)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(42, 42, 42)
                .add(entrar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(53, 53, 53))
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel13)
                .addContainerGap(311, Short.MAX_VALUE))
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


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cedula;
    private javax.swing.JPasswordField clave;
    private javax.swing.JLabel clave_etiqueta;
    private javax.swing.JButton entrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
