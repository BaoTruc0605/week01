package vn.com.edu.fit.week01.models;

import vn.com.edu.fit.week01.enums.Status;

public class Role {
    private String id;
    private String name;
    private String desciption;
    private Status status;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesciption() {
        return desciption;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }



    public Role() {
    }

    public Role(String id, String name, String desciption, Status status) {
        this.id = id;
        this.name = name;
        this.desciption = desciption;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", desciption='" + desciption + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}


