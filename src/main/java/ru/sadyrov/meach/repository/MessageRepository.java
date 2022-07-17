package ru.sadyrov.meach.repository;

import  org.springframework.data.jpa.repository.JpaRepository;
import ru.sadyrov.meach.domain.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
