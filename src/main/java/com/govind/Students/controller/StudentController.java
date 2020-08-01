package com.govind.Students.controller;

import com.govind.Students.dto.StudentsDTO;
import com.govind.Students.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    public StudentsService studentsService;

    @RequestMapping(value = "/students", method = RequestMethod.GET,produces = {"application/json"})
    public List<StudentsDTO> getStudents() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return studentsService.findAll();
    }

    @RequestMapping(value = "/students", method = RequestMethod.POST,produces = {"application/json"})
    public StudentsDTO addStudents(@RequestBody StudentsDTO studentsDTO) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return studentsService.addStudents(studentsDTO);
    }

    @RequestMapping(value = "/students", method = RequestMethod.PUT,produces = {"application/json"})
    public StudentsDTO updateStudents(@RequestBody StudentsDTO studentsDTO) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return studentsService.addStudents(studentsDTO);
    }

    @RequestMapping(value = "/students/{studentId}", method = RequestMethod.DELETE,produces = {"application/json"})
    public ResponseEntity<Void> updateStudents(@PathVariable Integer studentId) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if(studentId !=null){
            if(studentsService.deleteStudents(studentId)){
                return new ResponseEntity<Void>(HttpStatus.OK);
            }else{
                return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
            }
        }else{
            return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
        }


    }
}
