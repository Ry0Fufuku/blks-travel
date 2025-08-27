package com.example.blkstravel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.blkstravel.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	public Role findByName(String name);
}
