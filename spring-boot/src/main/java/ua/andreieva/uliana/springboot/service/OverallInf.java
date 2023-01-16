package ua.andreieva.uliana.springboot.service;

public class OverallInf {
    public OverallInf(String project,String timestamp,String compilationTime,String result) {
        this.project = project;
        this.timestamp = timestamp;
        this.compilationTime = compilationTime;
        this.result = result;
    }

    private String project;
    private String timestamp;
    private String compilationTime;
    private String result;


    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getCompilationTime() {
        return compilationTime;
    }

    public void setCompilationTime(String compilationTime) {
        this.compilationTime = compilationTime;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
