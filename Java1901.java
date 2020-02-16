///////////////////////////////////////////////////////////////////////////
//
// Java1901 Harry's Hardware store is having trouble with their light switches.
//			They keep blinking on and off and the only way they can get them
//		    to stop blinking is to press the emergency escape button by the
//			door.
//
//			Write a program that alternates saying "ON" (in green) and "OFF"
//          (in red) on the graphics screen until the user presses the ESC key.
//
//			REQUIRED LOOP:  	while(true)


import static java.lang.System.*;
import java.awt.*;
import java.util.*;

public class Java1901
{
	public static void main(String[] args)
	{
		Problem01 solution = new Problem01();
		solution.output();
	}
}

class Problem01 extends JDrawingFrame
{
	void output()
	{
		showFrame();

		setColor(Color.RED);
		setFont(new Font("Garamond",Font.BOLD,100));

		while(true)
     	{
     		clear();
     		setColor(Color.GREEN);
 			// display "ON"
 			pen.drawString("ON",250,250);
			// update/refresh
			repaint();
			// wait
			delay(500);
			clear();
			// repeat process for "OFF
			setColor(Color.RED);
			pen.drawString("ON",250,250);
			repaint();
			delay(500);

     	}

	}
}












