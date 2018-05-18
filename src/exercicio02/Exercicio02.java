package exercicio02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Exercicio02 {

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
		//Titulo
		formulario.setTitle("Exercício 02");
		formulario.setLayout(null);
		
		//JLabel
		JLabel pergunta = new JLabel();
		pergunta.setText("Informe o valor do produto");
		pergunta.setBounds(10, 10, 150, 20);
		
		//JTextField
		JTextField campo = new JTextField();
		campo.setBounds(180, 10, 150, 20);
		
		//JButton
		JButton botao = new JButton();
		botao.setText("Clique aqui");
		botao.setBounds(30, 40, 150, 20);
		
		//Adicionar uma ação ao botão
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				//Exibir frase
				JOptionPane.showMessageDialog(null, "O valor inserido foi de R$"+campo.getText()+"\nCom 10% de desconto, o valor ficará em R$"+(Double.parseDouble(campo.getText())-(Double.parseDouble(campo.getText())*0.10)));
				
				//Limpar campo
				campo.setText("");
				
				//Selecionar campo
				campo.requestFocus();
				
			}
		});
		
		
		//Adicionar elementos ao JFrame
		formulario.add(pergunta);
		formulario.add(campo);
		formulario.add(botao);
		
		//Exibir formulário
		//Forçar o formularioa à aparecer na tela pequena
		formulario.repaint();
		formulario.setVisible(true);
		

		
	}

}
