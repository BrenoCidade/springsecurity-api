package com.brenocidade.springscurity_api.repository;

import com.brenocidade.springscurity_api.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
}
