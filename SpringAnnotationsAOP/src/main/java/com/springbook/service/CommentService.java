package com.springbook.service;

import com.springbook.config.ToLog;
import com.springbook.model.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {

    Logger logger = Logger.getLogger(CommentService.class.getName());

    public void publishComment(Comment comment) {
        logger.info("Publishing the comment by author " + comment.getAuthor());
    }

    public void editComment(Comment comment) {
        logger.info("Editing the comment by author " + comment.getAuthor());
    }

   @ToLog
    public void deleteComment(Comment comment) {
        logger.info("Deleting the comment by author " + comment.getAuthor());
    }
}
