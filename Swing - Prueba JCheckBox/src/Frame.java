import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Frame extends JFrame {

	JTextField texto;
	int negrita = 0;
	int cursiva = 0;
	
	public Frame() {
		super("Ejemplo de JCheckBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
		texto = new JTextField("Texto de Prueba");
		texto.setColumns(30);
		texto.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createEmptyBorder(20, 20, 20, 20),
				texto.getBorder()));
		c.add(texto);
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		JCheckBox cb;
		cb = new JCheckBox("Negrita");
		cb.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED)
					negrita = Font.BOLD;
				else
					negrita = 0;
				texto.setFont(texto.getFont().deriveFont(negrita + cursiva));
			}
			
		});
		panel.add(cb);
		cb = new JCheckBox("Cursiva");
		cb.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED)
					cursiva = Font.ITALIC;
				else
					cursiva = 0;
				texto.setFont(texto.getFont().deriveFont(negrita + cursiva));
			}
			
		});
		panel.add(cb);
		c.add(panel);
		pack();
	}
	
}
