/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magazzinogui;

/**
 *
 * @author simone.riggio
 */
public class GuiM extends javax.swing.JFrame {
    Magazzino m1=new Magazzino();
    String n="";
    String c="";
    int q;
    double p;
    /**
     * Creates new form GuiM
     */
    public GuiM() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabella1 = new javax.swing.JTable();
        Rimuovi = new javax.swing.JButton();
        aggiungi = new javax.swing.JButton();
        Modifica = new javax.swing.JButton();
        TestoNome = new javax.swing.JTextField();
        TestoCodice = new javax.swing.JTextField();
        TestoQuantita = new javax.swing.JTextField();
        TestoPrezzo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rimuovicod = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabella1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Codice", "Quantità", "Prezzo"
            }
        ));
        jScrollPane1.setViewportView(tabella1);

        Rimuovi.setText("Rimuovi");
        Rimuovi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Rimuovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RimuoviActionPerformed(evt);
            }
        });

        aggiungi.setText("Aggiungi");
        aggiungi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aggiungi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aggiungiActionPerformed(evt);
            }
        });

        Modifica.setText("Modifica quantità per codice");
        Modifica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Modifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificaActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel2.setText("Codice");

        jLabel3.setText("Quantità");

        jLabel4.setText("Prezzo");

        rimuovicod.setText("Rimuovi per codice");
        rimuovicod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rimuovicodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Modifica)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(aggiungi, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TestoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TestoCodice, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(TestoQuantita, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(TestoPrezzo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(rimuovicod)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Rimuovi, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(aggiungi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Modifica))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Rimuovi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rimuovicod))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TestoQuantita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TestoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TestoPrezzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(TestoCodice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aggiungiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aggiungiActionPerformed
        // TODO add your handling code here:
        javax.swing.table.DefaultTableModel model=(javax.swing.table.DefaultTableModel)tabella1.getModel();
        Object[] v={TestoNome.getText(), TestoCodice.getText(), TestoQuantita.getText(), TestoPrezzo.getText()};
        if(TestoNome.getText().length()>0 && TestoCodice.getText().length()>0 && TestoQuantita.getText().length()>0 && TestoPrezzo.getText().length()>0){
            model.addRow(v);
        }
        TestoNome.setText("");
        TestoCodice.setText("");
        TestoQuantita.setText("");
        TestoPrezzo.setText("");
        m1.aggiungi(n,c,q,p);
        
    }//GEN-LAST:event_aggiungiActionPerformed

    private void RimuoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RimuoviActionPerformed
        // TODO add your handling code here:
        javax.swing.table.DefaultTableModel model=(javax.swing.table.DefaultTableModel)tabella1.getModel();
        int a= tabella1.getSelectedRow();
        if(a==-1){
            
        } else{ 
            model.removeRow(tabella1.getSelectedRow());
        }
        TestoNome.setText("");
        TestoCodice.setText("");
        TestoQuantita.setText("");
        TestoPrezzo.setText("");
        m1.eliminaProdotto(c);
    }//GEN-LAST:event_RimuoviActionPerformed

    private void ModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificaActionPerformed
        // TODO add your handling code here:
        javax.swing.table.DefaultTableModel model=(javax.swing.table.DefaultTableModel)tabella1.getModel();
        Object[] v={TestoCodice.getText(), TestoQuantita.getText()};
        if(TestoCodice.getText().length()>0 && TestoQuantita.getText().length()>0){
            model.setValueAt(v, q, q);
        }
        TestoCodice.setText("");
        TestoQuantita.setText("");
        m1.modificaQuantità(c,q);
    }//GEN-LAST:event_ModificaActionPerformed

    private void rimuovicodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rimuovicodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rimuovicodActionPerformed

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
            java.util.logging.Logger.getLogger(GuiM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiM().setVisible(true);
            }
        });
        Magazzino m1=new Magazzino();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Modifica;
    private javax.swing.JButton Rimuovi;
    private javax.swing.JTextField TestoCodice;
    private javax.swing.JTextField TestoNome;
    private javax.swing.JTextField TestoPrezzo;
    private javax.swing.JTextField TestoQuantita;
    private javax.swing.JButton aggiungi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton rimuovicod;
    private javax.swing.JTable tabella1;
    // End of variables declaration//GEN-END:variables
}
