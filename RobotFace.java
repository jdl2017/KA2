package week2;


import java.awt.*;
import java.awt.event.*;
import acm.graphics.*;
import acm.program.*;

/* This class will a robot face with a head, two eyes, and a
 * mouth. 
 */

public class RobotFace extends GraphicsProgram {
	
	private final int HEAD_WIDTH = 200;
	private final int HEAD_HEIGHT = 350;
	private final int EYE_RADIUS = 50;
	private final int MOUTH_WIDTH = 100;
	private final int MOUTH_HEIGHT = 50;
	
	public void run() {
		//The head
		GRect Head = new GRect(250, 50, HEAD_WIDTH, HEAD_HEIGHT);
	      Head.setFillColor(Color.GRAY);
	      Head.setFilled(true);
		add(Head);
		
		//The eyes
		GOval RightEye = new GOval(270, 80, EYE_RADIUS, EYE_RADIUS);
		RightEye.setFillColor(Color.YELLOW);
		RightEye.setFilled(true);
		add(RightEye);
		
		GOval LeftEye = new GOval(370, 80, EYE_RADIUS, EYE_RADIUS);
		LeftEye.setFillColor(Color.YELLOW);
		LeftEye.setFilled(true);
		add(LeftEye);
		
		//The mouth
		GRect Mouth = new GRect(300, 300, MOUTH_WIDTH, MOUTH_HEIGHT);
		  Mouth.setColor(Color.white);
	      Mouth.setFillColor(Color.WHITE);
	      Mouth.setFilled(true);
		add(Mouth);
	}

}
