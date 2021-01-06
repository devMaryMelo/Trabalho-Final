package br.edu.iftm.views;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.event.*;

import br.edu.iftm.views.components.Botao;
import br.edu.iftm.views.components.Imagem;
import br.edu.iftm.views.components.PanelPrincipal;

public class TelaLogin extends PanelPrincipal
{
    private Botao botaoLogin;

    public TelaLogin(JPanel telas, JFrame janela)
    {
        super(telas, janela);
        JLabel lblNome = new JLabel("Nome");
        lblNome.setForeground(Color.WHITE);
        lblNome.setBounds(630, 300, 100, 20);

        JLabel lblSenha = new JLabel("Senha");
        lblSenha.setForeground(Color.WHITE);
        lblSenha.setBounds(630, 350, 100, 20);

        JTextField txtNome = new JTextField();
        txtNome.setBounds(630, 320, 200, 20);

        JTextField txtSenha = new JTextField();
        txtSenha.setBounds(630, 370, 200, 20);

        Botao botaoLogin = new Botao("Login");
        botaoLogin.addActionListener(this);

        Imagem imgCafeteria = new Imagem("cafeteria.png");
        imgCafeteria.setBounds(500, 0, 440, 199);
        
        Imagem imgCoffee = new Imagem("coffee.png");
        imgCoffee.setBounds(5, 5, 64, 64);
        
        this.add(lblNome);
        this.add(txtNome);
        this.add(lblSenha);
        this.add(txtSenha);
        this.add(botaoLogin);
        this.add(imgCafeteria);
        this.add(imgCoffee);
    }

    public void executarBotao(ActionEvent e)
    {
        trocarTela("Principal");
    }
}