package org.springbook.dao;

import org.springbook.models.Comment;

public interface CommentRepository {
    void saveComment(Comment comment);
}
