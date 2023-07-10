package composite;
public class Playlist implements IComponent {

	public String playlistName;
	public ArrayList<IComponent> playlist = new ArrayList();

	public Playlist(String playlistName) {
		this.playlistName = playlistName;
	}

  // Your code goes here!
  public void play() {
    for (int i = 0; i < playlist.size(); i++) {
      playlist[i].play();
    }
  }

  public void setPlaybackSpeed(float speed) {
    for (int i = 0; i < playlist.size(); i++) {
      playlist[i].setPlaybackSpeed(speed);
    }    
  }

  public String getName() {
    return playlistName;
  }

  public void add(IComponent component) {
    playlist.add(component);
  }

  public void remove(IComponent component) {
    playlist.remove(component);
  }
}
