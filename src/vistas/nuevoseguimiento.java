/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vistas;

/**
 *
 * @author Sala221
 */
public class nuevoseguimiento extends javax.swing.JFrame {
    
    public String Cierre = "";

    /**
     * Creates new form nuevoseguimiento
     */
    public nuevoseguimiento() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cierrequeja = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        MODIFICAR = new javax.swing.JMenuItem();
        jBtnVer = new javax.swing.JButton();
        jBtnAdicionar = new javax.swing.JButton();
        jBtnAgregar = new javax.swing.JButton();
        jbtnactualizar = new javax.swing.JButton();
        jBtnEliminar = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtxtcodisegui = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxtcodiPQRSM = new javax.swing.JTextField();
        jDateFecha = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextobservaciones = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextsatis_usuario = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jDateFecha2 = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jRBTNo = new javax.swing.JRadioButton();
        jRBTSi = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTblSegumientos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };

        MODIFICAR.setText("Modificar");
        MODIFICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MODIFICARActionPerformed(evt);
            }
        });
        jPopupMenu1.add(MODIFICAR);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBtnVer.setText("Ver Usuarios");
        jBtnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVerActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 650, -1, -1));

        jBtnAdicionar.setText("Adicionar Usuarios");
        jBtnAdicionar.setEnabled(false);
        jBtnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 650, -1, -1));

        jBtnAgregar.setText("Agregar Usuarios");
        getContentPane().add(jBtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 650, -1, -1));

        jbtnactualizar.setText("Actualizar");
        jbtnactualizar.setEnabled(false);
        getContentPane().add(jbtnactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 650, -1, -1));

        jBtnEliminar.setText("Eliminar Usuarios");
        jBtnEliminar.setEnabled(false);
        jBtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 650, -1, -1));

        jLabel34.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel34.setText("REGISTRO DE NUEVO SEGUIMIENTO");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 450, -1));

        jLabel1.setText("Numero de seguimiento");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 0, -1, -1));
        getContentPane().add(jtxtcodisegui, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 20, 30, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Numero del PQRSM:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        getContentPane().add(jtxtcodiPQRSM, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 30, -1));
        getContentPane().add(jDateFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 122, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Fecha Del seguimiento:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("SEGUMIENTO 1:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Observaciones:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jTextobservaciones.setColumns(20);
        jTextobservaciones.setRows(5);
        jScrollPane1.setViewportView(jTextobservaciones);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 641, 62));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Resultado satisfaccion del usuario:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jTextsatis_usuario.setColumns(20);
        jTextsatis_usuario.setRows(5);
        jScrollPane2.setViewportView(jTextsatis_usuario);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 540, 62));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Se cierra la quja ante el tratamiento dado:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));
        getContentPane().add(jDateFecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 122, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("SEGUMIENTO 2:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Fecha Del seguimiento:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        cierrequeja.add(jRBTNo);
        jRBTNo.setText("No");
        jRBTNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBTNoActionPerformed(evt);
            }
        });
        getContentPane().add(jRBTNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, -1, -1));

        cierrequeja.add(jRBTSi);
        jRBTSi.setText("Si");
        jRBTSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBTSiActionPerformed(evt);
            }
        });
        getContentPane().add(jRBTSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, -1, -1));

        jTblSegumientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTblSegumientos.setComponentPopupMenu(jPopupMenu1);
        jScrollPane3.setViewportView(jTblSegumientos);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 720, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnVerActionPerformed

    private void jBtnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAdicionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnAdicionarActionPerformed

    private void jBtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnEliminarActionPerformed

    private void MODIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MODIFICARActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_MODIFICARActionPerformed

    private void jRBTSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBTSiActionPerformed
        // TODO add your handling code here:
        
        Cierre = "Si";
    }//GEN-LAST:event_jRBTSiActionPerformed

    private void jRBTNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBTNoActionPerformed
        // TODO add your handling code here:
        Cierre = "No";
     
    }//GEN-LAST:event_jRBTNoActionPerformed

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
            java.util.logging.Logger.getLogger(nuevoseguimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nuevoseguimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nuevoseguimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nuevoseguimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nuevoseguimiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuItem MODIFICAR;
    public javax.swing.ButtonGroup cierrequeja;
    public javax.swing.JButton jBtnAdicionar;
    public javax.swing.JButton jBtnAgregar;
    public javax.swing.JButton jBtnEliminar;
    public javax.swing.JButton jBtnVer;
    public com.toedter.calendar.JDateChooser jDateFecha;
    public com.toedter.calendar.JDateChooser jDateFecha2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPopupMenu jPopupMenu1;
    public javax.swing.JRadioButton jRBTNo;
    public javax.swing.JRadioButton jRBTSi;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTable jTblSegumientos;
    public javax.swing.JTextArea jTextobservaciones;
    public javax.swing.JTextArea jTextsatis_usuario;
    public javax.swing.JButton jbtnactualizar;
    public javax.swing.JTextField jtxtcodiPQRSM;
    public javax.swing.JTextField jtxtcodisegui;
    // End of variables declaration//GEN-END:variables
}
