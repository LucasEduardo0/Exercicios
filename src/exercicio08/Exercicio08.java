package exercicio08;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Exercicio08 {
	
	public static void main(String[] args) {
		
		//Iniciar JFrame
		JFrame formulario = new JFrame();
		//Tornar visivel
		formulario.setVisible(true);
		//Finalizar quando sair
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Tamanho
		formulario.setSize(400, 300);
		//Centralizar
		formulario.setLocationRelativeTo(null);
		//
		formulario.setLayout(null);
		
		//JLabel
		JLabel pergunta1 = new JLabel();
		pergunta1.setText("Informe um número");
		pergunta1.setBounds(10, 10, 150, 20);
		
		JLabel pergunta2 = new JLabel();
		pergunta2.setText("Informa mais um número");
		pergunta2.setBounds(10, 30, 150, 20);
		
		//JTextField
		JTextField resposta1 = new JTextField();
		resposta1.setBounds(170, 10, 150, 20);
		
		JTextField resposta2 = new JTextField();
		resposta2.setBounds(170, 30, 150, 20);
		
		//JCheckBox
		JCheckBox somar = new JCheckBox("Somar");
		somar.setBounds(10, 75, 100, 20);
		
		JCheckBox subtrair = new JCheckBox("Subtrair");
		subtrair.setBounds(110, 75, 100, 20);
		
		JCheckBox multiplicar = new JCheckBox("Multiplicar");
		multiplicar.setBounds(210, 75, 100, 20);
		
		JCheckBox dividir = new JCheckBox("Dividir");
		dividir.setBounds(310, 75, 100, 20);
		
	
		
		//ButtonGruop
		ButtonGroup operacao = new ButtonGroup();
		operacao.add(somar);
		operacao.add(subtrair);
		operacao.add(multiplicar);
		operacao.add(dividir);
		
		//JButton
		JButton botao = new JButton();
		botao.setText("Ganhe R$100");
		botao.setBounds(75, 150, 150, 20);
		
		//Ação ao botão
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				if(somar.isSelected()){
					JOptionPane.showMessageDialog(null, resposta1.getText()+" + "+resposta2.getText()+" = "+(Integer.parseInt(resposta1.getText()) + Integer.parseInt(resposta2.getText())));
				}else if(subtrair.isSelected()){
					JOptionPane.showMessageDialog(null, resposta1.getText()+" - "+resposta2.getText()+" = "+(Integer.parseInt(resposta1.getText()) - Integer.parseInt(resposta2.getText())));
				}else if(multiplicar.isSelected()){
					JOptionPane.showMessageDialog(null, resposta1.getText()+" x "+resposta2.getText()+" = "+(Integer.parseInt(resposta1.getText()) * Integer.parseInt(resposta2.getText())));
				}else{
					JOptionPane.showMessageDialog(null, resposta1.getText()+" / "+resposta2.getText()+" = "+(Integer.parseInt(resposta1.getText()) / Integer.parseInt(resposta2.getText())));
				}
				
				//Limpar
				resposta1.setText("");
				resposta2.setText("");
				
				//Limpar ButtonGruop
				operacao.clearSelection();
				
				//Selecionar
				resposta1.requestFocus();
				
			}
		});
		
		//Adicionar ao JFrame
		formulario.add(pergunta1);
		formulario.add(pergunta2);
		formulario.add(resposta1);
		formulario.add(resposta2);
		formulario.add(botao);
		formulario.add(somar);
		formulario.add(subtrair);
		formulario.add(multiplicar);
		formulario.add(dividir);
		
		//Forçar
		formulario.repaint();
		
	}

}
