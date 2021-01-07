package br.edu.iftm.views.components;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Imagem extends JLabel
{
    public Imagem(String nome)
    {
        super();
        ImageIcon icon = new ImageIcon(Imagem.class.getResource("/imagens/" + nome));
        setIcon(icon);
        repaint();
    }
}