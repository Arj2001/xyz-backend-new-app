package com.nestdigital.xyzbackendnewapp.dao;

import com.nestdigital.xyzbackendnewapp.Model.FacultyModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface FacutltyDao extends CrudRepository<FacultyModel,Integer> {

    @Modifying
    @Query(value = "Delete from faculties where id = :id",nativeQuery = true)
    void deleteById(Integer id);
}
