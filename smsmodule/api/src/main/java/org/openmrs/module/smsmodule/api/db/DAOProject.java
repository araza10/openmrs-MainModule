package org.openmrs.module.smsmodule.api.db;

import java.io.Serializable;
import java.util.List;

import org.openmrs.module.smsmodule.Project;

public interface DAOProject {

	Project findById(int id);
	
	List<Project> findByCriteria(String projectname);

	List<Project> getAll(int firstResult, int fetchsize);
	
	public Serializable save(Object objectinstance);
	
	public void update(Object objectinstance);
}
