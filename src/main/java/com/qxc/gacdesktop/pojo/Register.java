package com.qxc.gacdesktop.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_register_desktop")
public class Register {
    private int id;
    private String name;
    private String password;
    private String email;
    private String phonenumber;
    private String workspace;
    private String occupation;
    private int status;
    private Date date;
    private String vchat;
    private String message;
}
