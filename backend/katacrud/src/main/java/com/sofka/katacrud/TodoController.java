package com.sofka.katacrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TodoController {
    @Autowired
    private TodoService todoService;

    @GetMapping(value="api/todos")
    public  Iterable<Todo> list(){
        return todoService.list();
    }

    @PostMapping(value="api/todo")
    public  Todo save(@RequestBody Todo todo){
        return todoService.save(todo);
    }
    @PutMapping(value="api/todo")
    public  Todo update(@RequestBody Todo todo){
        if(todo.getId()!=null) {
            return todoService.save(todo);
        }
        throw new RuntimeException("no existe el id para actualizar");
    }

    @DeleteMapping(value="api/{id}/todo")
    public  void delete(@PathVariable("id") Long id){
        todoService.delete(id);
    }


    @GetMapping(value="api/{id}/todo")
    public  Todo list(@PathVariable("id") Long id){
        return todoService.get(id);
    }



}
