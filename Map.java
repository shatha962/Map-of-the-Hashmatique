import java.util.HashMap;
import java.util.Set;
public class Map{
    public static void main(String[] args){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("song1" , "song");
        trackList.put("song2" , "song");
        trackList.put("song3" , "song");
        trackList.put("song4" , "song");
        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println("Track: " + key + " Lyrics: " + trackList.get(key)); 
        }
    }
}