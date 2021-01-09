package br.edu.iftm.views.components;

import javax.swing.JButton;
import java.awt.*;

public class Botao extends JButton
{
    public Botao(String texto)
    {
        super(texto);
        this.setSize(70, 30);
        this.setLocation(683, 450);
        this.setBackground(Color.decode("#581845"));
        this.setForeground(Color.decode("#FEFEFE"));
        this.setFocusPainted(false);
        this.setBorderPainted(false);
    }
}