package vn.com.edu.fit.week01.enums;

public enum Status {
    active(1),
    deactive(0),
    delete(-1);
    private final int value;

    Status (int value){
        this.value=value;
    }
    public int getValue() {
        return value;
    }
}
