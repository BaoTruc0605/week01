package vn.com.edu.fit.week01.models;

public class Role {
    private String id;
    private String name;
    private String desciption;
    private String status;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesciption() {
        return desciption;
    }

    public String getStatus() {
        return status;
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

    public void setStatus(String status) {
        this.status = status;
    }

    public Role() {
    }

    public Role(String id, String name, String desciption, String status) {
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
