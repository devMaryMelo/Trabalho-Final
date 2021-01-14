package br.edu.iftm.views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.CardLayout;

public class JanelaPrincipal extends JFrame
{
    //Método construtor
    public JanelaPrincipal()
    {
        //Passa as informações da janela
        this.setBounds(330, 100, 720, 480);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setUndecorated(true);

        //Cria um cardlayout para trocar as telas
        CardLayout controlador = new CardLayout();
        
        //Cria um JPanel e adiciona o cardlayout nele
        JPanel telas = new JPanel(controlador);

        //Instância os objetos e passa os parâmetros do construtor
        TelaLogin telaLogin = new TelaLogin(telas, this);
        TelaPrincipal telaPrincipal = new TelaPrincipal(telas, this);

        //Adiciona as telas no JPanel
        telas.add(telaLogin, "Login");
        telas.add(telaPrincipal, "Principal");

        //Define com qual tela o programa iniciará
        controlador.show(telas, "Login");

        //Adiciona as telas na janela
        this.add(telas);

        //Define a janela como visível 
        this.setVisible(true);
    }
}