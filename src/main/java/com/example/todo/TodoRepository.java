// Write your code here
package com.example.todo;

import java.util.*;
import com.example.todo.Todo;

public interface TodoRepository {
    ArrayList<Todo> getTodos();

    Todo getByid(int id);

    Todo addTodo(Todo todo);

    Todo updateTodo(int id, Todo todo);

    void deleteTodo(int id);
}