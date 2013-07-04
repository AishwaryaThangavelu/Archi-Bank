/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aish.vaishno.springhibernatejsonlearning.service;

import aish.vaishno.springhibernatejsonlearning.transferobject.SongDetails;
import java.util.List;

/**
 *
 * @author Aishu
 */
public interface IMusicService {
    
    public void addNewSong(SongDetails songDetails);
    public List<SongDetails> getAllSongList();
    
}
