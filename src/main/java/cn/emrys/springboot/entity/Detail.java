package cn.emrys.springboot.entity;

public class Detail {
    /**
     * 文章id
     */
    private int id;

    /**
     * 文章所属分类id
     */
    private int pid;

    /**
     * 文章作者id
     */
    private int uid;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章简介
     */
    private String introduce;

    /**
     * 文章内容
     */
    private String content;

    /**
     * 发布时间
     */
    private String create_time;

    /**
     * 更新时间
     */
    private String update_time;

    public int getId() {
        return id;
    }

    public int getPid() {
        return pid;
    }

    public int getUid() {
        return uid;
    }

    public String getTitle() {
        return title;
    }

    public String getIntroduce() {
        return introduce;
    }

    public String getContent() {
        return content;
    }

    public String getCreate_time() {
        return create_time;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }
}
