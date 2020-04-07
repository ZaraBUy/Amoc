package com.amoc.service;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author zhoucx
 * @Description
 * @Date $ $
 **/
@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    private RestHighLevelClient client;


    @Override
    public void getValue(String name) {

    }
}
