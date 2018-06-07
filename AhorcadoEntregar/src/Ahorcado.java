import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.Line2D;


public class Ahorcado {
	private static Shape[] dibujo;
	
	private int error = 0;

	public Ahorcado(int errores) {
		this.error =errores;
	}


	static {
		dibujo = new Shape[11];
		dibujo[0] = new Line2D.Double(479, 479, 19, 479);
		dibujo[1] = new Line2D.Double(19, 479, 19, 19);
		dibujo[2] = new Line2D.Double(19, 19, 249, 19);
		dibujo[3] = new Line2D.Double(19, 89, 89, 19);
		dibujo[4] = new Line2D.Double(249, 19, 249, 89);
		dibujo[5] = new Arc2D.Double(224, 89, 50, 50, 0, 360, Arc2D.OPEN);
		dibujo[6] = new Line2D.Double(249, 139, 249, 279);
		dibujo[7] = new Line2D.Double(249, 149, 199, 199);
		dibujo[8] = new Line2D.Double(249, 149, 299, 199);
		dibujo[9] = new Line2D.Double(249, 279, 209, 349);
		dibujo[10] = new Line2D.Double(249, 279, 289, 349);

	}

	public void dibujar(Graphics2D g) {
		g.setColor(Color.BLACK);
		 for (int i=0; i<error; i++) {
		 g.draw(dibujo[i]);
		 }
		
	}
	


}