package ru.ubrr.pr.hibernate.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.ubrr.pr.hibernate.domain.Comment;
import ru.ubrr.pr.hibernate.domain.Post;
import ru.ubrr.pr.hibernate.repo.PostRepo;
import org.hibernate.Hibernate;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceDemo {
    private final PostRepo postRepo;

    public void demo() {
        Post postLazy = postRepo.getById(1L);
        System.out.println("Post title: " + postLazy.getTitle());

        boolean isCommentsInitialized = Hibernate.isInitialized(postLazy.getComments());
        System.out.println("Comments initialized: " + isCommentsInitialized);

        List<Comment> commentsLazy = postLazy.getComments();

        if (commentsLazy != null) {
            System.out.println("Количество комментов " + commentsLazy.size());
        }
    }
}
