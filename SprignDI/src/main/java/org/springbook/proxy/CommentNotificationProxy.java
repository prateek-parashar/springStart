package org.springbook.proxy;

import org.springbook.models.Comment;

public interface CommentNotificationProxy {
    void sendNotification(Comment comment);
}
