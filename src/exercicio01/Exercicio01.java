package exercicio01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		//Iniciar JFRame
		JFrame formulario = new JFrame();
		//Tornar visivel
		formulario.setVisible(true);
		//Finalizar quando sair
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Tamnho
		formulario.setSize(500, 300);
		//Centralizar
		formulario.setLocationRelativeTo(null);
		//Título
		formulario.setTitle("Exercício 01");
		formulario.setLayout(null);
		
		//JLabel
		JLabel pergunta1 = new JLabel();
		pergunta1.setText("Informe seu nome");
		pergunta1.setBounds(10, 10, 150, 20);
		
		JLabel pergunta2 = new JLabel();
		pergunta2.setText("Informe sua idade");
		pergunta2.setBounds(10, 20, 160, 40);
		
		JLabel pergunta3 = new JLabel();
		pergunta3.setText("Informe onde você mora");
		pergunta3.setBounds(10, 30, 170, 60);
		
		//JtextField
		JTextField campo1 = new JTextField();
		campo1.setBounds(170, 10, 150, 20);
		
		JTextField campo2 = new JTextField();
		campo2.setBounds(170, 30, 150, 20);
		
		JTextField campo3 = new JTextField();
		campo3.setBounds(170, 50, 150, 20);
		
		//JButton
		JButton botao = new JButton();
		botao.setText("Clique aqui");
		botao.setBounds(60, 90, 150, 20);
		
		//Adicionar uma ação ao botão
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				//Exibir frase
				JOptionPane.showMessageDialog(null, "Olá "+campo1.getText()+", você tem "+campo2.getText()+" anos de idade e mora em "+campo3.getText());
			
				//Limpar os campos contendo a informação
				campo1.setText("");
				campo2.setText("");
				campo3.setText("");
				
				//Selecionar o campo contendo o nome
				campo1.requestFocus();
				
			}
		});
		
		//Adicionar elementos ao JFrame
		formulario.add(pergunta1);
		formulario.add(pergunta2);
		formulario.add(pergunta3);
		formulario.add(campo1);
		formulario.add(campo2);
		formulario.add(campo3);
		formulario.add(botao);
		
		//Exibir o formulario
		//Forçar o formularioa à aparecer na tela pequena
		formulario.repaint();
		formulario.setVisible(true);
		
	}

}
