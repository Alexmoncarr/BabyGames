/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package babygames;

/**
 *
 * @author aleja
 */
public class SalaMusicalPantalla extends javax.swing.JFrame {

    /**
     * Creates new form salaMusicalPantalla
     */
    public SalaMusicalPantalla() {
        initComponents();
    }

    SalaMusicalPantalla(PantallaPrincipal aThis, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        volverPiano = new javax.swing.JButton();
        doBajo = new javax.swing.JButton();
        re = new javax.swing.JButton();
        mi = new javax.swing.JButton();
        fa = new javax.swing.JButton();
        sol = new javax.swing.JButton();
        la = new javax.swing.JButton();
        si = new javax.swing.JButton();
        doAlto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/babygames/imagenes/PIANO.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 778, 450));

        volverPiano.setText("jButton1");
        getContentPane().add(volverPiano, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 80, -1));

        doBajo.setText("jButton1");
        getContentPane().add(doBajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 100, 310));

        re.setText("jButton2");
        getContentPane().add(re, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 80, 310));

        mi.setText("jButton3");
        getContentPane().add(mi, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 80, 310));

        fa.setText("jButton4");
        getContentPane().add(fa, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 90, 310));

        sol.setText("jButton5");
        getContentPane().add(sol, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 90, 310));

        la.setText("jButton6");
        getContentPane().add(la, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 80, 310));

        si.setText("jButton7");
        getContentPane().add(si, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, -1, 310));

        doAlto.setText("jButton8");
        getContentPane().add(doAlto, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, 90, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SalaMusicalPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalaMusicalPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalaMusicalPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalaMusicalPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalaMusicalPantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton doAlto;
    private javax.swing.JButton doBajo;
    private javax.swing.JButton fa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton la;
    private javax.swing.JButton mi;
    private javax.swing.JButton re;
    private javax.swing.JButton si;
    private javax.swing.JButton sol;
    private javax.swing.JButton volverPiano;
    // End of variables declaration//GEN-END:variables
}
