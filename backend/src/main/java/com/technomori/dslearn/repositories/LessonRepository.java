package com.technomori.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.technomori.dslearn.entities.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Long> {

}
