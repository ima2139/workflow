package com.beegees.workflow.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@ToString
@Entity(name = "form_templates")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class FormTemplate {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long templateId;

    private String name;

    @Column(length = 1000000)
    private String parsedForm;
}
