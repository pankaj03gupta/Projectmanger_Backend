package com.projectManager.projectManager.repository;

import java.util.List;

/*import org.hibernate.annotations.Any; */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projectManager.projectManager.domain.User;

/**
 * @author Pankaj Gupta 313983
 *
 */
@Repository
public interface ProjectManagerRepository extends JpaRepository<User, Long> {
	
	List<User> findByMgrInd(boolean manager);
	
}
