package com.nestdigital.xyzbackendnewapp.dao;

import com.nestdigital.xyzbackendnewapp.Model.StudentModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentDao extends CrudRepository<StudentModel,Integer> {

    @Modifying
    @Query(value = "DELETE FROM `students` WHERE `id` = :id", nativeQuery = true)
    void deleteById(Integer id);


    @Query(value = "SELECT * FROM `students` WHERE name = :name OR admission_no = :admission_no",nativeQuery = true)
    List<StudentModel> searchStudent(String name,String admission_no);



}
