package exercicio04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Exercicio04 {

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
		//Titulo
		formulario.setTitle("Exercício 04");
		formulario.setLayout(null);
		
		//JLabel
		JLabel pergunta1 = new JLabel();
		pergunta1.setText("Informe o produto");
		pergunta1.setBounds(10, 13, 150, 10);
		
		JLabel pergunta2 = new JLabel();
		pergunta2.setText("Informe o valor do produto");
		pergunta2.setBounds(10, 25, 160, 30);
		
		//JCheckBox
		JRadioButton rbtPraso = new JRadioButton("À praso");
		rbtPraso.setBounds(10, 80, 100, 20);
						
		JRadioButton rbtAvista = new JRadioButton("À vista");
		rbtAvista.setBounds(110, 80, 100, 20);
		
		//ButtonGruop
		ButtonGroup modoDePagamento = new ButtonGroup();
		modoDePagamento.add(rbtPraso);
		modoDePagamento.add(rbtAvista);
		
		//JTextFielg
		JTextField resposta1 = new JTextField();
		resposta1.setBounds(200, 10, 150, 20);
		
		JTextField resposta2 = new JTextField();
		resposta2.setBounds(200, 30, 150, 20);
		
		//JButton
		JButton botao = new JButton();
		botao.setText("Clique aqui");
		botao.setBounds(100, 150, 150, 30);
		
		//Ação ao botão
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				if((Double.parseDouble(resposta2.getText()) > 500) && (rbtAvista.isSelected())){
					JOptionPane.showMessageDialog(null, "Você comprou um "+resposta1.getText()+" que custa R$"+resposta2.getText()+".\nSeu produto terá 10% de desconto, devido o mesmo custar mais de R$500,00.\nO preço a pagar é de "+(Double.parseDouble(resposta2.getText()) * 0.90));
				}else{
					JOptionPane.showMessageDialog(null, "Você comprou um "+resposta1.getText()+" que custará R$"+resposta2.getText());
				}
				
				//Limpar campos
				resposta1.setText("");
				resposta2.setText("");
				
				//Retornar ao primeiro campo
				resposta1.requestFocus();
				
			}
		});
		
		//Adicionar componentes ao JFrama
		formulario.add(pergunta1);
		formulario.add(pergunta2);
		formulario.add(rbtAvista);
		formulario.add(rbtPraso);
		formulario.add(resposta1);
		formulario.add(resposta2);
		formulario.add(botao);
		
		//Tornar o formulario visivel
		formulario.setVisible(true);
		formulario.repaint();
		
	}

}
