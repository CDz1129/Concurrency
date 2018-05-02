package com.cdz.concurrency.annoations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author CDz_
 * @create 2018-05-02 11:53
 * 注解 用来标记 是一个线程『安全』的类
 **/
@Target(ElementType.TYPE)//注解时刻使用的范围，范围有：类上、方法上、成员变量上
@Retention(RetentionPolicy.SOURCE)//注解存在的范围，SOURCE在编译时就会被忽略掉
public @interface ThreadSafe {
    String value() default "";
}
