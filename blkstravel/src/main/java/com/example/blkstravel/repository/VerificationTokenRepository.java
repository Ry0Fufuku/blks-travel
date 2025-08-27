package com.example.blkstravel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.blkstravel.entity.VerificationToken;

public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Integer> {
	public VerificationToken findByToken(String token);
}
