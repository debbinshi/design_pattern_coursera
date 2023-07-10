package composite;

public class Song implements IComponent {
	public String songName;
	public String artist;
	public float speed = 1; // Default playback speed

	public Song(String songName, String artist ) {
		this.songName = songName;
		this.artist = artist; 
	}
	
	// Your code goes here!
  public void play() {
    System.out.println("playing " + songName);
  }
	public void setPlaybackSpeed(float speed) {
    this.speed = speed;
  }
  public String getName() {
    return songName;
  }
  public String getArtist() {
    return artist;
  }
}