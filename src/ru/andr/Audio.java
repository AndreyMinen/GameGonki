package ru.andr;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;


public class Audio implements Runnable {

	@Override
	public void run() {
		
		
		try {
			  FileInputStream fis=new FileInputStream("resouces/res/song.mp3");
		      BufferedInputStream bis=new BufferedInputStream(fis);
			try {
				Player player=new Player(bis);
				player.play();
				if(player!=null){
					player.close();
				}
			} catch (JavaLayerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
