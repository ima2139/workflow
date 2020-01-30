package com.beegees.workflow.controller;

import com.beegees.workflow.model.FormTemplate;
import com.beegees.workflow.service.IFormTeplateService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/template")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class FormTemplateController {
    private final IFormTeplateService formTeplateService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<FormTemplate> getTemplate(@PathVariable Long id) {
        log.info("User wanted to get a form template in: FormTemplateController::getTemplate; id: " + id);
        FormTemplate template = formTeplateService.get(id);
        if (template != null) {
            log.info("Form template found: " + template);
            return ResponseEntity.ok(template);
        } else {
            log.error("No form template with the ID: " + id + ", found.");
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping(value = "/all")
    public ResponseEntity<List<FormTemplate>> getAllTemplates() {
        log.info("User wanted to get all the form templates in: FormTemplateController::getAllTemplates;");
        List<FormTemplate> templates = formTeplateService.getAll();
        log.info("Found form templates: " + templates);
        if (!templates.isEmpty()) {
            log.info("Found form templates: " + templates);
            return ResponseEntity.ok(templates);
        } else {
            log.error("No form templates found.");
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping(value = "/create")
    public ResponseEntity<String> createFormTemplate(@RequestBody FormTemplate template) {
        log.info("User wanted to create a new form template in: FormTemplateController::createFormTemplate;");
        formTeplateService.create(template);
        FormTemplate inserted = formTeplateService.get(template.getTemplateId());
        if (inserted != null) {
            log.info("Form template created.");
            return ResponseEntity.ok().build();
        } else {
            log.error("Form template not created successfully.");
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Couldn't create the form template.");
        }
    }

    @PutMapping(value = "/update")
    public ResponseEntity<String> updateFormTemplate(@RequestBody FormTemplate template) {
        log.info("User wanted to update a form template in: FormTemplateController::updateFormTemplate; FormTemplate info: " + template);
        if (template.getTemplateId() <= 0) {
            log.error("Invalid template id provided.");
            return ResponseEntity.badRequest().body("Invalid template id provided.");
        }
        formTeplateService.update(template);
        log.info("Color updated.");
        return ResponseEntity.ok().build();
    }

}
