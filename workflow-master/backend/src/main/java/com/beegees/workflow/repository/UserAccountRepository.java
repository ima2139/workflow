package com.beegees.workflow.repository;

import com.beegees.workflow.model.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {
    UserAccount findByName(String name);
}
