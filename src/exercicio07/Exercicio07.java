package exercicio07;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Exercicio07 {

	public static void main(String[] args) {

		//Iniciar JFrame
		JFrame formulario = new JFrame();
		//Tornar visivel
		formulario.setVisible(true);
		//Finalizar quando sair
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Tamanho
		formulario.setSize(500, 300);
		//Centralizar
		formulario.setLocationRelativeTo(null);
		//T�tulo
		formulario.setTitle("Exerc�cio 07");
		//
		formulario.setLayout(null);
		
		//JLabel
		JLabel pergunta = new JLabel();
		pergunta.setText("Informe um n�mero");
		pergunta.setBounds(10, 10, 150, 20);
		
		//JTextField
		JTextField resposta = new JTextField();
		resposta.setBounds(150, 10, 150, 20);
		
		//JButton
		JButton botao = new JButton();
		botao.setText("Click para ver a Mia Khalifa");
		botao.setBounds(50, 40, 250, 20);
		
		//A��o ao bot�o
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				String texto = "";
				int indice = 0;
				
				while(indice <= 10){
					
					texto += resposta.getText()+" x "+indice+" + "+(Integer.parseInt(resposta.getText()) * indice)+"\n";
				
					indice++;
					
				}
				
				JOptionPane.showMessageDialog(null, texto);
				
				//Limpar campo
				resposta.setText("");
				
				//Selecionar campo
				resposta.requestFocus();
				
			}
		});
		
		//Adicionar ao JFrame
		formulario.add(pergunta);
		formulario.add(resposta);
		formulario.add(botao);
		
		//For�ar � aparecer
		formulario.repaint();
		
	}

}