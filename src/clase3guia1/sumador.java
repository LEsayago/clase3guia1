/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3guia1;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class sumador extends javax.swing.JFrame {

    /**
     * Creates new form sumador
     */
    public sumador() {
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

        jLSUMADOR = new javax.swing.JLabel();
        jLnum1 = new javax.swing.JLabel();
        jLnum2 = new javax.swing.JLabel();
        jTINGRESO2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jBsumacion = new javax.swing.JButton();
        jBlimpiacion = new javax.swing.JButton();
        jLRESULTADO = new javax.swing.JLabel();
        jTNUM1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLSUMADOR.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLSUMADOR.setText("      Sumador");

        jLnum1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLnum1.setText("ingrese un numero ");

        jLnum2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLnum2.setText("ingrese un numero ");

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));
        jPanel1.setForeground(new java.awt.Color(204, 0, 51));

        jBsumacion.setText("sumacion");
        jBsumacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsumacionActionPerformed(evt);
            }
        });

        jBlimpiacion.setText("limpiacion");
        jBlimpiacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimpiacionActionPerformed(evt);
            }
        });

        jLRESULTADO.setText("Resultado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jBsumacion)
                        .addGap(47, 47, 47)
                        .addComponent(jBlimpiacion))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLRESULTADO)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBsumacion)
                    .addComponent(jBlimpiacion))
                .addGap(18, 18, 18)
                .addComponent(jLRESULTADO)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLSUMADOR, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLnum2)
                            .addComponent(jLnum1))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTINGRESO2)
                            .addComponent(jTNUM1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 33, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLSUMADOR, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLnum1)
                    .addComponent(jTNUM1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLnum2)
                    .addComponent(jTINGRESO2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsumacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsumacionActionPerformed
       try{ int num1= Integer.parseInt(jTNUM1.getText());
        int num2= Integer.parseInt(jTINGRESO2.getText());
        jLRESULTADO.setText((num1+num2)+"");}
       catch(Exception error){
       JOptionPane.showMessageDialog(this,"que estas poniendo?" );
       jTNUM1.setText("");
       jTINGRESO2.setText("");
       jLRESULTADO.setText("Resultado");}
    }//GEN-LAST:event_jBsumacionActionPerformed

    private void jBlimpiacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimpiacionActionPerformed
       jTNUM1.setText("");
       jTINGRESO2.setText("");
       jLRESULTADO.setText("Resultado");
    }//GEN-LAST:event_jBlimpiacionActionPerformed

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
            java.util.logging.Logger.getLogger(sumador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sumador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sumador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sumador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sumador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBlimpiacion;
    private javax.swing.JButton jBsumacion;
    private javax.swing.JLabel jLRESULTADO;
    private javax.swing.JLabel jLSUMADOR;
    private javax.swing.JLabel jLnum1;
    private javax.swing.JLabel jLnum2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTINGRESO2;
    private javax.swing.JTextField jTNUM1;
    // End of variables declaration//GEN-END:variables
}
