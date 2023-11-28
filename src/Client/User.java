package Client;

import java.awt.AWTException;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class User extends Socket implements UserInter {
	private ObjectInputStream ois;
	private JPanel screenPanel;
	private Robot robot;
	private Rectangle screenRect = new Rectangle();
	
	public User(String IP, int port) throws UnknownHostException, IOException, AWTException {
		super(IP, port);
		robot = new Robot();
	}

	
	@Override
	public ImageIcon TakeScreenShot() { 
		BufferedImage image = robot.createScreenCapture(screenRect);
		return new ImageIcon(image);
	}

	@Override
	public void SendScreenToServer() {
		
	}

	@Override
	 public void drawImage(ImageIcon screenImage)  {
        
        Image image = screenImage.getImage();
        image = image.getScaledInstance(screenPanel.getWidth(),screenPanel.getHeight()
                                            ,Image.SCALE_SMOOTH);
        
        Graphics graphics = screenPanel.getGraphics();
        graphics.drawImage(image, 0, 0, screenPanel.getWidth(), screenPanel.getHeight(), screenPanel);
	}

	@Override
	public void ReceiveScreenFromServer() {
		
		
	}

}
