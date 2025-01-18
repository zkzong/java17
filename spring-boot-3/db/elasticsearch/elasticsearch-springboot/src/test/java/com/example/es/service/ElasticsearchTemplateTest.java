package com.example.es.service;

import com.example.es.entity.Commodity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.client.elc.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.core.mapping.IndexCoordinates;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.data.elasticsearch.core.query.IndexQueryBuilder;
import org.springframework.data.elasticsearch.core.query.Query;
import org.springframework.data.elasticsearch.core.query.StringQueryBuilder;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ElasticsearchTemplateTest {

    @Autowired
    public ElasticsearchTemplate elasticsearchTemplate;

    @Test
    public void testInsert() {
        Commodity commodity = new Commodity();
        commodity.setSkuId("1501009005");
        commodity.setName("葡萄吐司面包（10片装）");
        commodity.setCategory("101");
        commodity.setPrice(160);
        commodity.setBrand("良品铺子");

        IndexQuery indexQuery = new IndexQueryBuilder().withObject(commodity).build();
        IndexCoordinates indexCoordinates = IndexCoordinates.of("name");
        elasticsearchTemplate.index(indexQuery, indexCoordinates);
    }

    @Test
    public void testQuery() {
        Query query = new StringQueryBuilder("name").withFields("面包").build();
        SearchHits<Commodity> searchHits = elasticsearchTemplate.search(query, Commodity.class);
        System.out.println(searchHits);
    }

}
