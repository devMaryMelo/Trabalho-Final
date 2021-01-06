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

        Imagem botaoClose = new Imagem("close_white.png");
        Imagem botaoMinimize = new Imagem("minimize_white.png");
        botaoClose.setBounds(1340, 0, 24, 24);
        botaoMinimize.setBounds(1320, 0, 24, 24);

        botaoClose.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                janela.dispose();
            }
        });
        
        botaoMinimize.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                janela.setState(JFrame.ICONIFIED);
            }
        });

        this.add(botaoClose);
        this.add(botaoMinimize);
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