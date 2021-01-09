package br.edu.iftm.views;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import br.edu.iftm.views.components.Botao;
import br.edu.iftm.views.components.Imagem;
import br.edu.iftm.views.components.PanelPrincipal;

import java.awt.event.*;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Color;

public class TelaPrincipal extends PanelPrincipal 
{
    private static JFrame cardapio;
    private int i;

    public TelaPrincipal(JPanel telas, JFrame janela) 
    {
        super(telas, janela);

        this.setLayout(null);

        Imagem background = new Imagem("background.jpg");
        background.setBounds(0, 0, 1440, 900);

        Imagem btnLogout = new Imagem("logoutwhite.png");
        btnLogout.setBounds(7, 0, 64, 64);
        btnLogout.setToolTipText("Logout");
        btnLogout.setCursor(new Cursor(Cursor.HAND_CURSOR));

        Imagem btnCardapio = new Imagem("cardapio.png");
        btnCardapio.setBounds(50, 13, 36, 36);
        btnCardapio.setToolTipText("Cardápio");
        btnCardapio.setCursor(new Cursor(Cursor.HAND_CURSOR));

        Imagem imgCardapio = new Imagem("imgCardapio.png");
        imgCardapio.setBounds(0, 0, 1545, 2000);

        JLabel lblProduto = new JLabel("Produto:");
        lblProduto.setForeground(Color.WHITE);
        lblProduto.setBounds(100, 248, 100, 20);
        
        JLabel lblQuantidade = new JLabel("Quantidade:");
        lblQuantidade.setForeground(Color.WHITE);
        lblQuantidade.setBounds(100, 298, 100, 20);

        JComboBox <String> cbProduto = new JComboBox <String>();
        cbProduto.addItem("Americano");
        cbProduto.addItem("Avelã");
        cbProduto.addItem("Baunilha");
        cbProduto.addItem("Capuccino");
        cbProduto.addItem("Caramelo");
        cbProduto.addItem("Creme Matchá");;
        cbProduto.addItem("Latte");
        cbProduto.addItem("Macchiato");
        cbProduto.addItem("Mocha");
        cbProduto.addItem("Mocha Branco");
        cbProduto.addItem("Morango");
        cbProduto.setBounds(200, 248, 200, 20);

        JComboBox <String> cbQuantidade = new JComboBox <String>();
        cbQuantidade.setBounds(200, 298, 200, 20);
        
        for(i = 0; i <= 100; i++)
        { 
            String numero = String.valueOf(i);
            cbQuantidade.addItem(numero);
        }

        Botao btnConfirmar = new Botao("Confirmar");
        btnConfirmar.setBounds(245, 340, 95, 30);
        btnConfirmar.setCursor(new Cursor(Cursor.HAND_CURSOR));

        Botao btnFinalizar = new Botao("Finalizar Pedido");
        btnFinalizar.setBounds(900, 500, 150, 30);
        btnFinalizar.setCursor(new Cursor(Cursor.HAND_CURSOR));

        JTextArea pedidos = new JTextArea("Produto\t\t\tQuantidade\n");
        pedidos.setBounds(550, 200, 500, 300);
        pedidos.setEditable(false);
        pedidos.setFont(new Font("Tahoma", Font.ITALIC, 12));
        pedidos.setBackground(Color.decode("#ffeee6"));

        btnConfirmar.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                String texto = (String)cbProduto.getSelectedItem() + "\t\t\t" + 
                                (String)cbQuantidade.getSelectedItem() + "\n";
                pedidos.append(texto);
            }
        });

        btnFinalizar.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                JOptionPane.showMessageDialog(null, "Pedido finalizado, agradecemos sua compra", 
                                                "Sucesso!!", JOptionPane.NO_OPTION);
                

                pedidos.setText("");
            }
        });

        this.add(btnCardapio);
        this.add(btnLogout);
        this.add(btnConfirmar);
        this.add(btnFinalizar);
        this.add(lblProduto);
        this.add(lblQuantidade);
        this.add(cbProduto);
        this.add(cbQuantidade);
        this.add(pedidos);
        this.add(background);
        
        cardapio = new JFrame("Cardápio");

        btnLogout.addMouseListener(new MouseAdapter() 
        {
            public void mouseClicked(MouseEvent e) 
            {
                trocarTela("Login");
            }
        });

        btnCardapio.addMouseListener(new MouseAdapter() 
        {
            public void mouseClicked(MouseEvent e) 
            {          
                cardapio.setBounds(70, 50, 415, 550);
                cardapio.add(imgCardapio);
                cardapio.setResizable(false);
                cardapio.setVisible(true);
            }
        });
    }

    public static JFrame getCardapio() 
    {
        return TelaPrincipal.cardapio;
    }

    public void setCardapio(JFrame cardapio) 
    {
        TelaPrincipal.cardapio = cardapio;
    }

}