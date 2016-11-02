package com.bobo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by Administrator on 2016/9/28.
 */
@Configuration
@Import({AbstractConfig.class,SecondaryConfig.class})
public class ApplicationConfig {

}
