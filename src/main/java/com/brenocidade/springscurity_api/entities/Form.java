package com.brenocidade.springscurity_api.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "tb_form")
public class Form {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "form_id")
    private Long formId;

    private String name;

    public Long getFormId() {
        return formId;
    }

    public void setFormId(Long formId) {
        this.formId = formId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
