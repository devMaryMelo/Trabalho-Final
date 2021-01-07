package br.edu.iftm.views;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.*;

import br.edu.iftm.views.components.Botao;
import br.edu.iftm.views.components.Imagem;
import br.edu.iftm.views.components.PanelPrincipal;

public class TelaLogin extends PanelPrincipal
{
    private Botao btnLogin;

    public TelaLogin(JPanel telas, JFrame janela)
    {
        super(telas, janela);
        JLabel lblUsuario = new JLabel("Usuário");
        lblUsuario.setForeground(Color.WHITE);
        lblUsuario.setBounds(630, 300, 100, 20);

        JLabel lblSenha = new JLabel("Senha");
        lblSenha.setForeground(Color.WHITE);
        lblSenha.setBounds(630, 350, 100, 20);

        JTextField txtUsuario = new JTextField();
        txtUsuario.setBounds(630, 320, 200, 20);

        JPasswordField password = new JPasswordField();
        password.setBounds(630, 370, 200, 20);

        Botao btnLogin = new Botao("Login");
        btnLogin.addActionListener(this);
        btnLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));

        Imagem imgCafeteria = new Imagem("cafeteria.png");
        imgCafeteria.setBounds(500, 0, 440, 199);
        
        Imagem imgCoffee = new Imagem("coffee.png");
        imgCoffee.setBounds(5, 5, 64, 64);
        
        this.add(lblUsuario);
        this.add(txtUsuario);
        this.add(lblSenha);
        this.add(password);
        this.add(btnLogin);
        this.add(imgCafeteria);
        this.add(imgCoffee);

        btnLogin.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = txtUsuario.getText();
                String senha = new String(password.getPassword());

                if((usuario == null) || (usuario.isEmpty()) || (senha.isEmpty()))
                {
                    JOptionPane.showMessageDialog(null, "Informe o usuário e a senha", "Dados inválidos", 
                                                    JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    if((usuario.equals("sleepy_dev")) && (senha.equals("coffee")))
                    {
                        trocarTela("Principal");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos", "Dados inválidos", 
                                                    JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
    }
}

    