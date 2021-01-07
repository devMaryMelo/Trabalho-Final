package br.edu.iftm.views;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import br.edu.iftm.views.components.Imagem;
import br.edu.iftm.views.components.PanelPrincipal;

import java.awt.event.*;
import java.awt.CardLayout;
import java.awt.Cursor;

public class TelaPrincipal extends PanelPrincipal
{
    private JPanel telas;
    private CardLayout controlador;

    public TelaPrincipal(JPanel telas, JFrame janela)
    {
        super(telas, janela);

        Imagem btnLogout = new Imagem("logout.png");
        btnLogout.setBounds(10, 0, 64, 64);
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
    }
}