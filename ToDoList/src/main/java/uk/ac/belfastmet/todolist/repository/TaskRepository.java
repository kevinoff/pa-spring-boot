package uk.ac.belfastmet.todolist.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import uk.ac.belfastmet.todolist.domain.Task;

/**
 * connection to the db
 * Crud (Create, replace, update, delete. from the <Task> table)
 * @author off12066827
 *
 */
@Repository
public interface TaskRepository extends CrudRepository<Task, Long>{

	
}