package com.example.Library.Project.service;

import com.example.Library.Project.model.Library;
import com.example.Library.Project.repository.Library_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Optional;

@Service
public class Library_Service {

    @Autowired
    private Library_Repository repository;

    public void addbook(Library library){
        repository.save(library);
    }

    public List<Library> getbook(){
        return repository.findAll();
    }

    public Library getbyid(int id){
        Optional<Library> book=repository.findById(id);
        if(book.isPresent()){
            return book.get();
        }
        return null;
    }

    public void deletebook(int id){
        repository.deleteById(id);
    }
}
