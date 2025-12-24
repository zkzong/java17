package org.example.designpattern.strategy.shopping.cache.context;

/**
 * 缓存热启动抽象类
 *
 */
public abstract class AbstractCache<K, V> implements CacheInitializationAware {

    /**
     * 获取
     *
     * @param key 键
     * @return 值
     */
    public abstract V get(K key);

    /**
     * 清空
     */
    public abstract void clear();

    /**
     * 重新加载
     */
    public void reload() {
        clear();
        init();
    }

}
