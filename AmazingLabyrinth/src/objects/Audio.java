package objects;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Audio{
	
	//Variables for the music
	static Clip clip;
	static long clipTimePostion;
	
	//Methods that actually create the music
	public static void playMusic(String musicLocation){	
		 
		try{
			
			// Make the method and pass the variables to the method
			File Sound = new File(musicLocation);//method to read the file
			AudioInputStream audioInput = AudioSystem.getAudioInputStream(Sound);
			clip = AudioSystem.getClip();
			clip.open(audioInput);
			clip.start();// start the music
			clip.loop(clip.LOOP_CONTINUOUSLY);//Loop the music	
			
		}catch (Exception ex){
			ex.printStackTrace();
		}
		
	}

	//Method to stop the music
	public static void StopMusic(String musicLocation){
		
		//Stop the music
		clip.stop();
	
	}
	
}