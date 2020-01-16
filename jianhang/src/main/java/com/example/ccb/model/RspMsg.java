package com.example.ccb.model;




public class RspMsg<T> {
    /**
     * 响应吗：业务请求成功
     */
    public static final int CODE_SUCCESS = 1;

    /**
     * 响应码: 服务器异常
     */
    public static final int CODE_ERROR = -1;

    /**
     * 响应吗：无效的输入参数
     */
    public static final int CODE_INVALID_INPUT_PARAM = -2;

    /**
     * 响应吗：无效的参数格式
     */
    public static final int CODE_INVALID_PARAM_PATTERN = -3;

    /**
     * 响应码：需要先登录
     */
    public static final int CODE_NEED_LOGIN = -403;

    // 接口响应码，业务成功时返回code=1，此时才会返回有效的业务数据data；code!=1时即代表业务失败，均会有失败message返回。code= -403，代表需要登录
    private int code = 0;

    // 接口响应消息，一般失败时才返回消息
    private String msg = "";

    // 接口业务数据，业务成功时才会返回有效的业务数据
    private T result;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public void setOK() {
        this.setCode(CODE_SUCCESS);
    }

    public void setError() {
        this.setCode(CODE_ERROR);
    }

    public void setInvalidInputParam(String paramName, Object paramValue) {
        this.setCode(RspMsg.CODE_INVALID_INPUT_PARAM);
        this.setMsg("无效的输入参数：" + paramName + "=" + paramValue);
    }

    public void setInvalidParamPattern(String paramName, String paramValue) {
        this.setCode(RspMsg.CODE_INVALID_PARAM_PATTERN);
        this.setMsg("不合法的参数格式：" + paramName + "=" + paramValue);
    }
}