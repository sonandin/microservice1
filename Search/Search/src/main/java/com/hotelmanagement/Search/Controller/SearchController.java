package com.hotelmanagement.Search.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotelmanagement.Search.Model.SearchObject;
import com.hotelmanagement.Search.Repository.SearchInterface;

@RestController
@RequestMapping("/search")
public class SearchController {

	@Autowired
    SearchInterface searchinterface;
    
    @GetMapping(path="/show")
    public List<SearchObject> getAllSearchings(){
        return searchinterface.findAll();
    }
    
   @PostMapping(path="/addRoom")
   public String addRoom(@RequestBody SearchObject room) {
	    searchinterface.insert(room);	
	    return room.getId();
	   
    }
    
   @PutMapping(path="/updateRoom")
   public SearchObject updateRoom(@PathVariable("id")String updateroom,@RequestBody SearchObject room ) {
	   room.setId(updateroom);
	   searchinterface.save(room);
	   return room;
   }

   @DeleteMapping(path="/deleteRoom")
	public String deleteRoom(@PathVariable String id) {
	   searchinterface.deleteById(id);
				return "Deleted room " + id ;
	}
}
