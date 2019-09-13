package com.projectManager.projectManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projectManager.projectManager.domain.Parent;

/**
 * @author Pankaj Gupta 313983
 *
 */
@Repository
public interface ProjectManagerParentRepository extends JpaRepository<Parent, Long> {

	
}
