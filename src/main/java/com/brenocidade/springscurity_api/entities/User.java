package com.brenocidade.springscurity_api.entities;


import jakarta.persistence.*;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "user_id")
    private UUID userId;

    @Column(unique = true)
    private String username;

    private String password;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "tb_users_forms",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "form_id")
    )
    private Set<Form> forms;

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Form> getForms() {
        return forms;
    }

    public void setForms(Set<Form> forms) {
        this.forms = forms;
    }

    public enum Values {

        ADMIN(1L),
        BASIC(2L);

        Long formId;

        Values(Long formId) {
            this.formId = formId;
        }

        public Long getFormId() {
            return formId;
        }

        public void setFormId(Long formId) {
            this.formId = formId;
        }
    }
}
