/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aish.vaishno.musicstorespringjpa.dao;

import aish.vaishno.musicstorespringjpa.pojo.MusicDetails;
import java.util.List;

/**
 *
 * @author Aishu
 */
public interface IMusicStoreDao {
    
    public void addSongs();
    public List<MusicDetails> getMusicList();
    
}
