/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.LivroDAO;
import dao.UsuarioDAO;

import javax.swing.JOptionPane;

import model.dto.Livro;
import model.dto.Usuario;

import java.util.Properties;


public class CadastroUsuarioVIEW extends javax.swing.JFrame {

    private Properties properties;

    Usuario logado;

    /**
     * Creates new form CadastroUsuarioVIEW
     */
    public CadastroUsuarioVIEW() {
        super("Managing Life - Cadastro de usuário");
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public CadastroUsuarioVIEW(Properties properties, Usuario logado) {
        this();
        this.properties = properties;
        this.logado = logado;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        voltarButton = new javax.swing.JButton();
        cadastrarButton = new javax.swing.JButton();
        administradorCheckBox = new javax.swing.JCheckBox();
        romanceRadioButton = new javax.swing.JRadioButton();
        ficcaoRadioButton = new javax.swing.JRadioButton();
        tecnicoRadioButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginTextField = new javax.swing.JTextField();
        nomeTextField = new javax.swing.JTextField();
        idadeTextField = new javax.swing.JTextField();
        generoTextField = new javax.swing.JTextField();
        senhaPasswordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        voltarButton.setText("Voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });

        cadastrarButton.setText("Cadastrar");
        cadastrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarButtonActionPerformed(evt);
            }
        });

        administradorCheckBox.setText("Permissões de administrador");
        administradorCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                administradorCheckBoxActionPerformed(evt);
            }
        });

        romanceRadioButton.setText("Romance");
        romanceRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                romanceRadioButtonActionPerformed(evt);
            }
        });

        ficcaoRadioButton.setText("Ficção");

        tecnicoRadioButton.setText("Técnico");

        jLabel1.setText("Generos Preferidos:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cadastrao de novo usuário");

        loginTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Login"));
        loginTextField.setDoubleBuffered(true);
        loginTextField.setName("Login");
        loginTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginTextFieldActionPerformed(evt);
            }
        });

        nomeTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));
        nomeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTextFieldActionPerformed(evt);
            }
        });

        idadeTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Idade"));
        idadeTextField.setDoubleBuffered(true);
        idadeTextField.setName("Idade");
        idadeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idadeTextFieldActionPerformed(evt);
            }
        });

        generoTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Gênero(masculino / feminino)"));
        generoTextField.setDoubleBuffered(true);
        generoTextField.setName("Genero");
        generoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoTextFieldActionPerformed(evt);
            }
        });

        senhaPasswordField.setBorder(javax.swing.BorderFactory.createTitledBorder("Senha"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(171, 171, 171))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(romanceRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(ficcaoRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(tecnicoRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(cadastrarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addComponent(administradorCheckBox, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(loginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(generoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addGap(13, 13, 13)
                                                                        .addComponent(idadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(senhaPasswordField))))))
                                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(idadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(loginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(senhaPasswordField))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(generoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(romanceRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ficcaoRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tecnicoRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addComponent(administradorCheckBox)
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cadastrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(7, Short.MAX_VALUE))
        );

        loginTextField.getAccessibleContext().setAccessibleDescription("");
        senhaPasswordField.getAccessibleContext().setAccessibleName("Senha");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        var ht = new HomeAdminVIEW(properties, logado);
        ht.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void cadastrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarButtonActionPerformed
        String nome = nomeTextField.getText();
        String login = loginTextField.getText();
        String senha = new String(senhaPasswordField.getPassword());
        int idade = Integer.parseInt(idadeTextField.getText());
        String sexo = generoTextField.getText();
        int id_tipo_usuario = 2;
        if (administradorCheckBox.isSelected()) {
            id_tipo_usuario = 1;
        }

        try {
            Usuario usuario = new Usuario(nome, login, senha, idade, sexo, id_tipo_usuario);
            UsuarioDAO usuarioDAO = new UsuarioDAO(properties);

            usuarioDAO.cadastrar(usuario);
            System.out.println("Usuario cadastrado com sucesso!");

            usuarioDAO.receberDados(usuario);
            System.out.println("Select realizado com sucesso!");

            LivroDAO livroDAO = new LivroDAO(properties);

            if (romanceRadioButton.isSelected()) {
                var p = new Livro(usuario.getIdUsuario(), 2);
                livroDAO.registrar(p); // Adicione a instância de Properties aqui
            }
            if (ficcaoRadioButton.isSelected()) {
                var p = new Livro(usuario.getIdUsuario(), 2);
                livroDAO.registrar(p); // Adicione a instância de Properties aqui
            }
            if (tecnicoRadioButton.isSelected()) {
                var p = new Livro( usuario.getIdUsuario(), 3);
                livroDAO.registrar(p); // Adicione a instância de Properties aqui
            }

            JOptionPane.showMessageDialog(null, "Usuario e preferências cadastrados com sucesso!");

            var ht = new HomeAdminVIEW(properties, logado);
            ht.setVisible(true);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas na conexão");
            e.printStackTrace();

        }

    }//GEN-LAST:event_cadastrarButtonActionPerformed

    private void romanceRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_romanceRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_romanceRadioButtonActionPerformed

    private void administradorCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_administradorCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_administradorCheckBoxActionPerformed

    private void loginTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginTextFieldActionPerformed

    private void nomeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTextFieldActionPerformed

    private void idadeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idadeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idadeTextFieldActionPerformed

    private void generoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                
    }
    private javax.swing.JCheckBox administradorCheckBox;
    private javax.swing.JButton cadastrarButton;
    private javax.swing.JRadioButton ficcaoRadioButton;
    private javax.swing.JTextField generoTextField;
    private javax.swing.JTextField idadeTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField loginTextField;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JRadioButton romanceRadioButton;
    private javax.swing.JPasswordField senhaPasswordField;
    private javax.swing.JRadioButton tecnicoRadioButton;
    private javax.swing.JButton voltarButton;
}

