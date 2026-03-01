package app.mirtiza.linkservice.repositories;

import app.mirtiza.linkservice.models.Link;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LinkRepository extends JpaRepository<Link, Long> {
    List<Link> findByUserId(Long userId);
}
