package com.brenocidade.springscurity_api.repository;

import com.brenocidade.springscurity_api.entities.Form;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FormRepository extends JpaRepository<Form, Long> {
}
