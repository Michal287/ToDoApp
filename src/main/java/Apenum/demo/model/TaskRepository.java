package Apenum.demo.model;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface TaskRepository {
    List<Task> findAll();

    Page<Task> findAll(Pageable page);

    Optional<Task> findById(int id);

    boolean existsById(int id);

    Task save(Task entity);

    List<Task> findByDone(boolean done);
}
