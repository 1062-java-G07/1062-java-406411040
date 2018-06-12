import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.*;

public class Bead {
	int location;
	int property;
	int width = 70;
	int hight = 70;
	boolean delete = false;
	boolean pressed = false;
	Color color;
	public int raw1;
	public int raw2;
	public int col1;
	public int col2;

	public Bead() {
		location = 0;
		property = 0;
	}

	public Bead(int l, int p) {
		location = l;
		property = p;
	}

	public void setLocation(int l) {
		location = l;
	}

	public void setProperty(int p) {
		property = p;
	}

	public void setDelete(boolean d) {
		delete = d;
	}

	public void setPressed(boolean p) {
		pressed = p;
	}

	public int getLocation() {
		return location;
	}

	public int getProperty() {
		return property;
	}

	public boolean getDelete() {
		return delete;
	}

	public boolean getPressed() {
		return pressed;
	}

	public void draw(Graphics g) {
		if (property == 0)
			color = Color.BLUE;
		else if (property == 1)
			color = Color.RED;
		else if (property == 2)
			color = Color.GREEN;
		else if (property == 3)
			color = Color.YELLOW;
		else if (property == 4)
			color = Color.MAGENTA;

		if (delete) {
			g.setColor(Color.WHITE);

			g.fillRect(0 + (location % 6) * width, 300 + (location / 6) * hight, width, hight);
		} else {
			g.setColor(color);
			g.fillOval(0 + (location % 6) * width, 300 + (location / 6) * hight, width, hight);
			g.setColor(Color.BLACK);
			g.drawString("(" + location + ")", 0 + (location % 6) * width + 30, 300 + (location / 6) * hight + 35);
			if (pressed) {
				Color bcolor = color.darker();
				g.setColor(bcolor);
				g.fillOval(0 + (location % 6) * width, 300 + (location / 6) * hight, width, hight);
				pressed = false;

			} else {
				g.setColor(color);
				g.drawOval(0 + (location % 6) * width, 300 + (location / 6) * hight, width, hight);
			}
		}
			}
}