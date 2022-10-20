package com.nestdigital.xyzbackendnewapp.Controller;

import com.nestdigital.xyzbackendnewapp.Model.FacultyModel;
import com.nestdigital.xyzbackendnewapp.dao.FacutltyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FacultyController {

    @Autowired
    private FacutltyDao dao;

    @CrossOrigin(origins = "*")
    @GetMapping("/facultyView")
    public List<FacultyModel> facultyView(){
        return (List<FacultyModel>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/facultyAdd",consumes = "application/json",produces = "application/json")
    public String facultyAdd(@RequestBody FacultyModel faculty){
        dao.save(faculty);
        return "success";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/facultyDelete",consumes = "application/json",produces = "application/json")
    public String facultyDelete(@RequestBody FacultyModel faculty){
        dao.deleteById(faculty.getId());
        return "success";
    }


}
