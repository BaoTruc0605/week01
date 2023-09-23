package vn.com.edu.fit.week01.models;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;

@Entity
@Table(name="log")
public class Logs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "bigint(20)", nullable = false)
    private long id;

    @Column(name = "account_id", nullable = false,columnDefinition = "varchar(50)")
    private String accountId;
    @Column(name = "login_time", nullable = false,columnDefinition = "DATETIME")
    @ColumnDefault("current_timestamp()")
    private LocalDateTime loginTime;
    @Column(name = "logout_time", nullable = false,columnDefinition = "DATETIME")
    @ColumnDefault("current_timestamp()")
    private LocalDateTime logoutTime;
    @Column(columnDefinition = "varchar(250)", nullable = false)
    private String notes;

    public Logs() {
    }

    public Logs(long id, String accountId, LocalDateTime loginTime, LocalDateTime logoutTime, String notes) {
        this.id = id;
        this.accountId = accountId;
        this.loginTime = loginTime;
        this.logoutTime = logoutTime;
        this.notes = notes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public LocalDateTime getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(LocalDateTime loginTime) {
        this.loginTime = loginTime;
    }

    public LocalDateTime getLogoutTime() {
        return logoutTime;
    }

    public void setLogoutTime(LocalDateTime logoutTime) {
        this.logoutTime = logoutTime;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
