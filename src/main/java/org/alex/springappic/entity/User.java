package org.alex.springappic.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "USERS")
@Getter
@Setter
public class User {

    @Id
    @Column(name = "_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "user_name", length = 100, nullable = false)
    private String userName;
    @Column(name = "password", length = 512, nullable = false)
    private String password;
    @Column(name = "email", length = 100, nullable = false)
    private String email;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "role_id")
    private Role role;
    @Column(name = "full_name", length = 100)
    private String fullName;
}
