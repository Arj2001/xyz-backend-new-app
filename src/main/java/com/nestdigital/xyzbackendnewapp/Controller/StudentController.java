package com.nestdigital.xyzbackendnewapp.Controller;

import com.nestdigital.xyzbackendnewapp.Model.StudentModel;
import com.nestdigital.xyzbackendnewapp.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController

public class StudentController {

    @Autowired
    private StudentDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/studentAdd",consumes = "application/json", produces = "application/json")
    public String studentEntry(@RequestBody StudentModel student){
        System.out.println(student.toString());
        dao.save(student);
        return "{status:'success'}";
    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/studentView")
    public List<StudentModel> studentView(){
        return (List<StudentModel>) dao.findAll();
    }

    @Transactional
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/studentDelete",consumes = "application/json", produces = "application/json")
    public String studentDelete(@RequestBody StudentModel student){
        dao.deleteById(student.getId());
        return "{status:'success'}";
    }


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/searchStudent",consumes = "application/json", produces = "application/json")
    public List<StudentModel> searchStudent(@RequestBody StudentModel student){
        return (List<StudentModel>) dao.searchStudent(student.getName(),student.getAdmission_no());
    }
}
