package com.sauzn.cloudboard.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Result implements Serializable {

    private static final long serialVersionUID = 2267751680865696851L;

    /**是否成功**/
    private Boolean success = false ;
    /**返回消息**/
    private String message;
    /**返回数据**/
    private Object data;
}
