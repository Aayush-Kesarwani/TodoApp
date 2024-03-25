package com.example.springboot3todoapplication.repositories;

import com.example.springboot3todoapplication.models.TodoItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoItemRepository extends MongoRepository<TodoItem, String> {
}
