
package com.projectManager.projectManager.service;

import java.util.List;

import com.projectManager.projectManager.domain.Parent;
import com.projectManager.projectManager.domain.Project;
import com.projectManager.projectManager.domain.Task;
import com.projectManager.projectManager.domain.User;

/**
 * @author Pankaj Gupta 313983
 *
 */
public interface ProjectManagerService {

	//User Table
	List<User> getUserDetails();
	List<User> getManagerDetails();
	void deleteUserDetails (long id);
	void saveUserDetails (User user);

	//Project Table	
	List<Project> getProjectDetails();
	void saveProjectDetails(Project project);
	void deleteProjectDetails(long project_id);
	/**
	 * @return
	 */
	List<Task> getTaskDetails();
	/**
	 * @return
	 */
	List<Parent> getParentDetails();
	/**
	 * @param parent
	 */
	void saveParentDetails(Parent parent);
	/**
	 * @param task
	 */
	void saveTaskDetails(Task task);
	/**
	 * @return
	 */
	int getProjectCount(Project project);
	
}