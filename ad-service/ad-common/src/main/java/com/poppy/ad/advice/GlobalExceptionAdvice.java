package com.poppy.ad.advice;

import com.poppy.ad.exception.AdException;
import com.poppy.ad.vo.CommonResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @author poppy
 * @Date 2019/6/8 11:26 PM
 **/
@RestControllerAdvice
public class GlobalExceptionAdvice {
    @ExceptionHandler(AdException.class)
    public CommonResponse<String> adExceptionHandler(HttpServletRequest request, AdException exception){
        CommonResponse<String> response=new CommonResponse<>(-1,"business error");
        response.setData(exception.getMessage());
        return response;
    }
}
