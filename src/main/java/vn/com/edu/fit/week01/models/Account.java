package vn.com.edu.fit.week01.models;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import vn.com.edu.fit.week01.enums.Status;
@Entity
@Table(name = "account")
public class Account {
    @Id
    @Column(name = "account_id", nullable = false,columnDefinition = "varchar(50)")
    private String id;
    @Column(name = "full_name", nullable = false,columnDefinition = "varchar(50)")
    private String fullName;
    @Column(name = "password", nullable = false,columnDefinition = "varchar(50)")
    private String password;
    @Column(name = "email",columnDefinition = "varchar(50)")
    private String email;
    @Column(name = "phone",columnDefinition = "varchar(50)")
    private String phone;
    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private Status status;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Account() {
    }

    public Account(String id, String fullName, String password, String email, String phone, Status status) {
        this.id = id;
        this.fullName = fullName;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
