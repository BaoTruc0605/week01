package vn.com.edu.fit.week01.models;

import vn.com.edu.fit.week01.enums.IsGrant;

public class GrantAccess {
    private String accountId;
    private String roleId;
    private IsGrant isGrant;
    private String note;

    public GrantAccess() {

    }

    public GrantAccess(String accountId, String roleId, IsGrant isGrant, String note) {
        this.accountId = accountId;
        this.roleId = roleId;
        this.isGrant = isGrant;
        this.note = note;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public IsGrant isGrant() {
        return isGrant;
    }

    public void setGrant(IsGrant grant) {
        isGrant = grant;
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
                "accountId='" + accountId + '\'' +
                ", roleId='" + roleId + '\'' +
                ", isGrant=" + isGrant +
                ", note='" + note + '\'' +
                '}';
    }
}
