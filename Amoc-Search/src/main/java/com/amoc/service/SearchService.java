package com.amoc.service;

import com.amoc.domain.Student;

/**
 * @Author zhoucx
 * @Description
 * @Date $ $
 **/
public interface SearchService {

    Student getValue(long id);

    void createIndex();

    void saveValue(Student student);

    void deleteById(long id);
}
