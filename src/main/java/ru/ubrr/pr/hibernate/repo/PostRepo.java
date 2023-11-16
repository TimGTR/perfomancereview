package ru.ubrr.pr.hibernate.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ubrr.pr.hibernate.domain.Post;

public interface PostRepo extends JpaRepository<Post, Long> {
}
