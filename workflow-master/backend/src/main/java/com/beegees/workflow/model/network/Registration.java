package com.beegees.workflow.model.network;

import com.beegees.workflow.model.UserAccount;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Registration {
    private String name;
    private String email;
    private String password;

    public UserAccount toModel() {
        return new UserAccount(0, name, email, password);
    }
}
