/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academico.dao;

import Academico.registros.materias;
import javax.jdo.annotations.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Component;

/**
 *
 * @author oym-dev06
 */

@Component
public class materiasDao {
 
    @PersistenceContext private EntityManager em;
    
    @Transactional
    public void persist(materias materia){
        
        em.persist(materia);
        
    }
    
            
            
}
