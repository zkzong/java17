package org.example.designpattern.strategy.shopping.cache.handler;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.example.designpattern.strategy.shopping.cache.context.CacheInitializationAware;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 热启动
 *
 */
@Slf4j
@Component
public class CacheInitializer {

    @Resource
    private List<CacheInitializationAware> cacheInitializationAwareList;

    /**
     * 加载缓存
     */
    @PostConstruct
    public void load() {
        cacheInitializationAwareList.forEach(CacheInitializationAware::init);
    }

}
