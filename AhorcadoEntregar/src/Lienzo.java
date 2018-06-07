import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Lienzo extends JPanel {
	
	private int errores = 0;
	private Ahorcado ahorcado;
	
	public Lienzo(int errores) {
		 ahorcado = new Ahorcado(errores);
		setPreferredSize(new Dimension(500, 700));
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
	ahorcado.dibujar(g2d);
	}
	
}
