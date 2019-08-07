package org.joker.demo3.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-08-07 16:20
 */
@Configuration
//一天失效
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 86400)
public class SessionConfig {
}
