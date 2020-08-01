package com.govind.Students.dao;

import com.govind.Students.entities.StudentsEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsDao extends BaseDao<StudentsEntity,Integer>{
}
