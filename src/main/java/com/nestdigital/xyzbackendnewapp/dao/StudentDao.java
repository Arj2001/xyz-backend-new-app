package com.nestdigital.xyzbackendnewapp.dao;

import com.nestdigital.xyzbackendnewapp.Model.StudentModel;
import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository<StudentModel,Integer> {
}
