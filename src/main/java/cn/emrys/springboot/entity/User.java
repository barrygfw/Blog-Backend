package cn.emrys.springboot.entity;

public class User {
    /**
     * 用户id
     */
    private int id;
    /**
     * 用户名
     */
    private String user_name;
    /**
     * 密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String email;

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
}
