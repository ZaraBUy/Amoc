package com.amoc.service;

import com.amoc.dao.StudentRepository;
import com.amoc.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @Author zhoucx
 * @Description
 * @Date $ $
 **/
@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private ElasticsearchRestTemplate elasticsearchRestTemplate;

    @Override
    public Student getValue(long id) {
        Optional<Student> student = studentRepository.findById(id);
        return student.isPresent() ? student.get() : null;
    }

    @Override
    public void createIndex() {
        boolean index = elasticsearchRestTemplate.createIndex(Student.class);
        System.out.println("创建结果----------------->" + index);
    }

    @Override
    public void saveValue(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void deleteById(long id) {
        studentRepository.deleteById(id);
    }


}
