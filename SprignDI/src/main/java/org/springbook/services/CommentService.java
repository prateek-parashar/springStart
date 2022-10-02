package org.springbook.services;

import org.springbook.dao.CommentRepository;
import org.springbook.models.Comment;
import org.springbook.proxy.CommentNotificationProxy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    public CommentService(CommentRepository commentRepository, @Qualifier("EMAIL") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    private CommentRepository commentRepository;
    private CommentNotificationProxy commentNotificationProxy;

    public void publishComment(Comment comment) {
        saveComment(comment);
        sendNotifiction(comment);
    }

    public void saveComment(Comment comment) {
        commentRepository.saveComment(comment);
    }

    public void sendNotifiction(Comment comment) {
        commentNotificationProxy.sendNotification(comment);
    }
}
