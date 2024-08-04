package io.usnack.wordofyum.domain.chat;

import io.usnack.wordofyum.domain.user.User;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "chat_notifications")
public class ChatNotification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "chat_room_id", nullable = false)
    private ChatRoom chatRoom;

    private Long lastSeenMessageId;

    public ChatNotification() {
        this.lastSeenMessageId = 0L; // 초기 알림 수는 0
    }
}
