/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.GUI;

import br.ufrn.interfaces.AtualizacoesPoluicao;
import java.awt.Color;

/**
 *
 * @author Residentes
 */
public class SecretariaMeioAmbiente extends javax.swing.JFrame implements AtualizacoesPoluicao{

    /**
     * Creates new form SecretariaMeioAmbiente
     */
    
    private static final SecretariaMeioAmbiente SECRETARIA_MEIO_AMBIENTE = new SecretariaMeioAmbiente();
    
    public static SecretariaMeioAmbiente getInstance(){
        return SECRETARIA_MEIO_AMBIENTE;
    }
    
    private SecretariaMeioAmbiente() {
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

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanelArea1 = new javax.swing.JPanel();
        jLarea1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanelArea2 = new javax.swing.JPanel();
        jLarea2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanelArea3 = new javax.swing.JPanel();
        jLarea3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SECREATRIA DE MEIO AMBIENTE");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanelArea1.setBorder(javax.swing.BorderFactory.createTitledBorder("Area 1"));

        jLarea1.setText("----");

        jLabel1.setText("Situacao:");

        javax.swing.GroupLayout jPanelArea1Layout = new javax.swing.GroupLayout(jPanelArea1);
        jPanelArea1.setLayout(jPanelArea1Layout);
        jPanelArea1Layout.setHorizontalGroup(
            jPanelArea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArea1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelArea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLarea1)
                    .addComponent(jLabel1))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanelArea1Layout.setVerticalGroup(
            jPanelArea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArea1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLarea1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelArea2.setBorder(javax.swing.BorderFactory.createTitledBorder("Area 2"));

        jLarea2.setText("----");

        jLabel2.setText("Situacao:");

        javax.swing.GroupLayout jPanelArea2Layout = new javax.swing.GroupLayout(jPanelArea2);
        jPanelArea2.setLayout(jPanelArea2Layout);
        jPanelArea2Layout.setHorizontalGroup(
            jPanelArea2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArea2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelArea2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLarea2)
                    .addComponent(jLabel2))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanelArea2Layout.setVerticalGroup(
            jPanelArea2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArea2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLarea2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelArea3.setBorder(javax.swing.BorderFactory.createTitledBorder("Area 3"));

        jLarea3.setText("----");

        jLabel3.setText("Situacao:");

        javax.swing.GroupLayout jPanelArea3Layout = new javax.swing.GroupLayout(jPanelArea3);
        jPanelArea3.setLayout(jPanelArea3Layout);
        jPanelArea3Layout.setHorizontalGroup(
            jPanelArea3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArea3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelArea3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLarea3)
                    .addComponent(jLabel3))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanelArea3Layout.setVerticalGroup(
            jPanelArea3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArea3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLarea3)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelArea1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelArea2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelArea3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelArea3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelArea2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelArea1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
            java.util.logging.Logger.getLogger(SecretariaMeioAmbiente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecretariaMeioAmbiente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecretariaMeioAmbiente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecretariaMeioAmbiente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecretariaMeioAmbiente().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLarea1;
    private javax.swing.JLabel jLarea2;
    private javax.swing.JLabel jLarea3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelArea1;
    private javax.swing.JPanel jPanelArea2;
    private javax.swing.JPanel jPanelArea3;
    // End of variables declaration//GEN-END:variables

    @Override
    public void atualizar(int area, String situacao) {
        if (area == 1) {
                jLarea1.setText(situacao);
                
        }
        
        else if(area == 2){
           
                jLarea2.setText(situacao);
               
        }
        
        else if (area == 3){
             
                jLarea3.setText(situacao);
               
        }
    }

   
    
}
