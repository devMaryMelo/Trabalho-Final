package br.edu.iftm.views.components;

import javax.swing.JButton;
import java.awt.*;

public class Botao extends JButton
{
    public Botao(String texto)
    {
        super(texto);
        this.setBounds(683, 450, 70, 30);
        this.setBackground(Color.decode("#6d5dd3"));
        this.setFocusPainted(false);
        this.setBorderPainted(false);
    }
}