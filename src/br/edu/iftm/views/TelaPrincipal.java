package br.edu.iftm.views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import br.edu.iftm.views.components.Imagem;
import br.edu.iftm.views.components.PanelPrincipal;

import java.awt.event.*;
import java.awt.CardLayout;
import java.awt.Cursor;

public class TelaPrincipal extends PanelPrincipal {
    private JPanel telas;
    private CardLayout controlador;
    private static JFrame cardapio;

    public TelaPrincipal(JPanel telas, JFrame janela) {
        super(telas, janela);

        this.setLayout(null);

        Imagem background = new Imagem("background.jpg");
        background.setBounds(0, 0, 1440, 900);

        Imagem btnLogout = new Imagem("logoutwhite.png");
        btnLogout.setBounds(7, 0, 64, 64);
        btnLogout.setToolTipText("Logout");
        btnLogout.setCursor(new Cursor(Cursor.HAND_CURSOR));

        Imagem btnCardapio = new Imagem("cardapio.png");
        btnCardapio.setBounds(50, 13, 36, 36);
        btnCardapio.setToolTipText("Cardápio");
        btnCardapio.setCursor(new Cursor(Cursor.HAND_CURSOR));

        Imagem imgCardapio = new Imagem("imgCardapio.png");
        imgCardapio.setBounds(0, 0, 1545, 2000);

        JTextField txtProduto = new JTextField();
        txtProduto.setBounds(500, 400, 200, 20);

        JTextField txtPreco = new JTextField();
        txtPreco.setBounds(500, 450, 200, 20);

        this.add(btnCardapio);
        this.add(btnLogout);
        this.add(background);
        this.add(txtProduto);
        this.add(txtPreco);

        btnLogout.addMouseListener(new MouseAdapter() 
        {
            public void mouseClicked(MouseEvent e) 
            {
                trocarTela("Login");
            }
        });

        btnCardapio.addMouseListener(new MouseAdapter() 
        {
            public void mouseClicked(MouseEvent e) 
            {
                cardapio = new JFrame("Cardápio");
                cardapio.setBounds(70, 50, 415, 550);
                cardapio.add(imgCardapio);
                cardapio.setResizable(false);
                cardapio.setVisible(true);
            }
        });
    }

    public static JFrame getCardapio() 
    {
        return cardapio;
    }

    public void setCardapio(JFrame cardapio) 
    {
        TelaPrincipal.cardapio = cardapio;
    }

}