package mycompany.sistemabiblioteca;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaLivro extends javax.swing.JFrame {
    
    ControladorLivro cl;
    
    public TelaLivro() {
        initComponents();
    }
    
    public TelaLivro(ControladorLivro cl) {
        initComponents();
        this.cl=cl;
        
        DefaultTableModel tabLivro = (DefaultTableModel) tblLivros.getModel();
        List<Livro>lista = new ArrayList<>();
        lista = cl.retornaTodos();
        
        for(Livro livroLista: lista)
        {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            
            Object[] livro = new Object[]
            {
                livroLista.getIdLivro(),
                livroLista.getNome(),
                livroLista.getAutor(),
                livroLista.getEditora(),
                formato.format(livroLista.getDataPublicacao()),
                livroLista.getGenero()
            };
            
            tabLivro.addRow(livro);
        }
        txtId.setEditable(true);
        txtNome.setEditable(false);
        txtAutor.setEditable(false);
        txtEditora.setEditable(false);
        txtDataPublicacao.setEditable(false);

        txtId.requestFocus();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtDataPublicacao = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblLivros = new javax.swing.JTable();
        btnSalvar = new javax.swing.JButton();
        txtEditora = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmbGenero = new javax.swing.JComboBox<>();
        btnExcluir = new javax.swing.JButton();
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
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SISTEMA BIBLIOTECA");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tela de Livro");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("ID:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Nome:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Autor:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Editora:");

        txtId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtDataPublicacao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtAutor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tblLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Autor", "Editora", "Data", "Gênero"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblLivros);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        txtEditora.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Data:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Gênero:");

        cmbGenero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "selecione", "romance", "suspense", "terror", "fantasia", "ficção ", "infantil", "poesia", "comédia", "biografia", "história" }));
        cmbGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGeneroActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalvar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPesquisar))
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(txtAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(txtEditora, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(txtDataPublicacao)
                            .addComponent(cmbGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnExcluir)
                .addGap(14, 14, 14))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDataPublicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnExcluir)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
       try
       { 
       int linha = tblLivros.getSelectedRow();
       
       if(linha == -1)
       {
            JOptionPane.showMessageDialog(this, "Nenhum livro foi selecionado!", "Mensagem de Erro", JOptionPane.ERROR_MESSAGE);
       }
       
       else
       {
           int confirma = JOptionPane.showConfirmDialog(this, "confirma a exclusão do livro selecionadoo?");
           
           if(confirma == 0)
           {
               SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
               
              Livro livroExcluir = new Livro(
                    Integer.parseInt(tblLivros.getValueAt(linha, 0).toString()), 
                    tblLivros.getValueAt(linha, 1).toString(), 
                    tblLivros.getValueAt(linha, 2).toString(),
                    tblLivros.getValueAt(linha, 3).toString(),
                    formato.parse(tblLivros.getValueAt(linha, 4).toString()),
                   tblLivros.getValueAt(linha, 5).toString()
                );
              
              if(cl.excluirLivro(livroExcluir))
              {
                DefaultTableModel tabLivro = (DefaultTableModel) tblLivros.getModel();
                tabLivro.removeRow(linha);
                JOptionPane.showMessageDialog(this, "Livro excluído com sucesso!");
              }
              
              else
              {
                JOptionPane.showMessageDialog(this, "Ocorreu um erro, o livro não foi excluído!", "Mensagem de Erro", JOptionPane.ERROR_MESSAGE);
              }

           }
       }
       
        txtId.setText("");
        txtNome.setText("");
        txtAutor.setText("");
        txtEditora.setText("");
        txtDataPublicacao.setText("");
        cmbGenero.setSelectedIndex(0);
        txtId.requestFocus();
        
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(this, "erro", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
       try
       {          
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
       
        Livro l = new Livro(Integer.parseInt(txtId.getText()), txtNome.getText(), txtAutor.getText(), txtEditora.getText(), formato.parse(txtDataPublicacao.getText()), cmbGenero.getSelectedItem().toString());

        String id = txtId.getText();
        String nome = txtNome.getText();
        String autor = txtAutor.getText();
        String editora = txtEditora.getText();
        String data_publicacao = txtDataPublicacao.getText();
        String genero = cmbGenero.getSelectedItem().toString();

        if (id.equals("") || nome.equals("") || autor.equals("") || editora.equals("") || data_publicacao.equals("") || genero.equals("selecione")) 
        {
            JOptionPane.showMessageDialog(this, "Preencha todos os dados do formulario antes de inserir na tabela", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
            return;
        } 
        

        if (cl.salvarLivro(l)) 
        {
            JOptionPane.showMessageDialog(this, "Livro salvo com sucesso!");
        } 
        else 
        {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro, os dados do livro não foram salvos!", "Mensagem de Erro", JOptionPane.ERROR_MESSAGE);
        }
       
        
        DefaultTableModel tabLivro = (DefaultTableModel) tblLivros.getModel();
        
        while (tabLivro.getRowCount() > 0) {
            tabLivro.removeRow(0);
        }
        
        List<Livro> lista = new ArrayList<>();
        lista = cl.retornaTodos();
        for (Livro livroLista : lista) {
            Object[] livro = new Object[] {
                livroLista.getIdLivro(),
                livroLista.getNome(),
                livroLista.getAutor(),
                livroLista.getEditora(),
                formato.format(livroLista.getDataPublicacao()),
                livroLista.getGenero()
            };
            tabLivro.addRow(livro);
        }
        

        txtId.setText("");
        txtNome.setText("");
        txtAutor.setText("");
        txtEditora.setText("");
        txtDataPublicacao.setText("");
        cmbGenero.setSelectedIndex(0);
        
        txtId.setEditable(true);
        txtNome.setEditable(false);
        txtAutor.setEditable(false);
        txtEditora.setEditable(false);
        txtDataPublicacao.setEditable(false);
        
        
        txtId.requestFocus();
        
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(this, "erro", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void cmbGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGeneroActionPerformed
       
//        if(cmbGenero.getSelectedIndex() == 0)
//        {
//            JOptionPane.showMessageDialog(this, "ERRO, selecione um genero", "mensagem de erro", JOptionPane.ERROR_MESSAGE);
//        }
//        
//        else
//        {
//            cmbGenero.getSelectedItem().toString();
//        }
        
    }//GEN-LAST:event_cmbGeneroActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            if (txtId.getText().equals("")) {
                JOptionPane.showMessageDialog(this,"ID do livro a ser pesquisado não foi preenchido!","Mensagem de Erro",JOptionPane.ERROR_MESSAGE);
                txtId.requestFocus();
                return;
            }
            Livro l = cl.pesquisarLivro(Integer.parseInt(txtId.getText()));
            
            txtNome.setEditable(true);
            txtAutor.setEditable(true);
            txtEditora.setEditable(true);
            txtDataPublicacao.setEditable(true);
            
            
            if (l == null) {
                txtNome.setText("");
                txtAutor.setText("");
                txtEditora.setText("");
                txtDataPublicacao.setText("");
                cmbGenero.setSelectedIndex(0);
            }
            else {
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                txtId.setEditable(false);
                txtNome.setText(l.getNome());
                txtAutor.setText(l.getAutor());
                txtEditora.setText(l.getEditora());
                txtDataPublicacao.setText(formato.format(l.getDataPublicacao()));
                cmbGenero.setSelectedItem(l.getGenero());
            }
            txtNome.requestFocus();
        }
        catch(Exception erro) {
            JOptionPane.showMessageDialog(this,"ID do Livro deve ser numérico!","Mensagem de Erro", JOptionPane.ERROR_MESSAGE);
            txtId.setText("");
            txtId.requestFocus();
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cmbGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tblLivros;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtDataPublicacao;
    private javax.swing.JTextField txtEditora;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

}