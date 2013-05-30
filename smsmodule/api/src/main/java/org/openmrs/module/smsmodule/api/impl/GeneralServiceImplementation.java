package org.openmrs.module.smsmodule.api.impl;

import java.util.List;

import org.hibernate.SQLQuery;
import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.smsmodule.api.GeneralService;
import org.openmrs.module.smsmodule.api.db.DAODevice;
import org.openmrs.module.smsmodule.api.db.DAOGeneral;

public class GeneralServiceImplementation extends BaseOpenmrsService implements GeneralService {
	
	private DAOGeneral daogeneral;

	@Override
	public List slqQuery() {
		
		return daogeneral.slqQuery();
	}
	
	public void setDaogeneral(DAOGeneral daogeneral) {
    	this.daogeneral = daogeneral;
    }

	@Override
	public SQLQuery update(String query) {
		return daogeneral.updateQuery(query);
		
	}

}
