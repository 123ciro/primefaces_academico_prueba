/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Academico.registros;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author oym-dev06
 */
public class guardarMaterias {
    
    public static void main( String[ ] args ) 
   {
      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "AcademicoPU" );
      EntityManager entitymanager = emfactory.createEntityManager( );
      
      
      entitymanager.getTransaction( ).begin( );
              
              
              
              }
    
    
}
