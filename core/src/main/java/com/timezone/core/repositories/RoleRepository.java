package com.timezone.core.repositories;

import com.timezone.core.entity.Role;
import com.timezone.core.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
