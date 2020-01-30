package com.beegees.workflow.controller;

import com.beegees.workflow.model.UserAccount;
import com.beegees.workflow.model.network.Registration;
import com.beegees.workflow.service.IUserAccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RequestMapping("/userAccount")
public class UserAccountController {
    private final IUserAccountService userAccountService;

    @GetMapping("{id}")
    public ResponseEntity<UserAccount> getUserAccount(@PathVariable long id) {
        log.info("User wanted to get an UserAccount by ID in UserAccountController::getUserAccount. ");
        UserAccount target = userAccountService.getById(id);
        if (target != null) {
            return ResponseEntity.ok(target);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("create")
    public ResponseEntity<UserAccount> registerAccount(@RequestBody Registration registration) {
        // TODO: additional processing - hash the password - check regex for email, password, username - check name and email lengths
        UserAccount userAccount = registration.toModel();
        userAccountService.create(userAccount);
        return ResponseEntity.ok(userAccount);
    }

}
