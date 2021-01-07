package br.edu.iftm.views.components;

import javax.swing.JFrame;
import javax.swing.JPanel;

import br.edu.iftm.views.components.Imagem;

import java.awt.event.*;
import java.awt.CardLayout;
import java.awt.*;

public class PanelPrincipal extends JPanel implements ActionListener
{
    private JPanel telas;
    private CardLayout controlador;
    private JFrame janela;
    
    public PanelPrincipal(JPanel telas, JFrame janela)
    {
        this.telas = telas;
        this.controlador = (CardLayout) telas.getLayout();
        this.janela = janela;
        this.setBackground(Color.decode("#190710"));
        this.setLayout(null);

        Imagem btnClose = new Imagem("close_white.png");
        btnClose.setBounds(1340, 0, 24, 24);
        btnClose.setCursor(new Cursor(Cursor.HAND_CURSOR));

        Imagem btnMinimize = new Imagem("minimize_white.png");
        btnMinimize.setBounds(1320, 0, 24, 24);
        btnMinimize.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btnClose.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                janela.dispose();
            }
        });
        
        btnMinimize.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                janela.setState(JFrame.ICONIFIED);
            }
        });

        this.add(btnClose);
        this.add(btnMinimize);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        executarBotao(e);
    }

    protected void executarBotao(ActionEvent e)
    {

    }
    
    protected void trocarTela(String identificador)
    {
        controlador.show(telas, identificador);
    }
}