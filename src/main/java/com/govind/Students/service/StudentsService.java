package com.govind.Students.service;

import com.govind.Students.dao.StudentsDao;
import com.govind.Students.dto.StudentsDTO;
import com.govind.Students.entities.StudentsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Persistable;
import org.springframework.stereotype.Service;
import org.apache.commons.beanutils.PropertyUtils;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentsService<T extends Persistable<StudentsEntity>, Integer extends Serializable> {

    @Autowired
    private StudentsDao studentsDao;

    @Transactional
    public List<StudentsDTO> findAll() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        List<StudentsEntity> entities = studentsDao.findAll();
        List<StudentsDTO> studentsDTOS = new ArrayList<>();
        for (StudentsEntity source: entities ) {
            StudentsDTO target= new StudentsDTO();
            PropertyUtils.copyProperties(target , source);
            studentsDTOS.add(target);
        }
        return studentsDTOS;
    }

    @Transactional
    public StudentsDTO addStudents(StudentsDTO studentsDTO) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        StudentsEntity studentsEntity = new StudentsEntity();
        PropertyUtils.copyProperties(studentsEntity,studentsDTO);
        StudentsDTO response = new StudentsDTO();
        PropertyUtils.copyProperties(response,studentsDao.save(studentsEntity));

        return response;
    }

    @Transactional
    public StudentsDTO updateStudents(StudentsDTO studentsDTO) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        StudentsEntity studentsEntity = studentsDao.getOne(studentsDTO.getId());
        PropertyUtils.copyProperties(studentsEntity,studentsDTO);
        StudentsDTO response = new StudentsDTO();
        PropertyUtils.copyProperties(response,studentsDao.save(studentsEntity));

        return response;
    }

    @Transactional
    public boolean deleteStudents(java.lang.Integer studentId) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        studentsDao.deleteById(studentId);
        return true;
    }
}
