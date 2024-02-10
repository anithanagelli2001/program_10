package com.example.todo;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.todo.TodoService;
import com.example.todo.Todo;
/*
 * You can use the following import statements
 * 
 * 
 * 
 */

// Write your code here.
@RestController
public class TodoController {
    TodoService todoService = new TodoService();

    @DeleteMapping("/todos/{id}")
    public void deleteTodo(@PathVariable int id) {
        todoService.deleteTodo(id);
    }

    @PutMapping("/todos/{id}")
    public Todo updateTodo(@PathVariable("id") int id, @RequestBody Todo todo) {
        return todoService.updateTodo(id, todo);
    }

    @PostMapping("/todos")
    public Todo addTodo(@RequestBody Todo todo) {
        return todoService.addTodo(todo);
    }

    @GetMapping("/todos")
    public ArrayList<Todo> getTodos() {
        return todoService.getTodos();
    }

    @GetMapping("/todos/{id}")
    public Todo getByid(@PathVariable("id") int id) {
        return todoService.getByid(id);
    }
}