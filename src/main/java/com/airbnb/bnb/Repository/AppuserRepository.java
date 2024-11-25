package com.airbnb.bnb.Repository;

import com.airbnb.bnb.entity.Appuser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AppuserRepository extends JpaRepository<Appuser, Long> {
 Optional<Appuser> findByEmail(String email);
}