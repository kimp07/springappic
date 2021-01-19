package org.alex.springappic.restmodels;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class RoleData {

    private Integer id;
    private String roleName;
    private boolean roleDisabled;
}
