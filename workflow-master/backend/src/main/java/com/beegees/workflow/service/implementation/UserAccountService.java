package com.beegees.workflow.service.implementation;

import com.beegees.workflow.model.UserAccount;
import com.beegees.workflow.repository.UserAccountRepository;
import com.beegees.workflow.service.IUserAccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserAccountService implements IUserAccountService {
    private final UserAccountRepository userAccountRepository;

    @Override
    public void create(UserAccount userAccount) {
        // TODO: preliminary attribute checking
        userAccountRepository.save(userAccount);
    }

    @Override
    public void update(UserAccount userAccount) {
        UserAccount target = userAccountRepository.getOne(userAccount.getUserId());
        // TODO: go through each attribute of userAccount and set target's attributes accordingly
//        if ()
//        target.setEmail(userAccount.getEmail());
        userAccountRepository.save(target);
    }

    @Override
    public UserAccount getById(long id) {
        return userAccountRepository.getOne(id);
    }

    @Override
    public List<UserAccount> getAll() {
        return userAccountRepository.findAll();
    }

    @Override
    public boolean delete(long id) {
        UserAccount target = userAccountRepository.getOne(id);
        if (target != null) {
            userAccountRepository.delete(target);
            return true;
        }
        return false;
    }
}
