package io.usnack.wordofyum.domain.chat;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatNotificationRepository extends JpaRepository<ChatNotification, Long> {
}