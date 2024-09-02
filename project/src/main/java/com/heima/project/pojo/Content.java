package com.heima.project.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Content implements Serializable {

    //主键
    private Long id;
    private Integer userId;
    private String content;

}
