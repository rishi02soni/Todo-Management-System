package com.example.todo.service;

import com.example.todo.model.Todo;
import com.example.todo.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private final TodoRepository repository;

    public TodoService(TodoRepository repository) {
        this.repository = repository;
    }

    public Todo create(Todo todo) {
        return repository.save(todo);
    }

    public List<Todo> getAll() {
        return repository.findAll();
    }

    public Todo getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<Todo> search(String keyword) {
        return repository.findByTitleContaining(keyword);
    }

    public List<Todo> getByStatus(boolean completed) {
        return repository.findByCompleted(completed);
    }

    public Todo update(Long id, Todo todo) {
        Todo existing = repository.findById(id).orElse(null);
        if (existing == null) return null;

        existing.setTitle(todo.getTitle());
        existing.setDescription(todo.getDescription());
        existing.setCompleted(todo.isCompleted());

        return repository.save(existing);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
