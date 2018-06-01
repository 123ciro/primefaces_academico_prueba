/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academico.controlador;

import academico.dao.materiasDao;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author oym-dev06
 */
@Controller
public class materiascontrolador {
    
    
    @Autowired
    private materiasDao materiaDao;
    
    @RequestMapping(value="/materia")
    public ModelAndView materiasinsert(HttpServletRequest request) {
        String nombre = request.getParameter("nombre");
        String codigo = request.getParameter("codigo");
        String descripcion = request.getParameter("descripcion");
        
        if (nombre != null)
            
            materiaDao.persist(new Academico.registros.materias(nombre, codigo, descripcion));
        
        
        return new ModelAndView("materias.xhtml","materiasDao",materiaDao);
    }
    
}
