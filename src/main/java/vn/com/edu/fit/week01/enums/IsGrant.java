package vn.com.edu.fit.week01.enums;

public enum IsGrant {
    diasable(0),
    enable(1);
    private int value;
    IsGrant(int value){
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
