package com.hms.model;


public class HITSERVICECALL implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    public HITSERVICECALL() {
    }

    private String HIT_EDIT_CODE;
    private String HIT_EDIT_RESULT;

    public String getHIT_EDIT_CODE() {
        return HIT_EDIT_CODE;
    }

    public void setHIT_EDIT_CODE(String HIT_EDIT_CODE) {
        this.HIT_EDIT_CODE = HIT_EDIT_CODE;
    }

    public String getHIT_EDIT_RESULT() {
        return HIT_EDIT_RESULT;
    }

    public void setHIT_EDIT_RESULT(String HIT_EDIT_RESULT) {
        this.HIT_EDIT_RESULT = HIT_EDIT_RESULT;
    }
}
