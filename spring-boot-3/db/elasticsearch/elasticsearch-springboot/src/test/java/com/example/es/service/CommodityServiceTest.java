package com.example.es.service;

import com.example.es.entity.Commodity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class CommodityServiceTest {

    @Autowired
    private CommodityService commodityService;

    @Test
    public void testCount() {
        System.out.println(commodityService.count());
    }

    @Test
    public void save() {
        Commodity commodity = new Commodity();
        commodity.setSkuId("1501009001");
        commodity.setName("原味切片面包（10片装）");
        commodity.setCategory("101");
        commodity.setPrice(880);
        commodity.setBrand("良品铺子");
        commodityService.save(commodity);

        commodity = new Commodity();
        commodity.setSkuId("1501009002");
        commodity.setName("原味切片面包（6片装）");
        commodity.setCategory("101");
        commodity.setPrice(680);
        commodity.setBrand("良品铺子");
        commodityService.save(commodity);

        commodity = new Commodity();
        commodity.setSkuId("1501009004");
        commodity.setName("元气吐司850g");
        commodity.setCategory("101");
        commodity.setPrice(120);
        commodity.setBrand("百草味");
        commodityService.save(commodity);

    }

    @Test
    public void delete() {
        Commodity commodity = new Commodity();
        commodity.setSkuId("1501009002");
        commodityService.delete(commodity);
    }

    @Test
    public void getAll() {
        Iterable<Commodity> iterable = commodityService.getAll();
        iterable.forEach(e -> System.out.println(e.toString()));
    }

    @Test
    public void findByName() {
        List<Commodity> list = commodityService.findByName("面包");
        System.out.println(list);
    }

    @Test
    public void pageQuery() {
        // todo 未查询出数据
        Page<Commodity> page = commodityService.pageQuery(0, 10, "1501009001");
        System.out.println(page.getTotalPages());
        System.out.println(page.getNumber());
        System.out.println(page.getContent());
    }

    @Test
    public void pageByName() {
        Page<Commodity> page = commodityService.pageByName(1, 1, "面包");
        System.out.println(page.getTotalPages());
        System.out.println(page.getNumber());
        System.out.println(page.getContent());
    }

}