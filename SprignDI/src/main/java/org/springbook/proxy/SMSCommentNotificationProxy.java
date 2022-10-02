package org.springbook.proxy;

import org.springbook.models.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SMS")
public class SMSCommentNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendNotification(Comment comment) {
        System.out.println("Sending SMS notification to the author " + comment.getAuthor());

    }
}
