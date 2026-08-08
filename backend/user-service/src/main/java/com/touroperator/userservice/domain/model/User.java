package com.touroperator.userservice.domain.model;

public class User {

    private Long id;
    private String email;
    private String passwordHash;
    private Role role;
    private boolean active;

    public User(String email, String passwordHash, Role role) {
        this.email = email;
        this.passwordHash = passwordHash;
        this.role = role;
        this.active = true;
    }

    public void changeEmail(String email) {
        this.email = email;
    }

    public void changePassword(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public void changeRole(Role role) {
        this.role = role;
    }

    public void activate() {
        this.active = true;
    }

    public void deactivate() {
        this.active = false;
    }

    public boolean isActive() {
        return active;
    }

    public boolean hasRole(Role role) {
        return this.role == role;
    }
}