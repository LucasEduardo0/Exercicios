package exercicio05;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Exercicio05 {

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
		formulario.setTitle("Exercício 05");
		//
		formulario.setLayout(null);
		
		//JLabel
		JLabel pergunta = new JLabel();
		pergunta.setText("Escolha um dia de Fevereiro/2018");
		pergunta.setBounds(10, 10, 250, 20);
		
		//JTextField
		JTextField resposta = new JTextField();
		resposta.setBounds(230, 10, 100, 20);
		
		//JButton
		JButton botao = new JButton();
		botao.setText("Taca o click aí");
		botao.setBounds(55, 40, 150, 20);
		
		//Ação ao botçao
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				if((resposta.getText().equals("3")) || (resposta.getText().equals("4")) || (resposta.getText().equals("10")) || (resposta.getText().equals("11")) || (resposta.getText().equals("17")) || (resposta.getText().equals("18")) || (resposta.getText().equals("24")) || (resposta.getText().equals("25"))){
					JOptionPane.showMessageDialog(null, "Fim de semana");
				}else if((Integer.parseInt(resposta.getText()) < 1) || (Integer.parseInt(resposta.getText()) > 28)){
					JOptionPane.showMessageDialog(null, "Dia invalido");
				}else{
					JOptionPane.showMessageDialog(null, "Dia de semana");
				}
				
				//Limpar campos
				resposta.setText("");
				
				//Selecionar o primeiro campo
				resposta.requestFocus();
				
			}
		});
		
		//Adicionar componentes ao JFrame
		formulario.add(pergunta);
		formulario.add(resposta);
		formulario.add(botao);
		
		//Tornar visivel
		formulario.setVisible(true);
		formulario.repaint();
		
	}

}
