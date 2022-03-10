/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;

/**
 *
 * @author Dev. Aníbal Henrique
 */
public class SerialKey extends javax.swing.JFrame {

    /**
     * Creates new form SerialKey
     */
    public SerialKey() {
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

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jColorChooser1 = new javax.swing.JColorChooser();
        jColorChooser2 = new javax.swing.JColorChooser();
        jLabel2 = new javax.swing.JLabel();
        txtSerialKey = new javax.swing.JTextField();
        btnNextSerialKey = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        titleSerialKeyMaster = new javax.swing.JLabel();
        titleSerialKey = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelSerialKey = new javax.swing.JLabel();
        checkBoxLastVersionsOn = new javax.swing.JCheckBox();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Serial Key ");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(710, 460));
        setPreferredSize(new java.awt.Dimension(710, 460));
        getContentPane().setLayout(null);
        getContentPane().add(txtSerialKey);
        txtSerialKey.setBounds(150, 200, 420, 22);

        btnNextSerialKey.setText("Próximo");
        btnNextSerialKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextSerialKeyActionPerformed(evt);
            }
        });
        getContentPane().add(btnNextSerialKey);
        btnNextSerialKey.setBounds(560, 340, 75, 22);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(50, 20, 615, 10);

        titleSerialKeyMaster.setForeground(new java.awt.Color(255, 255, 255));
        titleSerialKeyMaster.setText("Para utilizar todos recursos do ecossistema Barca, você vai precisar de uma chave como serial. ");
        getContentPane().add(titleSerialKeyMaster);
        titleSerialKeyMaster.setBounds(100, 50, 497, 16);

        titleSerialKey.setForeground(new java.awt.Color(255, 255, 255));
        titleSerialKey.setText("Este programa tem privilégios em categorias de usuários, no modo básico você tem gratuito uma chave.");
        getContentPane().add(titleSerialKey);
        titleSerialKey.setBounds(90, 70, 550, 16);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(710, 460));
        jPanel1.setPreferredSize(new java.awt.Dimension(710, 460));

        labelSerialKey.setForeground(new java.awt.Color(255, 255, 255));
        labelSerialKey.setText("Serial Key");

        checkBoxLastVersionsOn.setBackground(new java.awt.Color(0, 0, 0));
        checkBoxLastVersionsOn.setForeground(new java.awt.Color(255, 255, 255));
        checkBoxLastVersionsOn.setText("Deseja instalar as últimas versões das ferramentas?");
        checkBoxLastVersionsOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxLastVersionsOnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(checkBoxLastVersionsOn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(labelSerialKey)))
                .addContainerGap(235, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(213, Short.MAX_VALUE)
                .addComponent(labelSerialKey)
                .addGap(78, 78, 78)
                .addComponent(checkBoxLastVersionsOn)
                .addGap(133, 133, 133))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, -10, 710, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkBoxLastVersionsOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxLastVersionsOnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxLastVersionsOnActionPerformed

    private void btnNextSerialKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextSerialKeyActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new FinishPage().setVisible(true);
    }//GEN-LAST:event_btnNextSerialKeyActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SerialKey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SerialKey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SerialKey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SerialKey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SerialKey().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNextSerialKey;
    private javax.swing.JCheckBox checkBoxLastVersionsOn;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelSerialKey;
    private javax.swing.JLabel titleSerialKey;
    private javax.swing.JLabel titleSerialKeyMaster;
    private javax.swing.JTextField txtSerialKey;
    // End of variables declaration//GEN-END:variables
}
