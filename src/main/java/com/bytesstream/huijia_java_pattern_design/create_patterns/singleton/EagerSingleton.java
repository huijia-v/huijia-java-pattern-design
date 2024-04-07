package com.bytesstream.huijia_java_pattern_design.create_patterns.singleton;

/**
 * 饿汉式
 *
 * @author huijia
 * @date 2024/4/7 13:50
 */
public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    private void EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

}
