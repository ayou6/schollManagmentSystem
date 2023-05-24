package com.example.schoolManagementSystem.Repository;

import com.example.schoolManagementSystem.Model.ClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepository extends JpaRepository<ClassRoom, Long> {
}
