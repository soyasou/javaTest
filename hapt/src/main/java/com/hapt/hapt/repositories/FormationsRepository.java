package com.hapt.hapt.repositories;

import com.hapt.hapt.models.Formations;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormationsRepository extends JpaRepository<Formations, Long> {

}
