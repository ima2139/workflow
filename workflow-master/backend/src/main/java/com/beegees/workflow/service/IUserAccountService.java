package com.beegees.workflow.service;

import com.beegees.workflow.model.UserAccount;

import java.util.List;

public interface IUserAccountService {
    void create(UserAccount userAccount);
    void update(UserAccount userAccount);
    UserAccount getById(long id);
    List<UserAccount> getAll();
    boolean delete(long id);
}
