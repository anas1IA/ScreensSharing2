package Client;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.ImageIcon;

interface UserInter {
	
	 public ImageIcon TakeScreenShot();
	 
	 public void SendScreenToServer();
	 
	 public void drawImage(ImageIcon image) throws ClassNotFoundException, IOException;
	 
	 public void ReceiveScreenFromServer();
	
	 }
