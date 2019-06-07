package cn.emrys.springboot.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class User {
    /**
     * 用户id
     */
    private int id;
    /**
     * 用户名
     */
    @NotEmpty(message = "用户名不能为空")
    private String user_name;
    /**
     * 密码
     */
    @NotEmpty(message = "密码不能为空")
    private String password;
    /**
     * 邮箱
     */
    @Email(message = "邮箱格式不正确")
    private String email;

    private int login_last_time;

    private int login_times;

    public void setId(int id) {
        this.id = id;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public int getLogin_times() {
        return login_times;
    }

    public void setLogin_times(int login_times) {
        this.login_times = login_times;
    }
}
