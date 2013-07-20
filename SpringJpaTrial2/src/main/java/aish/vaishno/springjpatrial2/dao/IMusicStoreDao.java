/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aish.vaishno.springjpatrial2.dao;

import aish.vaishno.springjpatrial2.pojo.MusicDetails;
import java.util.List;

/**
 *
 * @author Aishu
 */
public interface IMusicStoreDao {
    
    public void addSongs();
    public List<MusicDetails> getMusicList();
    
}
