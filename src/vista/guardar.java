/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * guardar.java
 *
 * Created on 25/09/2010, 04:18:30 PM
 */

package vista;

import controlador.control_listados;
import controlador.control_masivo;
import javax.swing.JFileChooser;
import modelo.filtros;
import modelo.registro_listados;

/**
 *
 * @author AN
 */
public class guardar extends javax.swing.JFrame {
    private String ruta=null;
    private filtros filtro;
    private registro_listados rl = new registro_listados();

    /** Creates new form guardar */
    public guardar() {
        initComponents();
this.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(this);


        filtro= new filtros();

        this.sitio.setFileFilter(filtro);
       

        control_listados cl=new control_listados(this);
        sitio.addActionListener(cl);

       

    }

    public String getRuta() {
        return ruta;
    }

    public  void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public JFileChooser getSitio() {
        return sitio;
    }

    public void setSitio(JFileChooser sitio) {
        this.sitio = sitio;
    }

    public registro_listados getRl() {
        return rl;
    }

    public void setRl(registro_listados rl) {
        this.rl = rl;
    }

  
   



    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sitio = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("GUARDAR..........Desarrollado por el Ing Cusatti Andy");

        sitio.setDialogTitle("");
        sitio.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sitio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sitio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guardar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser sitio;
    // End of variables declaration//GEN-END:variables

}