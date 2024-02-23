package mycompany.sistemabiblioteca;

import javax.swing.JOptionPane;


public class TelaPesquisa extends javax.swing.JFrame {
     ControladorCliente cc;
     ControladorLivro cl;
     ControladorEmprestimo ce;
     
    public TelaPesquisa() {
        initComponents();
    }
    
     public TelaPesquisa(ControladorCliente cc, ControladorLivro cl, ControladorEmprestimo ce) {
        initComponents();
        this.cc = cc;
        this.cl = cl;
        this.ce = ce;
        
        txtDigite.setEditable(false);
        txtInformacao1.setEditable(false);
        txtInformacao2.setEditable(false);
        txtMensagem2.setEditable(false);
        txtMensagem1.setEditable(false);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        rbtLivro = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        rbtCliente = new javax.swing.JRadioButton();
        rbtEmprestimo = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        txtPesquisa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        txtDigite = new javax.swing.JTextField();
        txtMensagem1 = new javax.swing.JTextField();
        txtInformacao1 = new javax.swing.JTextField();
        txtInformacao2 = new javax.swing.JTextField();
        txtMensagem2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SISTEMA BIBLIOTECA");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tela de Pesquisa");

        buttonGroup1.add(rbtLivro);
        rbtLivro.setText("Livro");
        rbtLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtLivroActionPerformed(evt);
            }
        });

        jLabel2.setText("Escolha uma opção para fazer a pesquisa:");

        buttonGroup1.add(rbtCliente);
        rbtCliente.setText("Cliente");
        rbtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtClienteActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtEmprestimo);
        rbtEmprestimo.setText("Empréstimo");
        rbtEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtEmprestimoActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPesquisar)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtDigite, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(txtDigite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPesquisar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("Detalhes da opção selecionada:");

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(rbtLivro)
                        .addGap(49, 49, 49)
                        .addComponent(rbtCliente)
                        .addGap(40, 40, 40)
                        .addComponent(rbtEmprestimo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnLimpar)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtInformacao1)
                                            .addComponent(txtInformacao2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtMensagem1)
                                            .addComponent(txtMensagem2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtLivro)
                    .addComponent(rbtCliente)
                    .addComponent(rbtEmprestimo))
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMensagem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInformacao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInformacao2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMensagem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnLimpar)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
         Cliente c = cc.pesquisarCliente(Integer.parseInt(txtPesquisa.getText()));
         Livro l = cl.pesquisarLivro(Integer.parseInt(txtPesquisa.getText()));
         Emprestimo e = ce.pesquisarEmprestimo(Integer.parseInt(txtPesquisa.getText()));
            
            
            if(rbtCliente.isSelected())
            {
                if(c == null)
                    {
                        JOptionPane.showMessageDialog(this,"Cliente não encontrado!","Mensagem de Erro",JOptionPane.ERROR_MESSAGE);
                    }
            
                else
                    {
                        txtInformacao1.setText("Nome:");
                        txtInformacao1.setEditable(false);
                        txtMensagem1.setText(c.getNome());
                        txtMensagem1.setEditable(false);
                        
                        txtInformacao2.setText("Email:");
                        txtInformacao2.setEditable(false);
                        txtMensagem2.setText(c.getEmail());
                        txtMensagem2.setEditable(false);
                        
                    }
            }
            
            if(rbtLivro.isSelected())
            {
                if(l == null)
                    {
                        JOptionPane.showMessageDialog(this,"Livro não encontrado!","Mensagem de Erro",JOptionPane.ERROR_MESSAGE);
                    }
                
                else
                    {
                        txtInformacao1.setText("Nome:");
                        txtInformacao1.setEditable(false);
                        txtMensagem1.setText(l.getNome());
                        txtMensagem1.setEditable(false);
                        
                        txtInformacao2.setText("Genero:");
                        txtInformacao2.setEditable(false);
                        txtMensagem2.setText(l.getGenero());
                        txtMensagem2.setEditable(false);
                    }
            }
            
             if(rbtEmprestimo.isSelected())
            {
                if(e == null)
                    {
                        JOptionPane.showMessageDialog(this,"Emprestimo não encontrado!","Mensagem de Erro",JOptionPane.ERROR_MESSAGE);

                    }
                
                else
                    {
                        
                        txtInformacao1.setText("CPF Cliente:");
                        txtInformacao1.setEditable(false);
                        txtMensagem1.setText(e.getCpf());
                        txtMensagem1.setEditable(false);
                        
                        txtInformacao2.setText("ID Livro:");
                        txtInformacao2.setEditable(false);
                        txtMensagem2.setText(String.valueOf(e.getIdLivro()));
                        txtMensagem2.setEditable(false);
                    }
            }
    
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void rbtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtClienteActionPerformed
        txtDigite.setText("Digite o CPF embaixo:");
    }//GEN-LAST:event_rbtClienteActionPerformed

    private void rbtLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtLivroActionPerformed
        txtDigite.setText("Digite o ID do livro embaixo: ");
    }//GEN-LAST:event_rbtLivroActionPerformed

    private void rbtEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtEmprestimoActionPerformed
        txtDigite.setText("Digite o ID do empréstimo embaixo: ");
    }//GEN-LAST:event_rbtEmprestimoActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtPesquisa.setText("");
        txtInformacao1.setText("");
        txtMensagem1.setText("");
        txtInformacao2.setText("");
        txtMensagem2.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    
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
            java.util.logging.Logger.getLogger(TelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPesquisa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbtCliente;
    private javax.swing.JRadioButton rbtEmprestimo;
    private javax.swing.JRadioButton rbtLivro;
    private javax.swing.JTextField txtDigite;
    private javax.swing.JTextField txtInformacao1;
    private javax.swing.JTextField txtInformacao2;
    private javax.swing.JTextField txtMensagem1;
    private javax.swing.JTextField txtMensagem2;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
