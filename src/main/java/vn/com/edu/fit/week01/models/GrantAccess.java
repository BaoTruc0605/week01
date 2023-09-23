package vn.com.edu.fit.week01.models;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import vn.com.edu.fit.week01.enums.IsGrant;

@Entity
@Table(name = "grant_access")
public class GrantAccess {
    @Id
    @ManyToOne(cascade = {CascadeType.REMOVE, CascadeType.MERGE}, fetch = FetchType.EAGER)
    @JoinColumn(name = "role_id")
    private Role role;
    @Id
    @ManyToOne(cascade = {CascadeType.REMOVE, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id")
    private Account account;

    @Column(name = "is_grant", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private IsGrant isGrant;
    @Column(name = "note", columnDefinition = "varchar(250)")
    private String note;

    public GrantAccess() {

    }

    public GrantAccess(Role role, Account account, IsGrant isGrant, String note) {
        this.role = role;
        this.account = account;
        this.isGrant = isGrant;
        this.note = note;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public IsGrant getIsGrant() {
        return isGrant;
    }

    public void setIsGrant(IsGrant isGrant) {
        this.isGrant = isGrant;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "GrantAccess{" +
                "role=" + role +
                ", account=" + account +
                ", isGrant=" + isGrant +
                ", note='" + note + '\'' +
                '}';
    }
}
