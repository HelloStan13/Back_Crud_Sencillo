package com.crud.kata.repository;
import com.crud.kata.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface ITodoRepository extends CrudRepository<Todo, Long>{
}
