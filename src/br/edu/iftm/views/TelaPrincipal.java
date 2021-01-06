package br.edu.iftm.views;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import br.edu.iftm.views.components.PanelPrincipal;

import java.awt.event.*;
import java.awt.CardLayout;

public class TelaPrincipal extends PanelPrincipal
{
    private JPanel telas;
    private CardLayout controlador;

    public TelaPrincipal(JPanel telas, JFrame janela)
    {
       super(telas, janela);

        JLabel lblMessage = new JLabel("You logged in");

        JButton botao = new JButton("Logoff");
        botao.addActionListener(this);

        this.add(lblMessage);
        this.add(botao);
    }

    public void executarBotao(ActionEvent e)
    {
        trocarTela("Login");
    }
}