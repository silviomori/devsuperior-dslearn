package com.technomori.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.technomori.dslearn.entities.Enrollment;
import com.technomori.dslearn.entities.pk.EnrollmentPK;

public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPK> {

}
