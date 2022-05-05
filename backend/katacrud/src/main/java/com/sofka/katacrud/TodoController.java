package com.sofka.katacrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TodoController {
    @Autowired
    private TodoService todoService;

    @GetMapping(value="api/list")
    public  Iterable<Todo> list(){
        return todoService.list();
    }

    @PostMapping(value="api/list")
    public  Todo save(@RequestBody Todo todo){
        return todoService.save(todo);
    }
    @PutMapping(value="api/list")
    public  Todo update(@RequestBody Todo todo){
        if(todo.getId()!=null) {
            return todoService.save(todo);
        }
        throw new RuntimeException("no existe el id para actualizar");
    }

    @DeleteMapping(value="api/{id}/todo")
    public  void delete(@PathVariable Long id){
        todoService.delete(id);
    }


    @GetMapping(value="api/{id}/todo")
    public  Todo list(@PathVariable Long id){
        return todoService.get(id);
    }



}
