package ru.ubrr.pr.hibernate.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
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

    @Transactional
    public void demo() throws InterruptedException {
        Post postLazy = postRepo.findById(1L).orElseThrow();
        System.out.println("Post title: " + postLazy.getTitle());

        boolean isCommentsInitialized = Hibernate.isInitialized(postLazy.getComments());
        System.out.println("Comments initialized: " + isCommentsInitialized);
        List<Comment> commentsLazy = postLazy.getComments();

        if (commentsLazy != null) {
            System.out.println("Количество комментов " + commentsLazy.size());
        }
    }

}