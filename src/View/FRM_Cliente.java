package View;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ricardo_pc
 */
public class FRM_Cliente extends javax.swing.JDialog {

    /**
     * Creates new form FRM_Cliente
     */
    public FRM_Cliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jT_Nome_Cliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jT_Codigo_Cli = new javax.swing.JTextField();
        jT_Ender_Cliente = new javax.swing.JTextField();
        jB_novo_Cliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Cliente = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        JB_Buscar_Cliente = new javax.swing.JButton();
        jB_Cadastrar_Cliente = new javax.swing.JButton();
        JB_Editar_Cliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Clientes");

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastrar Cliente");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel4.setText("Endereço:");

        jLabel3.setText("Nome:");

        jT_Nome_Cliente.setEnabled(false);

        jLabel2.setText("Código:");

        jT_Codigo_Cli.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jT_Codigo_Cli.setEnabled(false);

        jT_Ender_Cliente.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jT_Ender_Cliente)
                    .addComponent(jT_Nome_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_Codigo_Cli, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jT_Codigo_Cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jT_Nome_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jT_Ender_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jB_novo_Cliente.setText("Novo");
        jB_novo_Cliente.setToolTipText("Novo");
        jB_novo_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_novo_ClienteActionPerformed(evt);
            }
        });

        jTable_Cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Endereço"
            }
        ));
        jTable_Cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_ClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Cliente);
        if (jTable_Cliente.getColumnModel().getColumnCount() > 0) {
            jTable_Cliente.getColumnModel().getColumn(0).setMinWidth(60);
            jTable_Cliente.getColumnModel().getColumn(0).setPreferredWidth(60);
            jTable_Cliente.getColumnModel().getColumn(0).setMaxWidth(60);
        }

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        JB_Buscar_Cliente.setText("Buscar");
        JB_Buscar_Cliente.setEnabled(false);
        JB_Buscar_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_Buscar_ClienteActionPerformed(evt);
            }
        });

        jB_Cadastrar_Cliente.setText("Cadastrar");
        jB_Cadastrar_Cliente.setToolTipText("Cadastrar");
        jB_Cadastrar_Cliente.setEnabled(false);
        jB_Cadastrar_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Cadastrar_ClienteActionPerformed(evt);
            }
        });

        JB_Editar_Cliente.setText("Editar");
        JB_Editar_Cliente.setEnabled(false);
        JB_Editar_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_Editar_ClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB_Cadastrar_Cliente)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JB_Editar_Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JB_Buscar_Cliente))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JB_Buscar_Cliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JB_Editar_Cliente)
                .addGap(18, 18, 18)
                .addComponent(jB_Cadastrar_Cliente)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jB_novo_Cliente)
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jB_novo_Cliente)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jB_novo_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_novo_ClienteActionPerformed
       
        jT_Nome_Cliente.setEnabled(true);
        jT_Ender_Cliente.setEnabled(true);
        jB_Cadastrar_Cliente.setEnabled(true);
        JB_Buscar_Cliente.setEnabled(true);
        JB_Editar_Cliente.setEnabled(true);
        jT_Ender_Cliente.setText("");
        jT_Nome_Cliente.setText("");
        jT_Codigo_Cli.setText("");
        
              //Limpa Tabela inteira.
            ((DefaultTableModel) jTable_Cliente.getModel()).setRowCount(0);
    }//GEN-LAST:event_jB_novo_ClienteActionPerformed

    private void jB_Cadastrar_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Cadastrar_ClienteActionPerformed

        Connection con = null;

        try {
            con = Conexao_Dao.getConnection();

            String query ="insert into cliente (nome_cliente,endereco) values (?,?)";

            PreparedStatement pst = con.prepareStatement(query);

            pst.setString(1,jT_Nome_Cliente.getText());
            pst.setString(2, jT_Ender_Cliente.getText());
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Cadastro relaizado com sucesso!");
            
        jT_Nome_Cliente.setEnabled(false);
        jT_Ender_Cliente.setEnabled(false);
        jB_Cadastrar_Cliente.setEnabled(false);
        JB_Buscar_Cliente.setEnabled(false);
        JB_Editar_Cliente.setEnabled(false);
        jT_Nome_Cliente.setText("");
        jT_Ender_Cliente.setText("");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro de Conexão\nERRO:"+ ex);
        }
        try {
            con.close();
        } catch (SQLException ex) {

        }

    }//GEN-LAST:event_jB_Cadastrar_ClienteActionPerformed

    private void JB_Buscar_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_Buscar_ClienteActionPerformed

        Connection conn = null;
        try {
            conn = Conexao_Dao.getConnection();
            
            String query = "select * from cliente where nome_cliente like ?";
            
            PreparedStatement pst;
            pst = (PreparedStatement) conn.prepareStatement(query);
            
            pst.setString(1, "%" +jT_Nome_Cliente.getText()+"%");
            
            ResultSet rs;
            rs = pst.executeQuery();
            
            DefaultTableModel model = (DefaultTableModel) jTable_Cliente.getModel();
            
            model.setNumRows(0);
            
            while(rs.next()){
            
                model.addRow(
                        new Object[]{
                        
                            rs.getString("id_cliente"),
                            rs.getString("nome_cliente"),
                            rs.getString("endereco"),
                        }
                );
                
            }
            conn.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(FRM_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_JB_Buscar_ClienteActionPerformed

    private void jTable_ClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_ClienteMouseClicked
        //Quando clica na Tabela ele coloca o codigo no campo do código.
        String codigo = ""+ jTable_Cliente.getValueAt(jTable_Cliente.getSelectedRow(), 0);
        jT_Codigo_Cli.setText(codigo);
        
        String nome = ""+ jTable_Cliente.getValueAt(jTable_Cliente.getSelectedRow(), 1);
        jT_Nome_Cliente.setText(nome);
        
        String endereco ="" + jTable_Cliente.getValueAt(jTable_Cliente.getSelectedRow(), 2);
        jT_Ender_Cliente.setText(endereco);
        
        
    }//GEN-LAST:event_jTable_ClienteMouseClicked

    private void JB_Editar_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_Editar_ClienteActionPerformed

        Connection conn;
        try {
            conn = Conexao_Dao.getConnection();
            
            String query = "update cliente set nome_cliente = ?,endereco =? where id_cliente = ?";
            PreparedStatement ps;
            
            ps = (PreparedStatement) conn.prepareStatement(query);
            ps.setString(1, jT_Nome_Cliente.getText());
            ps.setString(2, jT_Ender_Cliente.getText());
            ps.setString(3, jT_Codigo_Cli.getText());
            
            ps.executeUpdate();
                    
            
            JOptionPane.showMessageDialog(rootPane,"Alterado com sucesso!");
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro de Conexão/ERRO"+ex);
        }
    }//GEN-LAST:event_JB_Editar_ClienteActionPerformed

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
            java.util.logging.Logger.getLogger(FRM_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FRM_Cliente dialog = new FRM_Cliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton JB_Buscar_Cliente;
    private javax.swing.JButton JB_Editar_Cliente;
    private javax.swing.JButton jB_Cadastrar_Cliente;
    private javax.swing.JButton jB_novo_Cliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jT_Codigo_Cli;
    private javax.swing.JTextField jT_Ender_Cliente;
    private javax.swing.JTextField jT_Nome_Cliente;
    private javax.swing.JTable jTable_Cliente;
    // End of variables declaration//GEN-END:variables
}
