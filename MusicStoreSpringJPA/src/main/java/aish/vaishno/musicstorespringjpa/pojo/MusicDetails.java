/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aish.vaishno.musicstorespringjpa.pojo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Aishu
 */
@Entity
@Table(name = "MUSIC_COLLECTIONS")
public class MusicDetails implements Serializable {
    
  @Id
  @Column(name = "MC_ID")
  private Integer musicID;
 
  @Column(name = "MC_LANGUAGE")
  private String musicLanguage;
  
  @Column(name = "MC_TYPE")
  private String musicType;
  
  @Column(name = "MC_SONG_NAME")
  private String songName;

    public Integer getMusicID() {
        return musicID;
    }

    public void setMusicID(Integer musicID) {
        this.musicID = musicID;
    }

    public String getMusicLanguage() {
        return musicLanguage;
    }

    public void setMusicLanguage(String musicLanguage) {
        this.musicLanguage = musicLanguage;
    }

    public String getMusicType() {
        return musicType;
    }

    public void setMusicType(String musicType) {
        this.musicType = musicType;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }
    
    
     @Override
   public String toString() {
      return "MusicDetails{" + "musicID=" + musicID + ", musicLanguage=" + musicLanguage + ", musicType=" + musicType + ", songName=" + songName + '}'+"\n";
    }
}
