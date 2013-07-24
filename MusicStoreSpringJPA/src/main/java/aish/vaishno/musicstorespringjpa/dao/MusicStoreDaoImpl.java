/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aish.vaishno.musicstorespringjpa.dao;

import aish.vaishno.musicstorespringjpa.pojo.MusicDetails;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Aishu
 */

@Service(value = "MusicCollections")
@Repository(value = "MusicCollections")
@Transactional
public class MusicStoreDaoImpl implements IMusicStoreDao{
    
  @PersistenceContext(unitName = "simple-jpa")
    private EntityManager entityManager;
    
    
    
    public void setEntityManager(EntityManager entityManager){
    this.entityManager = entityManager;
    }
    

   @Override
     public List<MusicDetails> getMusicList(){
     List<MusicDetails> musicDetailsList= entityManager.createQuery("select c from MusicDetails c").getResultList();
     return musicDetailsList;
    }

}
