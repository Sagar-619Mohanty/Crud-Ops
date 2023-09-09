package com.xadmin.SpringBootCrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.xadmin.SpringBootCrud.bean.Subject;
import com.xadmin.SpringBootCrud.repository.SubjectRepository;

public class SubjectService {
	@Autowired
    public SubjectRepository subjectRepo;
    public List<Subject> getAllSubjects(){
        List<Subject> subjects = new ArrayList<>();
        subjectRepo.findAll().forEach(subjects::add);
        return subjects;
    }
    public void addSubject(Subject subject) {
        subjectRepo.save(subject);
    }
    public void updateSubject(int id ,Subject subject) {
        subjectRepo.save(subject);
    }

    public void deleteSubject(int id) {
        subjectRepo.deleteById(String.valueOf(id));
    }
}
