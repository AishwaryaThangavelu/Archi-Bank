/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aish.vaishno.springjpatrial2.dao;

import aish.vaishno.springjpatrial2.pojo.MusicDetails;
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

@Service(value = "Aishwarya's Music Store Dao")
@Repository(value = "Aishwarya's Music Store Dao")
@Transactional
public class MusicStoreDaoImpl implements IMusicStoreDao{
    
  //  @PersistenceContext
  @PersistenceContext(unitName = "simple-jpa")
    private EntityManager entityManager;
    
    
    
    public void setEntityManager(EntityManager entityManager){
    this.entityManager = entityManager;
    }
    

            
//       private  EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("simple-jpa");
//       private  EntityManager entityManager = entityManagerFactory.createEntityManager();
    
        @Override
        public List<MusicDetails> getMusicList(){
            List<MusicDetails> musicDetailsList= entityManager.createQuery("select c from MusicDetails c").getResultList();
            return musicDetailsList;
    }

    @Override
    public void addSongs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
