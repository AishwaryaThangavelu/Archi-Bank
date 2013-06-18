/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aish.vaishno.musicstoreform.transferobject;

import org.springframework.stereotype.Service;

/**
 *
 * @author Aishu
 */
//@Service("songDetails")
public class SongDetails {
    
    private String language;
    private String songType;
    private String songName;
    private String musicDirector;

    public String getSongName() {
	return songName;
    }
    
    public void setSongName(String songName) {
	this.songName = songName;
    }
   
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSongType() {
        return songType;
    }
        
    public void setSongType(String songType) {
        this.songType = songType;
    }
    
    public String getMusicDirector() {
        return musicDirector;
    }

    public void setMusicDirector(String musicDirector) {
        this.musicDirector = musicDirector;
    }
    
       
}
