package br.edu.iftm.views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.CardLayout;

public class JanelaPrincipal extends JFrame
{
    public JanelaPrincipal()
    {
        this.setBounds(330, 100, 720, 480);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setUndecorated(true);

        CardLayout controlador = new CardLayout();
        JPanel telas = new JPanel(controlador);

        TelaLogin telaLogin = new TelaLogin(telas, this);
        TelaPrincipal telaPrincipal = new TelaPrincipal(telas, this);

        telas.add(telaLogin, "Login");
        telas.add(telaPrincipal, "Principal");

        controlador.show(telas, "Login");

        this.add(telas);

        this.setVisible(true);
    }
}