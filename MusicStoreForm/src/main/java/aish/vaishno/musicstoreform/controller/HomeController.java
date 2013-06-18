package aish.vaishno.musicstoreform.controller;

import aish.vaishno.musicstoreform.service.IMusicService;
import aish.vaishno.musicstoreform.transferobject.SongDetails;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;


/**
 *
 * @author Aishu
 */
@Controller
public class HomeController {

    @Autowired
    private IMusicService iMusicService;
    
    @RequestMapping(value="/")
    public ModelAndView homePage(){
        return new ModelAndView("home","songDetForm",new SongDetails());
    }
    
    @RequestMapping(value ="/output", method = RequestMethod.POST)
    public ModelAndView processSongDetails(@ModelAttribute("songDetForm") SongDetails songDetails){
       Map<String,Object> obj=new HashMap<String,Object>();
       obj.put("songDetails",songDetails);
       obj.put("iMusicService", iMusicService);
       ModelAndView modelAndView = new ModelAndView("output", obj);
       return modelAndView;
    }
              
}
