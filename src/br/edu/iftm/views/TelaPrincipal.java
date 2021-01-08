package br.edu.iftm.views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

import br.edu.iftm.views.components.Imagem;
import br.edu.iftm.views.components.PanelPrincipal;

import java.awt.event.*;
import java.awt.CardLayout;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Container;

public class TelaPrincipal extends PanelPrincipal 
{
    private JPanel telas;
    private CardLayout controlador;

    public TelaPrincipal(JPanel telas, JFrame janela) 
    {
        super(telas, janela);

        this.setLayout(null);

        /*String [] colunas = {"Produto", "Preço"};
        
        String[][] dados = { 
                                {"Café Preto", "R$2,00"}, 
                                {"Capuccino", "R$6,50"},
                                {"Cookie", "R$5,00"},
                            };
        
        JTable cardapio = new JTable(dados, colunas); 

        JScrollPane scrollPane = new JScrollPane(cardapio);
        scrollPane.setBounds(10, 200, 250, 400);
        this.add(scrollPane);*/
         
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
        
        this.add(btnCardapio);
        this.add(btnLogout);
        this.add(background);

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
                JFrame janela = new JFrame("Cardápio");
                janela.setBounds(70, 50, 400, 500);
                janela.setVisible(true);
            }
        });
    }
}