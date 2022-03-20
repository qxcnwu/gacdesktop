package com.qxc.gacdesktop.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_funcuse_desktop")
public class Funcuse {
    private int id;
    private String name;
    private String password;
    private String funcname;
    private Date date;
    private String message;
}
