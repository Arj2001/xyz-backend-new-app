package com.nestdigital.xyzbackendnewapp.dao;

import com.nestdigital.xyzbackendnewapp.Model.FacultyModel;
import com.nestdigital.xyzbackendnewapp.Model.StudentModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FacutltyDao extends CrudRepository<FacultyModel,Integer> {

    @Modifying
    @Query(value = "Delete from faculties where id = :id",nativeQuery = true)
    void deleteById(Integer id);

    @Query(value = "SELECT * FROM faculties WHERE name = :name",nativeQuery = true)
    List<FacultyModel> searchFaculty(String name);
}
