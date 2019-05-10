package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

public class J_CadProduto extends javax.swing.JDialog {

    public J_CadProduto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
         
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jB_Cadastra_estoque = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jT_NomeProduto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jT_DataEntrada = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jT_QuantidadeProdudo = new javax.swing.JTextField();
        jT_DataVencimento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jT_Lote = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jT_ValorUnitario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jB_Limpar_Cadastrar = new javax.swing.JButton();
        JB_NOVO_CADAST = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar_Produtos");

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        jB_Cadastra_estoque.setBackground(new java.awt.Color(204, 204, 204));
        jB_Cadastra_estoque.setText("Cadastrar");
        jB_Cadastra_estoque.setEnabled(false);
        jB_Cadastra_estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Cadastra_estoqueActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jT_NomeProduto.setEnabled(false);
        jT_NomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_NomeProdutoActionPerformed(evt);
            }
        });

        jLabel4.setText("Valor_Unitário:");

        jLabel2.setText("Quantidade_Produto:");

        jT_DataEntrada.setEnabled(false);
        jT_DataEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_DataEntradaActionPerformed(evt);
            }
        });

        jLabel3.setText("Data_vencimento:");

        jT_QuantidadeProdudo.setEnabled(false);
        jT_QuantidadeProdudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_QuantidadeProdudoActionPerformed(evt);
            }
        });

        jT_DataVencimento.setEnabled(false);
        jT_DataVencimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_DataVencimentoActionPerformed(evt);
            }
        });

        jLabel5.setText("Lote:");

        jT_Lote.setEnabled(false);
        jT_Lote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_LoteActionPerformed(evt);
            }
        });

        jLabel6.setText("Data_Entrada:");

        jT_ValorUnitario.setEnabled(false);
        jT_ValorUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_ValorUnitarioActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome_produto:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jT_DataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jT_Lote, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                        .addComponent(jT_ValorUnitario, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jT_QuantidadeProdudo, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jT_DataVencimento, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jT_NomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jT_NomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jT_QuantidadeProdudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jT_DataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jT_ValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jT_Lote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jT_DataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ESTOQUE");
        jLabel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jB_Limpar_Cadastrar.setBackground(new java.awt.Color(204, 204, 204));
        jB_Limpar_Cadastrar.setText("Limpar");
        jB_Limpar_Cadastrar.setEnabled(false);
        jB_Limpar_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Limpar_CadastrarActionPerformed(evt);
            }
        });

        JB_NOVO_CADAST.setText("NOVO");
        JB_NOVO_CADAST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_NOVO_CADASTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(354, 354, 354)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(430, Short.MAX_VALUE)
                .addComponent(jB_Limpar_Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jB_Cadastra_estoque)
                .addGap(151, 151, 151))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(JB_NOVO_CADAST)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB_NOVO_CADAST))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_Limpar_Cadastrar)
                    .addComponent(jB_Cadastra_estoque))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jT_LoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_LoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_LoteActionPerformed

    private void jB_Limpar_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Limpar_CadastrarActionPerformed
        
        //Limpa todos os campos
        jT_DataEntrada.setText("");
        jT_DataVencimento.setText("");
        jT_Lote.setText("");
        jT_NomeProduto.setText("");
        jT_QuantidadeProdudo.setText("");
        jT_ValorUnitario.setText("");
        //Tornar todos os campos desabilitados.
        jT_NomeProduto.setEnabled(false);
        jT_QuantidadeProdudo.setEnabled(false);
        jT_DataEntrada.setEnabled(false);
        jT_DataVencimento.setEnabled(false);
        jT_ValorUnitario.setEnabled(false);
        jT_Lote.setEnabled(false);
        jB_Limpar_Cadastrar.setEnabled(false);
        jB_Cadastra_estoque.setEnabled(false);
    }//GEN-LAST:event_jB_Limpar_CadastrarActionPerformed

    private void jB_Cadastra_estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Cadastra_estoqueActionPerformed

     
        
        //Faz conexão com o banco de dados.
            Connection con = null;
        try {
            con = Conexao_Dao.getConnection();
            
            //Chamando Singleton Singleton
           // con = ConexaoSingle.getInstance().getConnection();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de Conexão!\nERRO:"+ex);
        }
        
       
        //Executa Inserção no banco
        String query = "INSERT INTO estoque (nome_produto,quantidade_produto,data_vencimento,"
                + "valor_unitario,lote,data_entrada) VALUES (?,?,?,?,?,?)";
        
                //Aparece painel com mensagem de cadastro realizado
                JOptionPane.showMessageDialog(this, "Cadastro Realizado");
                
            
                //Cria variavel que armazena oque esta escrito no campo de texto
        try(
            PreparedStatement stnt = con.prepareStatement(query)){
    
            try {
                stnt.setString(1, jT_NomeProduto.getText());
            } catch (SQLException ex) {
                Logger.getLogger(J_CadProduto.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                stnt.setString(2, jT_QuantidadeProdudo.getText());
            } catch (SQLException ex) {
                Logger.getLogger(J_CadProduto.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                //Converte data para banco ex: pega 13/05/1983 e manda pro banco em:1983/05/13.
                String dia = jT_DataVencimento.getText().substring(0, 2);
                String mes = jT_DataVencimento.getText().substring(3, 5);
                String ano = jT_DataVencimento.getText().substring(6);
                String dataParaMysql = ano+"-"+mes+"-"+dia;
                
                
                stnt.setString(3, dataParaMysql);
            } catch (SQLException ex) {
                Logger.getLogger(J_CadProduto.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                stnt.setString(4, jT_ValorUnitario.getText());
            } catch (SQLException ex) {
                Logger.getLogger(J_CadProduto.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                stnt.setString(5, jT_Lote.getText());
            } catch (SQLException ex) {
                Logger.getLogger(J_CadProduto.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                
                String dia = jT_DataEntrada.getText().substring(0, 2);
                String mes = jT_DataEntrada.getText().substring(3, 5);
                String ano = jT_DataEntrada.getText().substring(6);
                String dataParaMysql = ano+"-"+mes+"-"+dia;
                stnt.setString(6, dataParaMysql);
            } catch (SQLException ex) {
                Logger.getLogger(J_CadProduto.class.getName()).log(Level.SEVERE, null, ex);
            }
    
            
            try {
                stnt.executeUpdate();
            } catch (SQLException ex) {
                System.out.println("Erro Sintax sql");
            }
    }   catch (SQLException ex) {
            Logger.getLogger(J_CadProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            con.close();
        }catch(SQLException e){
            System.out.println("Erro sql");
        }
      
    }//GEN-LAST:event_jB_Cadastra_estoqueActionPerformed

    private void jT_NomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_NomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_NomeProdutoActionPerformed

    private void jT_QuantidadeProdudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_QuantidadeProdudoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_QuantidadeProdudoActionPerformed

    private void jT_ValorUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_ValorUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_ValorUnitarioActionPerformed

    private void jT_DataEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_DataEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_DataEntradaActionPerformed

    private void jT_DataVencimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_DataVencimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_DataVencimentoActionPerformed

    private void JB_NOVO_CADASTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_NOVO_CADASTActionPerformed
        //Habilitar todos os Campos para realizar cadastro.
        jT_NomeProduto.setEnabled(true);
        jT_QuantidadeProdudo.setEnabled(true);
        jT_DataEntrada.setEnabled(true);
        jT_DataVencimento.setEnabled(true);
        jT_ValorUnitario.setEnabled(true);
        jT_Lote.setEnabled(true);
        jB_Limpar_Cadastrar.setEnabled(true);
        jB_Cadastra_estoque.setEnabled(true);
    }//GEN-LAST:event_JB_NOVO_CADASTActionPerformed

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
            java.util.logging.Logger.getLogger(J_CadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(J_CadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(J_CadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(J_CadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                J_CadProduto dialog = new J_CadProduto(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_NOVO_CADAST;
    private javax.swing.JButton jB_Cadastra_estoque;
    private javax.swing.JButton jB_Limpar_Cadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jT_DataEntrada;
    private javax.swing.JTextField jT_DataVencimento;
    private javax.swing.JTextField jT_Lote;
    private javax.swing.JTextField jT_NomeProduto;
    private javax.swing.JTextField jT_QuantidadeProdudo;
    private javax.swing.JTextField jT_ValorUnitario;
    // End of variables declaration//GEN-END:variables
}
