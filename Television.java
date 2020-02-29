import java.util.Scanner;
public class Television {

	// Declare manufacturer 
		public final String MANUFACTURER;
		
		// Declare TV size
		public final int TV_SIZE;
		
		//Declare Power of TV true is on or false is off
		public boolean powerOn;
		
		//Declare channels of TV
		public int channel;
		
		// Declare volume of TV
		public int volume;
		
		public Television (String brand, int size)
		{
			MANUFACTURER = brand;
			TV_SIZE = size;
		}
		
		public void power(){
		{
			volume=46;
			channel=2;
			
			
			powerOn= !powerOn;
		}
		


	}
		//set channel = station
		public void setChannel(int station) {
			channel = station;
			
		}
		//increase volume by 1
		public void increaseVolume() {
			volume+=1;
			
		}
		// decrease volume by 1
		public void decreaseVolume() {
			volume -=1;
			
		}
		
		// return variable to channel
		public int getChannel() {
			
			return channel;
		}
		
		//return variable volume
		public int getVolume() {
			// TODO Auto-generated method stub
			return volume;
		}
		
		// return string variable manufacturer above
public String getManufacturer()
{
	return MANUFACTURER;
}
// return int variable to TV_SIZE above

	public int getScreenSize() {
		return TV_SIZE;
	}

}
