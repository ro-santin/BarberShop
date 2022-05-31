/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Controller.MenuPrincipalController;

/**
 *
 * @author Administrator
 */
public class MenuPrincipal extends javax.swing.JFrame {

    private final MenuPrincipalController controller;
    
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        this.controller = new MenuPrincipalController(this);
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
        jMenuBar1 = new javax.swing.JMenuBar();
        Cadastro = new javax.swing.JMenu();
        MenuCliente = new javax.swing.JMenuItem();
        MenuServico = new javax.swing.JMenuItem();
        MenuOperaca = new javax.swing.JMenu();
        MenuAgenda = new javax.swing.JMenuItem();
        menuRelatorio = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/fundo-MenuPrincipal.jpg"))); // NOI18N
        jLabel1.setToolTipText("");
        jLabel1.setMaximumSize(new java.awt.Dimension(1366, 768));
        jLabel1.setMinimumSize(new java.awt.Dimension(640, 480));
        jLabel1.setPreferredSize(new java.awt.Dimension(1366, 768));

        Cadastro.setText("Cadastro");

        MenuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/cliente-icon.png"))); // NOI18N
        MenuCliente.setText("Cliente");
        MenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuClienteActionPerformed(evt);
            }
        });
        Cadastro.add(MenuCliente);

        MenuServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/tesoura-icon.png"))); // NOI18N
        MenuServico.setText("Serviço");
        Cadastro.add(MenuServico);

        jMenuBar1.add(Cadastro);

        MenuOperaca.setText("Operação");

        MenuAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/agenda-icon.png"))); // NOI18N
        MenuAgenda.setText("Agenda");
        MenuAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAgendaActionPerformed(evt);
            }
        });
        MenuOperaca.add(MenuAgenda);

        jMenuBar1.add(MenuOperaca);

        menuRelatorio.setText("Relatório");
        jMenuBar1.add(menuRelatorio);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuClienteActionPerformed

    private void MenuAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAgendaActionPerformed
        this.controller.navegarParaAgenda();
    }//GEN-LAST:event_MenuAgendaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Cadastro;
    private javax.swing.JMenuItem MenuAgenda;
    private javax.swing.JMenuItem MenuCliente;
    private javax.swing.JMenu MenuOperaca;
    private javax.swing.JMenuItem MenuServico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuRelatorio;
    // End of variables declaration//GEN-END:variables
}
