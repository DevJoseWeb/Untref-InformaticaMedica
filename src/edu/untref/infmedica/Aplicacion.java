package edu.untref.infmedica;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class Aplicacion {

	private JPanel contentPane;
	private JFrame ventana;

	public static void main(String[] args) {

		Aplicacion app = new Aplicacion();
	}

	public Aplicacion() {

		ventana = new JFrame();
		ventana.setSize(800, 600);
		GUI();
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void GUI() {

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.ventana.setContentPane(contentPane);
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{200, 200, 200, 200, 200};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 200, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gridBagLayout);
		
		JList list = new JList();
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.insets = new Insets(0, 0, 0, 5);
		gbc_list.gridheight = 10;
		gbc_list.gridx = 0;
		gbc_list.gridy = 0;
		contentPane.add(list, gbc_list);
		
		JLabel lblNewLabel_3 = new JLabel("ID:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 0;
		contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 2;
		gbc_lblNewLabel_5.gridy = 0;
		contentPane.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		JLabel lblImgenes = new JLabel("Imágenes");
		GridBagConstraints gbc_lblImgenes = new GridBagConstraints();
		gbc_lblImgenes.insets = new Insets(0, 0, 5, 0);
		gbc_lblImgenes.gridx = 3;
		gbc_lblImgenes.gridy = 0;
		contentPane.add(lblImgenes, gbc_lblImgenes);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 1;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 2;
		gbc_lblNewLabel_6.gridy = 1;
		contentPane.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		JList list_1 = new JList();
		GridBagConstraints gbc_list_1 = new GridBagConstraints();
		gbc_list_1.fill = GridBagConstraints.BOTH;
		gbc_list_1.insets = new Insets(0, 0, 5, 0);
		gbc_list_1.gridheight = 6;
		gbc_list_1.gridx = 3;
		gbc_list_1.gridy = 1;
		contentPane.add(list_1, gbc_list_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 2;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 2;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblHistoriaClniica = new JLabel("Historia clínica");
		GridBagConstraints gbc_lblHistoriaClniica = new GridBagConstraints();
		gbc_lblHistoriaClniica.insets = new Insets(0, 0, 5, 5);
		gbc_lblHistoriaClniica.gridx = 1;
		gbc_lblHistoriaClniica.gridy = 4;
		contentPane.add(lblHistoriaClniica, gbc_lblHistoriaClniica);
		
		JTextArea textArea = new JTextArea();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.gridwidth = 2;
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.insets = new Insets(0, 0, 5, 5);
		gbc_textArea.gridx = 1;
		gbc_textArea.gridy = 5;
		contentPane.add(textArea, gbc_textArea);
		
		JButton btnNewButton = new JButton("Mostrar imagen");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 3;
		gbc_btnNewButton.gridy = 7;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 3;
		gbc_comboBox.gridy = 8;
		contentPane.add(comboBox, gbc_comboBox);
		
		JButton btnNewButton_1 = new JButton("Aplicar filtro");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.gridx = 3;
		gbc_btnNewButton_1.gridy = 9;
		contentPane.add(btnNewButton_1, gbc_btnNewButton_1);
	}
}