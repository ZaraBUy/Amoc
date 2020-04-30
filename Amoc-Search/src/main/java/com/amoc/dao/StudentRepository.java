package com.amoc.dao;

import com.amoc.domain.Student;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author zhoucx
 *
 * 通过继承ElasticsearchRepository, 能继承很多默认方法,  有特殊的方法可以再自定义
 */
public interface StudentRepository extends ElasticsearchRepository<Student,Long> {

}
