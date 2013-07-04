/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aish.vaishno.springhibernatejsonlearning.dao;

import aish.vaishno.springhibernatejsonlearning.transferobject.SongDetails;
import java.util.List;

/**
 *
 * @author Aishu
 */
public interface IMusicDao {
    
    public void addSong(SongDetails songDetails);
    public List<SongDetails> getSong();
      
}
