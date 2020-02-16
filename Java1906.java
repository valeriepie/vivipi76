///////////////////////////////////////////////////////////////////////////
//
// Java1906  Write a program for the Incredible Shrinking Circle.  Fill in
//			 a LARGE BLUE circle, followed by a MEDIUM RED circle, followed
//			 by a SMALL GREEN circle, and finishing with a TINY MAGENTA
//			 circle.
//
//  *  * DON'T FORGET TO ADJUST THE UPPER LEFT COORDINATES OF EACH CIRCLE! * *
//
//			The amount of times for the shrinking circle to repeat its task
//          will be input by the user.  It should stop on the tiny magenta
//          circle after the input number of iterations.
//          		
//			REQUIRED LOOP:  	while(x < ???)
//
import static java.lang.System.*;
import java.awt.*;
import java.util.*;

public class Java1906
{
	public static void main(String[] args)
	{
		Problem06 solution = new Problem06();
		solution.input();
		solution.output();
	}
}

class Problem06 extends JDrawingFrame
{
	int num;
	
	void input()
	{
		Scanner scan = new Scanner(in);
		out.print("How many times do you want to see the circle shrink: ");
		num = scan.nextInt();
	}
	
	void output()
	{
		showFrame();

		int x = 1;
   		while ( x <= num )
     	{
     		// erase
     		clear();
			// set the color to blue
			setColor(Color.BLUE);
			// fill the circle
			pen.fillOval(250,200,200,200);
			// update
			repaint();
			// wait
			delay(1000);

			// same steps for medium red circle
			clear();
			// set the color to blue
			setColor(Color.RED);
			// fill the circle
			pen.fillOval(300,250,120,120);
			// update
			repaint();
			// wait
			delay(1000);
			// now a small green circle
			
			// finally, a tiny magenta circle
			
			// increase x						
     	}

	}
}














