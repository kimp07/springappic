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
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "role_generator")
    @TableGenerator(name = "role_generator", table = "id_generator", initialValue = 0)
    private Integer id;
    @Column(name = "role_name", length = 30, nullable = false)
    private String roleName;
    @OneToMany(mappedBy = "role", fetch = FetchType.LAZY)
    private List<User> users;
    @Column(name = "role_disabled")
    private boolean roleDisabled;
}
