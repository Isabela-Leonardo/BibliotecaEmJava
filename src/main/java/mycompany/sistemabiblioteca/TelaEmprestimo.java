package mycompany.sistemabiblioteca;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaEmprestimo extends javax.swing.JFrame {

    ControladorEmprestimo ce;
    ControladorCliente cc;
    ControladorLivro cl;
    
    public TelaEmprestimo() {
        initComponents();
    }
    
    public TelaEmprestimo(ControladorEmprestimo ce, ControladorCliente cc, ControladorLivro cl) {
        initComponents();
        this.ce = ce;
        this.cc = cc;
        this.cl = cl;
        
        List<Cliente> lista = new ArrayList<>();
        lista = cc.retornaTodos();
        
        for(Cliente clientelista: lista)
        {
            cmbCpf.addItem(String.valueOf(clientelista.getCpf()));
        }
        
        List<Livro> listaLivro = new ArrayList<>();
        listaLivro = cl.retornaTodos();
        
        for(Livro livrolista: listaLivro)
        {
            cmbIdLivro.addItem(String.valueOf(livrolista.getIdLivro()));
        }
        
        DefaultTableModel tabEmprestimo = (DefaultTableModel) tblEmprestimo.getModel();
        List<Emprestimo> listaEmprestimo = new ArrayList<>();
        listaEmprestimo = ce.retornaTodos();
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        for(Emprestimo emprestimolista: listaEmprestimo)
        {
            Object[] emprestimo = new Object[]{
                emprestimolista.getIdEmprestimo(),
                emprestimolista.getCpf(),
                emprestimolista.getIdLivro(),
                formato.format(emprestimolista.getDataSaida()),
                formato.format(emprestimolista.getDataDevolucaoEsperada()),
                formato.format(emprestimolista.getDataDevolucao())

                };
        
            tabEmprestimo.addRow(emprestimo);
        }
        txtIdEmprestimo.setEditable(true);
        txtDataSaida.setEditable(false);
        txtDataDevolucaoEsperada.setEditable(false);

        txtIdEmprestimo.requestFocus();
    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane5 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIdEmprestimo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbCpf = new javax.swing.JComboBox<>();
        cmbIdLivro = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblEmprestimo = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnDevolucao = new javax.swing.JButton();
        txtDataDevolucaoEsperada = new javax.swing.JTextField();
        txtDataSaida = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(jTable1);

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SISTEMA BIBLIOTECA");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tela de Empréstimo");

        jLabel2.setText("ID Empréstimo:");

        jLabel3.setText("CPF Cliente:");

        cmbCpf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "selecione" }));
        cmbCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCpfActionPerformed(evt);
            }
        });

        cmbIdLivro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "selecione" }));
        cmbIdLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIdLivroActionPerformed(evt);
            }
        });

        jLabel6.setText("ID Livro:");

        jLabel7.setText("Data de saída(DS):");

        jLabel8.setText("Data de devolução esperada(DVE):");

        tblEmprestimo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CPF", "ID Livro", "DS", "DVE", "DV"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tblEmprestimo);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnDevolucao.setText("Devolução");
        btnDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolucaoActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalvar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnDevolucao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir)))
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIdEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPesquisar))
                            .addComponent(cmbCpf, 0, 201, Short.MAX_VALUE)
                            .addComponent(cmbIdLivro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDataDevolucaoEsperada, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbIdLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtDataDevolucaoEsperada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSalvar)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnDevolucao))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolucaoActionPerformed
        
        int linha = tblEmprestimo.getSelectedRow();
        
        if(linha == -1)
        {
            JOptionPane.showMessageDialog(this, "selecione um emprestimo", "MENSAGEM DE ERRO", JOptionPane.ERROR_MESSAGE);
        }
        
        else
        {
            TelaDevolucao td = new TelaDevolucao(this.ce, Integer.parseInt(tblEmprestimo.getValueAt(linha, 0).toString()));
            td.setVisible(true);
        }
        
    }//GEN-LAST:event_btnDevolucaoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try
        {    
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
       
            Emprestimo e = new Emprestimo(Integer.parseInt(txtIdEmprestimo.getText()), formato.parse(txtDataSaida.getText()), formato.parse(txtDataDevolucaoEsperada.getText()), cmbCpf.getSelectedItem().toString(), Integer.parseInt(cmbIdLivro.getSelectedItem().toString()));


            String idEmprestimo = txtIdEmprestimo.getText();
            String cpf = cmbCpf.getSelectedItem().toString();
            String idLivro = cmbIdLivro.getSelectedItem().toString();
            String dataSaida = txtDataSaida.getText();
            String dataDevolucaoEsperada = txtDataDevolucaoEsperada.getText();
        
            if (idEmprestimo.equals("") || "selecione".equals(idLivro) || "selecione".equals(cpf) ||  dataSaida.equals("") || dataDevolucaoEsperada.equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Preencha todos os dados do formulario antes de inserir na tabela", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
                return;
            } 
            

            if (ce.salvarEmprestimo(e)) 
            {
                JOptionPane.showMessageDialog(this, "Emprestimo salvo com sucesso!");
            } 
            else 
            {
                JOptionPane.showMessageDialog(this, "Ocorreu um erro, os dados do emprestimo não foram salvos!", "Mensagem de Erro", JOptionPane.ERROR_MESSAGE);
            }
       
            DefaultTableModel tabEmprestimo = (DefaultTableModel) tblEmprestimo.getModel();

            while (tabEmprestimo.getRowCount() > 0) {
                tabEmprestimo.removeRow(0);
            }
            
            
        
            List<Emprestimo> lista = new ArrayList<>();
            lista = ce.retornaTodos();
            for (Emprestimo emprestimoLista : lista) {
                Object[] emprestimo = new Object[] {
                    emprestimoLista.getIdEmprestimo(),
                    emprestimoLista.getCpf(),
                    emprestimoLista.getIdLivro(),
                    formato.format(emprestimoLista.getDataSaida()),
                    formato.format(emprestimoLista.getDataDevolucaoEsperada()),
                    ""
                    
                };
                tabEmprestimo.addRow(emprestimo);
            }
        
        
            txtIdEmprestimo.setText("");
            cmbCpf.setSelectedIndex(0);
            txtDataSaida.setText("");
            cmbIdLivro.setSelectedIndex(0);
            txtDataDevolucaoEsperada.setText("");

            txtIdEmprestimo.setEditable(true);
            txtDataSaida.setEditable(false);
            txtDataDevolucaoEsperada.setEditable(false);

            txtIdEmprestimo.requestFocus();
        }
        
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "erro", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void cmbCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCpfActionPerformed
//        if(cmbCpf.getSelectedIndex() == 0)
//        {
//            JOptionPane.showMessageDialog(this, "ERRO, selecione um CPF", "mensagem de erro", JOptionPane.ERROR_MESSAGE);
//        }
//        
//        else
//        {
//            cmbCpf.getSelectedItem().toString();
//        }
        
    }//GEN-LAST:event_cmbCpfActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try
        {
            int linha = tblEmprestimo.getSelectedRow();

            if(linha == -1)
            {
                JOptionPane.showMessageDialog(this, "Nenhum emprestimo foi selecionado!", "Mensagem de Erro", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                int confirma = JOptionPane.showConfirmDialog(this, "confirma a exclusão do emprestimo selecionadoo?");

                if(confirma == 0)
                {
                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

                    Emprestimo emprestimoExcluir = new Emprestimo(
                            Integer.parseInt(tblEmprestimo.getValueAt(linha, 0).toString()), 
                            formato.parse(tblEmprestimo.getValueAt(linha, 3).toString()),
                            formato.parse(tblEmprestimo.getValueAt(linha, 4).toString()),
                            tblEmprestimo.getValueAt(linha, 1).toString(), 
                            Integer.parseInt(tblEmprestimo.getValueAt(linha, 2).toString())
                    );

                    if(ce.excluirEmprestimo(emprestimoExcluir))
                    {
                        DefaultTableModel tabEmprestimo = (DefaultTableModel) tblEmprestimo.getModel();
                        tabEmprestimo.removeRow(linha);
                        JOptionPane.showMessageDialog(this, "Emprestimo excluído com sucesso!");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Ocorreu um erro, o emprestimo não foi excluído!", "Mensagem de Erro", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }

            txtIdEmprestimo.setText("");
            cmbCpf.setSelectedIndex(0);
            cmbIdLivro.setSelectedIndex(0);
            txtDataSaida.setText("");
            txtDataDevolucaoEsperada.setText("");
            txtIdEmprestimo.requestFocus();
        }
        
        catch(Exception e)
       {
           JOptionPane.showMessageDialog(this, "erro", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
       }
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void cmbIdLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIdLivroActionPerformed
//        if(cmbIdLivro.getSelectedIndex() == 0)
//        {
//            JOptionPane.showMessageDialog(this, "ERRO, selecione um ID", "mensagem de erro", JOptionPane.ERROR_MESSAGE);
//        }
//        
//        else
//        {
//            cmbIdLivro.getSelectedItem().toString();
//           
//        }
    }//GEN-LAST:event_cmbIdLivroActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            if (txtIdEmprestimo.getText().equals("")) {
                JOptionPane.showMessageDialog(this,"ID do livro a ser pesquisado não foi preenchido!","Mensagem de Erro",JOptionPane.ERROR_MESSAGE);
                txtIdEmprestimo.requestFocus();
                return;
            }
            
            Emprestimo e = ce.pesquisarEmprestimo(Integer.parseInt(txtIdEmprestimo.getText()));           

            txtDataSaida.setEditable(true);
            txtDataDevolucaoEsperada.setEditable(true);

            if (e == null) {
                txtDataSaida.setText("");
                txtDataDevolucaoEsperada.setText("");
                cmbCpf.setSelectedIndex(0);
                cmbIdLivro.setSelectedIndex(0);
            }
            else {
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                txtIdEmprestimo.setEditable(false);
                cmbCpf.setSelectedItem(e.getCpf());
                cmbIdLivro.setSelectedItem(String.valueOf(e.getIdLivro()));
                txtDataSaida.setText(formato.format(e.getDataSaida()));
                txtDataDevolucaoEsperada.setText(formato.format(e.getDataDevolucaoEsperada()));
            }
            cmbCpf.requestFocus();
        }
        catch(Exception erro) {
            JOptionPane.showMessageDialog(this,"ID do Livro deve ser numérico!","Mensagem de Erro", JOptionPane.ERROR_MESSAGE);
            txtIdEmprestimo.setText("");
            txtIdEmprestimo.requestFocus();
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEmprestimo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDevolucao;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cmbCpf;
    private javax.swing.JComboBox<String> cmbIdLivro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblEmprestimo;
    private javax.swing.JTextField txtDataDevolucaoEsperada;
    private javax.swing.JTextField txtDataSaida;
    private javax.swing.JTextField txtIdEmprestimo;
    // End of variables declaration//GEN-END:variables
}
