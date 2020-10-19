package com.hbg.hambergsen.interceptor;

import com.hbg.hambergsen.bean.ResponseBean;
import com.hbg.hambergsen.constant.ParamConstant;
import com.hbg.hambergsen.constant.annotation.ResponseResult;
import com.hbg.hambergsen.constant.eneums.ResultEnum;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import javax.servlet.http.HttpServletRequest;

@Log4j2
@ControllerAdvice
public class ResponseResultHandler implements ResponseBodyAdvice<Object> {
    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        // 判断请求中是否包含注解标记
        ResponseResult attribute = (ResponseResult) request.getAttribute(ParamConstant.RESPONSE_RESULT_ANN);
        return attribute == null ? false : true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        if (body instanceof ResponseBean){
            ResponseBean result = (ResponseBean) body;
            return result;
        }
        return ResponseBean.success(body);
    }
}
