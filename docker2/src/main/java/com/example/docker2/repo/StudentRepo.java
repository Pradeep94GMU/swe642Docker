package com.example.docker2.repo;

import com.example.docker2.model.StudentSurvey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<StudentSurvey, Long> {
}
