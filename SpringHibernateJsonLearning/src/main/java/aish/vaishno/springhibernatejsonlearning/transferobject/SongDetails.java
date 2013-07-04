/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aish.vaishno.springhibernatejsonlearning.transferobject;

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
@Table(name ="MUSIC_DETAILS")
public class SongDetails implements Serializable {

    @Id
    @Column(name = "MD_ID")
    private Integer songID;
    
    @Column(name = "MD_SONG_NAME")
    private String songName;
    
    @Column(name = "MD_TYPE")
    private String songType;
    
    @Column(name = "MD_LANGUAGE")
    private String songLanguage;
    
    @Column(name = "MD_SINGER")
    private String singer;

    public Integer getSongID() {
        return songID;
    }

    public void setSongID(Integer songID) {
        this.songID = songID;
    }
    
    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSongType() {
        return songType;
    }

    public void setSongType(String songType) {
        this.songType = songType;
    }

    public String getSongLanguage() {
        return songLanguage;
    }

    public void setSongLanguage(String songLanguage) {
        this.songLanguage = songLanguage;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }
    
    @Override
    public String toString() {
        return "SongDetails{" + "songName=" + songName + ", songType=" + songType + ", songLanguage=" + songLanguage + ", singer=" + singer + '}';
    }

}
