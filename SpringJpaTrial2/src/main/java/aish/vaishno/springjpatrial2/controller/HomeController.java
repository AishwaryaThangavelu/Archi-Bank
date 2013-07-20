package aish.vaishno.springjpatrial2.controller;

import aish.vaishno.springjpatrial2.dao.IMusicStoreDao;
import aish.vaishno.springjpatrial2.pojo.MusicDetails;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

      @Autowired
    private IMusicStoreDao musicStoreDao;
      
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home","musicStoreList",musicStoreDao.getMusicList());
	}
        
        @RequestMapping("JPASongList/")
        @ResponseBody
        public List<MusicDetails> getSongList(){
            return musicStoreDao.getMusicList();
        }
}
