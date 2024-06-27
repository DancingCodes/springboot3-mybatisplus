package org.example.mooncserve.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("people")
public class People {
    // MyBatis Plus默认id为主键
    private Integer id;
    private String name;
    private Integer age;

    // 无参构造器用于mybatis plus中的某些查询方法
    public People(){}

    public People(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
