package com.wind.common.common.user;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Interceptor配置
 *
 * @author kfg
 * @date 2023/6/4 23:00
 */
//@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    // TOKEN交给shiro验证
//    @Autowired
//    private TokenInterceptor tokenInterceptor;

//    @Autowired
//    private InfoCollectInterceptor infoCollectInterceptor;
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
////        registry.addInterceptor(tokenInterceptor)
////                .addPathPatterns("/**");
//        registry.addInterceptor(infoCollectInterceptor)
//                .addPathPatterns("/**");
//    }
}
