package br.edu.iftm.views.components;

import javax.swing.JFrame;
import javax.swing.JPanel;

import br.edu.iftm.views.TelaPrincipal;

import java.awt.event.*;
import java.awt.CardLayout;
import java.awt.*;

public class PanelPrincipal extends JPanel
{
    //Cria as variáveis
    private JPanel telas;
    private CardLayout controlador;
    private JFrame janela;
    
    //Método Construtor
    public PanelPrincipal(JPanel telas, JFrame janela)
    {
        //Passa as informações do JPanel
        this.telas = telas;
        this.controlador = (CardLayout) telas.getLayout();
        this.janela = janela;
        this.setBackground(Color.decode("#190710"));
        this.setLayout(null);

        //Cria uma imagem clicável, define suas características
        Imagem btnClose = new Imagem("close_white.png");
        btnClose.setBounds(1340, 0, 24, 24);
        btnClose.setCursor(new Cursor(Cursor.HAND_CURSOR));

        //Cria uma imagem clicável, define suas características
        Imagem btnMinimize = new Imagem("minimize_white.png");
        btnMinimize.setBounds(1320, 0, 24, 24);
        btnMinimize.setCursor(new Cursor(Cursor.HAND_CURSOR));

        //Define ação pelo clique do mouse na imagem btnClose
        btnClose.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                janela.dispose();
                TelaPrincipal.getCardapio().dispose();
            }
        });
        
        //Define ação pelo clique do mouse na imagem btnMinimize
        btnMinimize.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                janela.setState(JFrame.ICONIFIED);
            }
        });

        //Adiciona no JPanel
        this.add(btnClose);
        this.add(btnMinimize);
    }
    
    //Método para trocar de tela
    protected void trocarTela(String identificador)
    {
        controlador.show(telas, identificador);
    }
}