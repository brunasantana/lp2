import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alunos
 */
public class Pricipal extends javax.swing.JFrame {

    /**
     * Creates new form Pricipal
     */
    public Pricipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        labelNome = new javax.swing.JLabel();
        inputNome = new javax.swing.JTextField();
        labeNasc = new javax.swing.JLabel();
        inputNasc = new javax.swing.JTextField();
        labelTel = new javax.swing.JLabel();
        labelEnd = new javax.swing.JLabel();
        inputTel = new javax.swing.JTextField();
        inputEnd = new javax.swing.JTextField();
        botaoRemover = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        botaoAdicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCadastros = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelNome.setText("Nome:");

        labeNasc.setText("Data Nascimento:");

        labelTel.setText("Telefone:");

        labelEnd.setText("Endereço:");

        inputTel.setToolTipText("");

        inputEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEndActionPerformed(evt);
            }
        });

        botaoRemover.setText("Remover");
        botaoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverActionPerformed(evt);
            }
        });

        botaoSalvar.setText("Salvar ");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        botaoAdicionar.setText("Adicionar");
        botaoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarActionPerformed(evt);
            }
        });

        tabelaCadastros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"}
            },
            new String [] {
                "Nome", "Data Nascimento", "Telefone", "Endereço"
            }
        ));
        tabelaCadastros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaCadastrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCadastros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoAdicionar)
                        .addGap(18, 18, 18)
                        .addComponent(botaoSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(botaoRemover))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNome)
                            .addComponent(labeNasc)
                            .addComponent(labelTel)
                            .addComponent(labelEnd))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputTel)
                            .addComponent(inputNasc)
                            .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputEnd)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labeNasc)
                    .addComponent(inputNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTel)
                    .addComponent(inputTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEnd)
                    .addComponent(inputEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoRemover)
                    .addComponent(botaoSalvar)
                    .addComponent(botaoAdicionar))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>                        

    private void inputEndActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        /**
         * 1 - recuperar os dados do formulario
         * 2 - adicionar uma nova linha na tabe4la com os valores
         * 3 - se nao tiver valor nos campos, insere uma linha vazia
         * 
         */
    }                                        

    private void botaoRemoverActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) tabelaCadastros.getModel();
        int rowSelected = tabelaCadastros.getSelectedRow();//retorna um inteiro mostrando qual linha foi selecionada (se o valor for -1 não foi selecionada nenhuma linha)
        
            if(rowSelected == -1){//entra nesse caso se nenhuma linha foi selecionada e mostra a mensagem 
                JOptionPane.showMessageDialog(this, "Selecione a linha que quer remover antes de clicar no botão! "); //Se usa o this pq está referenciando o proprio Jframe
            }
            else{
                int opcao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja remover a linha selecionada?", "Confirme sua operação", JOptionPane.YES_NO_OPTION); 
                if(opcao == JOptionPane.YES_OPTION) 
                    dtm.removeRow(rowSelected);
        }
    }                                            

    private void tabelaCadastrosMouseClicked(java.awt.event.MouseEvent evt) {                                             
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel)tabelaCadastros.getModel();
        int row = tabelaCadastros.rowAtPoint(evt.getPoint()); //rowAt: pegando a linha a partir do cursor do mouse
        int col = tabelaCadastros.columnAtPoint(evt.getPoint());//getPoint5: me da o ponto que eu cliquei na tela
        
        String nome = dtm.getValueAt(row,0).toString();
        String dtNasc = dtm.getValueAt(row,1).toString();
        String tel = dtm.getValueAt(row,2).toString();   
        String end = dtm.getValueAt(row,3).toString();
        
        /**
         * PASSOS
         * 1 - saber qual linha vai ser selecionada
         * 2 - pegar os valores de cada coluna da linha escolhida
         * 3 - adicionar os valores no formulário
         */
                
    }                                            

    private void botaoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        /**
         * 1 - verificar se todos os campos estão preeencidos, se não estiver, mandar mensagem de erro
         * 2 - adicionar uma linha contendo os valores preenchidos no formulário
         */
        
        DefaultTableModel dtm = (DefaultTableModel)tabelaCadastros.getModel();
        tabelaCadastros.getModel();
        String nome = inputNome.getText();
        String dtNasc = inputNasc.getText();
        String tel = inputTel.getText();
        String end = inputEnd.getText();
        
        if ( nome.equals(" ") || dtNasc.equals(" ") || tel.equals(" ") || end.equals(" ")){ 
            JOptionPane.showMessageDialog(this, "Todos os campos são de preenchimento obrigatório!"); 
        }
        else{
            String a [] = new String[] {nome, dtNasc, tel, end}; 
            dtm.addRow( a ); 
        }
    }                                              

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel)tabelaCadastros.getModel();
        tabelaCadastros.getModel();
        int rowSelected = tabelaCadastros.getSelectedRow();
        
        String nome = inputNome.getText();
        String dtNasc = inputNasc.getText();
        String tel = inputTel.getText();
        String end = inputEnd.getText();
        
        if (rowSelected == -1){
            String a [] = new String[] {nome, dtNasc, tel, end}; 
            dtm.addRow( a ); 
        } 
        else{
            dtm.setValueAt(nome, rowSelected, 0);
            dtm.setValueAt(dtNasc, rowSelected, 1);
            dtm.setValueAt(tel, rowSelected, 2);
            dtm.setValueAt(end, rowSelected, 3);
        }
    }                                           

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
            java.util.logging.Logger.getLogger(Pricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pricipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton botaoAdicionar;
    private javax.swing.JButton botaoRemover;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JTextField inputEnd;
    private javax.swing.JTextField inputNasc;
    private javax.swing.JTextField inputNome;
    private javax.swing.JTextField inputTel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labeNasc;
    private javax.swing.JLabel labelEnd;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelTel;
    private javax.swing.JTable tabelaCadastros;
    // End of variables declaration                   
}