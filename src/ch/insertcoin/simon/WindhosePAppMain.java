package ch.insertcoin.simon;

import android.view.MotionEvent;
import processing.core.*; 

public class WindhosePAppMain extends PApplet{
	public String sketchRenderer() {
		  return OPENGL; 
	}
	public void setup(){
		orientation(PORTRAIT);
	}
	public void draw(){
		  background(128);
	}
	public void pause(){
		
	}
	public void resume(){
		
	}
	
	// Override parent class's surfaceTouchEvent() method to enable multi-touch.
	// This is what grabs the Android multitouch data, and feeds our MultiTouch
	// classes.  Only executes on touch change (movement across screen, or initial
	// touch).
	@Override
	public boolean surfaceTouchEvent(MotionEvent me) {
		exit(); //exit on touch
		return super.surfaceTouchEvent(me);
	}
}

