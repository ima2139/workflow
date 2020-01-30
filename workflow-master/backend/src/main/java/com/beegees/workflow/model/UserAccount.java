package com.beegees.workflow.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "user_accounts")
public class UserAccount {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long userId;
    @Column(length = 45)
    private String name;
    @Column(length = 45)
    private String email;
    @Column(length = 45)
    private String password;
}
