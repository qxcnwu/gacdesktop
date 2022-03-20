package com.qxc.gacdesktop.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.Contract;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_login_desktop")
public class Login {
    private int id;
    private String name;
    private String password;
    private Date date;

    @Contract(pure = true)
    public Login(String name, String password){
        this.name=name;
        this.password=password;
    }
}
