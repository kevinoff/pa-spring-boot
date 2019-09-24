package uk.ac.belfastmet.todolist.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import uk.ac.belfastmet.todolist.domain.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long>{

	
}