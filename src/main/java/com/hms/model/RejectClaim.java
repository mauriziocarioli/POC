package com.hms.model;


public class RejectClaim implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    public RejectClaim() {}

    private String Job;
    private String JobName;
    private String EditCode;
    private String Reason;
    private String External;
    private String Internal;
    private String FinalDetermination;
    private String Owner;
    private String Product;

    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        Job = job;
    }

    public String getJobName() {
        return JobName;
    }

    public void setJobName(String jobName) {
        JobName = jobName;
    }

    public String getEditCode() {
        return EditCode;
    }

    public void setEditCode(String editCode) {
        EditCode = editCode;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String reason) {
        Reason = reason;
    }

    public String getExternal() {
        return External;
    }

    public void setExternal(String external) {
        External = external;
    }

    public String getInternal() {
        return Internal;
    }

    public void setInternal(String internal) {
        Internal = internal;
    }

    public String getFinalDetermination() {
        return FinalDetermination;
    }

    public void setFinalDetermination(String finalDetermination) {
        FinalDetermination = finalDetermination;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }

    public String getProduct() {
        return Product;
    }

    public void setProduct(String product) {
        Product = product;
    }

}
