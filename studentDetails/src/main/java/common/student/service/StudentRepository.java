package common.student.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import common.student.model.StudentEntity;
@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

}
