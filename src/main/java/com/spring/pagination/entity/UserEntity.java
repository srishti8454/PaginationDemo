package com.spring.pagination.entity;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@RequiredArgsConstructor
@Getter
@Setter
@Entity(name = "user")
public class UserEntity {
    @Id
    String user;
    String username;
    String password;




}
