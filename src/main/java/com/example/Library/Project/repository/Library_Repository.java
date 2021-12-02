package com.example.Library.Project.repository;

import com.example.Library.Project.model.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Library_Repository extends JpaRepository<Library,Integer> {
}
