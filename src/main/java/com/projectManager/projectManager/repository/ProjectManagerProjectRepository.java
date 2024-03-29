package com.projectManager.projectManager.repository;

/*import java.util.List; */

/*import org.hibernate.annotations.Any;*/
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projectManager.projectManager.domain.Project;

/**
 * @author Pankaj Gupta 313983
 *
 */
@Repository
public interface ProjectManagerProjectRepository extends JpaRepository<Project, Long> {

	
}
