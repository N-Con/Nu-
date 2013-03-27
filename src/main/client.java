package main;

import org.lwjgl.opengl.*;
import org.lwjgl.*;
import static org.lwjgl.opengl.GL11.*;
 
public class client {
	public static void main(String[] args) {
		try {
			Display.setDisplayMode(new DisplayMode(640, 480));
			Display.setTitle("Display");
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
			Display.destroy();
			System.exit(1);
		}
		while(!Display.isCloseRequested()) {
			Display.update();
			Display.sync(60);
			glMatrixMode(GL_PROJECTION);
			glLoadIdentity(); // Resets any previous projection matrices
			glOrtho(0, 640, 480, 0, 1, -1);
			glMatrixMode(GL_MODELVIEW);
		}
		Display.destroy();
		System.exit(0);
	}

}