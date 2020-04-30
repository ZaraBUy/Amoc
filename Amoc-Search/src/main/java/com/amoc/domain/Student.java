package com.amoc.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @author zhoucx
 * ES6后, 一个index只能有一个type
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@Document(indexName = "student",type = "student", shards = 1, replicas = 0)
public class Student {

    @Id
    private Long id;

    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String name;

    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String address;

    @Field(type = FieldType.Double)
    private Double score;

    @Field(type = FieldType.Text)
    private String type;

}