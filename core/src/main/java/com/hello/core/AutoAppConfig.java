package com.hello.core;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import static org.springframework.context.annotation.ComponentScan.*;

/*
 * basePakages를 설정하지 않고 설정 정보를 프로젝트 최상단에 위치 시키는 것이 좋은 방법일 수 있다.
 * 이후에 쓰일 @Repository @Controller @Service 등 모두 @component를 가지고 있기 때문에 스캔이 된다.
 */

@Configuration
@ComponentScan(basePackages = "com.hello.core", basePackageClasses = AutoAppConfig.class,
        excludeFilters = @Filter(type = FilterType.ANNOTATION, classes = Configuration.class))
public class AutoAppConfig {



}