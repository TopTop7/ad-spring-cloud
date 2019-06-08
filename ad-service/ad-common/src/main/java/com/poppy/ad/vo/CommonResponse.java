package com.poppy.ad.vo;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author poppy
 * @Date 2019/6/8 10:52 PM
 **/
@Getter
@Setter

public class CommonResponse<T> implements Serializable {

    private Integer code;
    private String msg;
    private T data;
    public CommonResponse(Integer code,String msg){
        this.code=code;
        this.msg=msg;
    }
}
