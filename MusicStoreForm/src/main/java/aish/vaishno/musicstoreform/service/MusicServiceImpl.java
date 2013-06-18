/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aish.vaishno.musicstoreform.service;


import org.springframework.stereotype.Service;

/**
 *
 * @author Aishu
 */
@Service
public class MusicServiceImpl implements IMusicService{

    @Override
    public String play() {
        return "Music is played on!!!";
    }

    @Override
    public String pause() {
        return "Music has been PAUSED !";
    }

    @Override
    public String stop() {
        return "Music Stopped";
    }
    
}
