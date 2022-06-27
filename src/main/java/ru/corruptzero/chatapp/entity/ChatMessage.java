package ru.corruptzero.chatapp.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatMessage {
    private String content;
    private String sender;
    private MessageType type;
}

