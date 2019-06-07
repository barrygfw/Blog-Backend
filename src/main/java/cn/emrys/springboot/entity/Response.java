package cn.emrys.springboot.entity;

public class Response {

    private int status;

    private String msg;

    private Object data;

    public Response() {

    }

    public Response (int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public Response (int status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }

    public Object getData() {
        return data;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
