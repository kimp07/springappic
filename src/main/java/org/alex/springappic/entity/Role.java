package org.alex.springappic.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ROLES")
@Getter
@Setter
public class Role {

    @Id
    @Column(name = "_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "role_name", length = 30, nullable = false)
    private String roleName;
    @OneToMany(mappedBy = "role", fetch = FetchType.LAZY)
    private List<User> users;
}
