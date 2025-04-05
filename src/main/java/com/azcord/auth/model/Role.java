package com.azcord.auth.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue
    private UUID roleId;

    @Column(nullable = false)
    private String roleName;

    private String color;

    @Column(columnDefinition = "json")
    private String permissions;

    // Getters and Setters
    public UUID getRoleId() { return roleId; }
    public void setRoleId(UUID roleId) { this.roleId = roleId; }

    public String getRoleName() { return roleName; }
    public void setRoleName(String roleName) { this.roleName = roleName; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getPermissions() { return permissions; }
    public void setPermissions(String permissions) { this.permissions = permissions; }
}
