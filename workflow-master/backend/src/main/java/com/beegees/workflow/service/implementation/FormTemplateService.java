package com.beegees.workflow.service.implementation;

import com.beegees.workflow.model.FormTemplate;
import com.beegees.workflow.repository.FormTemplateRepository;
import com.beegees.workflow.service.IFormTeplateService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class FormTemplateService implements IFormTeplateService {
    private final FormTemplateRepository formTemplateRepository;

    @Override
    public void create(FormTemplate formTemplate) {
        if (formTemplate.getName() != null && formTemplate.getParsedForm() != null) {
            formTemplateRepository.save(formTemplate);
        }
    }

    @Override
    public void update(FormTemplate formTemplate) {
        FormTemplate target = get(formTemplate.getTemplateId());
        if (target != null) {
            if (formTemplate.getName() != null) {
                target.setName(formTemplate.getName());
            }
            if (formTemplate.getParsedForm() != null) {
                target.setParsedForm(formTemplate.getParsedForm());
            }
            formTemplateRepository.save(target);
        }
    }

    @Override
    public FormTemplate get(long id) {
        return formTemplateRepository.getOne(id);
    }

    @Override
    public List<FormTemplate> getAll() {
        return formTemplateRepository.findAll();
    }

    @Override
    public boolean delete(long id) {
        FormTemplate target = get(id);
        if (target != null) {
            formTemplateRepository.delete(target);
            return true;
        }
        return false;
    }
}
