package org.openmrs.module.smsmodule.api.db;

import java.util.List;

import org.hibernate.SQLQuery;

public interface DAOGeneral {
	
	List slqQuery();
	SQLQuery updateQuery(String query);
	

}
