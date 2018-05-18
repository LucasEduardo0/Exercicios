package exercicio03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Exercicio03 {

	public static void main(String[] args) {

		//Iniciar o JFrame
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
		formulario.setTitle("Exercício 03");
		formulario.setLayout(null);
		
		//JLabel
		JLabel pergunta1 = new JLabel();
		pergunta1.setText("1ª nota");
		pergunta1.setBounds(10, 10, 150, 20);
		
		JLabel pergunta2 = new JLabel();
		pergunta2.setText("2ª nota");
		pergunta2.setBounds(10, 20, 160, 40);
		
		JLabel pergunta3 = new JLabel();
		pergunta3.setText("3ª nota");
		pergunta3.setBounds(10, 30, 170, 60);
		
		JLabel pergunta4 = new JLabel();
		pergunta4.setText("4ª nota");
		pergunta4.setBounds(10, 40, 180, 80);
		
		//JTExtField
		JTextField resposta1 = new JTextField();
		resposta1.setBounds(70, 10, 150, 20);
		
		JTextField resposta2 = new JTextField();
		resposta2.setBounds(70, 30, 150, 20);
		
		JTextField resposta3 = new JTextField();
		resposta3.setBounds(70, 50, 150, 20);
		
		JTextField resposta4 = new JTextField();
		resposta4.setBounds(70, 70, 150, 20);
		
		//JButton
		JButton botao = new JButton();
		botao.setText("Clique aqui");
		botao.setBounds(30, 100, 150, 20);
		

		//Adicionar uma ação ao botão
		botao.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				double media = (Double.parseDouble(resposta1.getText())+Double.parseDouble(resposta2.getText())+Double.parseDouble(resposta3.getText())+Double.parseDouble(resposta4.getText())) / 4;

				JOptionPane.showMessageDialog(null, "Sua média foi de "+media);
				

				if((media >= 7) && (media <= 10)){
					JOptionPane.showMessageDialog(null, "Você está aprovado!");
				}else if((media >= 5) && (media < 7)){
					JOptionPane.showMessageDialog(null, "Você está em exame!");
				}else{
					JOptionPane.showMessageDialog(null, "Você está reprovado");
				}
				
			
				
			//Limpar campos
			resposta1.setText("");
			resposta2.setText("");
			resposta3.setText("");
			resposta4.setText("");
			
			//Retornar ao primeiro campo
			resposta1.requestFocus();
				
			}
		});
		
		//Adicionar elementos ao JFrame
		formulario.add(pergunta1);
		formulario.add(pergunta2);
		formulario.add(pergunta3);
		formulario.add(pergunta4);
		formulario.add(resposta1);
		formulario.add(resposta2);
		formulario.add(resposta3);
		formulario.add(resposta4);
		formulario.add(botao);

		//Exibir formulario
		formulario.repaint();
		formulario.setVisible(true);
		
	}

}
