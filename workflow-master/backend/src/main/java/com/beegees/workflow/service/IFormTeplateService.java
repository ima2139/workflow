package com.beegees.workflow.service;

import com.beegees.workflow.model.FormTemplate;

import java.util.List;

public interface IFormTeplateService {
    void create(FormTemplate formTemplate);
    void update(FormTemplate formTemplate);
    FormTemplate get(long id);
    List<FormTemplate> getAll();
    boolean delete(long id);
}
