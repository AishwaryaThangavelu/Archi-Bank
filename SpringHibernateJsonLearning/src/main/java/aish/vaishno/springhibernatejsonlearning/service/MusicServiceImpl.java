/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aish.vaishno.springhibernatejsonlearning.service;

import aish.vaishno.springhibernatejsonlearning.dao.IMusicDao;
import aish.vaishno.springhibernatejsonlearning.transferobject.SongDetails;
import java.util.List;

/**
 *
 * @author Aishu
 */
public class MusicServiceImpl implements IMusicService{
    
    private IMusicDao musicDao;

    public void setMusicDao(IMusicDao musicDao) {
        this.musicDao = musicDao;
    }

    @Override
    public void addNewSong(SongDetails songDetails) {
        musicDao.addSong(songDetails);
    }

    @Override
    public List<SongDetails> getAllSongList() {
       return  musicDao.getSong();
    }
    
}
