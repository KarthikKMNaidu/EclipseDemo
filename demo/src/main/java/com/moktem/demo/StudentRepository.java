package com.moktem.demo;

import org.springframework.data.repository.CrudRepository;
import com.moktem.demo.model.Student;


public interface StudentRepository extends CrudRepository<Student, Integer>{

}
