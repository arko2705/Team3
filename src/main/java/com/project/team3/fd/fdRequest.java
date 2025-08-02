package com.project.team3.fd;

public class fdRequest {
    private double principal;
    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    private double rate;
    public void setRate(double rate) {
        this.rate = rate;
    }

    private double time;

    public void setTime(double time) {
        this.time = time;
    }

    public double getPrincipal() {
        return principal;
    }

    public double getRate() {
        return rate;
    }

    public double getTime() {
        return time;
    }
}
