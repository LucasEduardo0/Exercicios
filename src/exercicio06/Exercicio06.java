package exercicio06;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Exercicio06 {

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
		//Título
		formulario.setTitle("Exercício 06");
		//
		formulario.setLayout(null);
		
		//JLabel
		JLabel pergunta = new JLabel();
		pergunta.setText("Informe um número");
		pergunta.setBounds(10, 10, 150, 20);
		
		JLabel pergunta2 = new JLabel();
		pergunta2.setText("Informe mais um número");
		pergunta2.setBounds(10, 30, 150, 20);
		
		//JTextField
		JTextField resposta = new JTextField();
		resposta.setBounds(200, 10, 100, 20);
		
		JTextField resposta2 = new JTextField();
		resposta2.setBounds(200, 30, 100, 20);
		
		//JButton
		JButton botao = new JButton();
		botao.setText("Bora, click aqui");
		botao.setBounds(55, 70, 150, 20);
		
		//Ação ao botão
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				if(resposta.getText().equals(resposta2.getText())){
					JOptionPane.showMessageDialog(null, resposta.getText()+" + "+resposta2.getText()+" = "+(Integer.parseInt(resposta.getText()) + Integer.parseInt(resposta2.getText())));
				}else{
					JOptionPane.showMessageDialog(null, resposta.getText()+" x "+resposta2.getText()+" = "+(Integer.parseInt(resposta.getText()) * Integer.parseInt(resposta2.getText())));
				}
				
				//Limpar campos
				resposta.setText("");
				resposta2.setText("");
				
				//Selecionar o primeiro campo
				resposta.requestFocus();
				
			}
		});
		
		//Adicionar ao JFrame
		formulario.add(pergunta);
		formulario.add(pergunta2);
		formulario.add(resposta);
		formulario.add(resposta2);
		formulario.add(botao);
		
		//Forçar
		formulario.repaint();
		
	}

}