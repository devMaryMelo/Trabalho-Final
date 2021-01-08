package br.edu.iftm.views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;

import br.edu.iftm.views.components.Imagem;
import br.edu.iftm.views.components.PanelPrincipal;

import java.awt.event.*;
import java.awt.CardLayout;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Color;

public class TelaPrincipal extends PanelPrincipal 
{
    private JPanel telas;
    private CardLayout controlador;

    public TelaPrincipal(JPanel telas, JFrame janela) {
        super(telas, janela);

        this.setLayout(null);

        String [] colunas = {"Produto", "Descrição", "Preço"};
        
        String[][] dados = {{"Café Preto", "1 xícara de café sem adição de açúcar", "R$2,00"},
                            {"Cookie", "Biscoito amanteigado com gotas de chocolate", "R$5,00"}};
        
        JTable table = new JTable(dados, colunas);
        table.setBounds(15, 150, 270, 500);
        table.setBackground(Color.decode("#DEB887"));

        Imagem background = new Imagem("background.png");
        background.setBounds(0, 0, 1920, 1280);

        Imagem btnLogout = new Imagem("logoutwhite.png");
        btnLogout.setBounds(7, 0, 64, 64);
        btnLogout.setToolTipText("Logout");
        btnLogout.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btnLogout.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                trocarTela("Login");
            }
        });
        
        this.add(btnLogout);
        this.add(table);
        this.add(background);
    }
}