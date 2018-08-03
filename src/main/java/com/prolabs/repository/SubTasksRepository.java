package com.prolabs.repository;

import com.prolabs.domain.SubTasks;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the SubTasks entity.
 */
@SuppressWarnings("unused")
@Repository
public interface SubTasksRepository extends JpaRepository<SubTasks, Long> {

}
