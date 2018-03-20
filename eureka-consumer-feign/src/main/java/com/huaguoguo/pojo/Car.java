package com.huaguoguo.pojo;

public class Car {

    private Long type;

    private String carNo;

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type=" + type +
                ", carNo='" + carNo + '\'' +
                '}';
    }
}
