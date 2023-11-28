package server;

import java.net.Socket;

import javax.swing.ImageIcon;

public interface ServerInter {
	
	void sendScreenToUser(Socket user, ImageIcon screenImage);
	
	void sendToAllUsers(ImageIcon screenImage);
	
	void receiveScreenFromUser();

}
