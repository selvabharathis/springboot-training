package com.product.rec.config;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.product.rec.controller.ProductController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
@Component
public class LoggingInterceptor implements HandlerInterceptor {

    Logger logger = LogManager.getLogger(ProductController.class);

    // Pre-handle method: called before the controller method is invoked
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("Pre Handle method: Request URL - " + request.getRequestURL());
        return true; // Return true to let the request proceed to the controller
    }

    // Post-handle method: called after the controller method is invoked but before the view is generated
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, org.springframework.web.servlet.ModelAndView modelAndView) throws Exception {
        logger.info("Post Handle method: Request URL - " + request.getRequestURL());
    }

    // After completion method: called after the view is generated and the request is fully processed
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception exception) throws Exception {
        logger.info("After Completion method: Request URL - " + request.getRequestURL());
    }
}
