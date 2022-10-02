package org.springbook.proxy;

import org.springbook.models.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("EMAIL")
public class EmailCommentNotificationProxy implements CommentNotificationProxy{

    @Override
    public void sendNotification(Comment comment) {
        System.out.println("Sending email notification to the author " + comment.getAuthor());
    }
}
