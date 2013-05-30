package org.openmrs.module.smsmodule.api.db;

import java.io.Serializable;
import java.util.List;

import org.openmrs.module.smsmodule.DataException;


public interface DAODevice {

	org.openmrs.module.smsmodule.Device findById(int id);
	
	List<org.openmrs.module.smsmodule.Device> findByCriteria(String imei, org.openmrs.module.smsmodule.Device.DeviceStatus status , boolean notStatus, String projectName , String sim) throws DataException;

	List<org.openmrs.module.smsmodule.Device> getAll(int firstResult, int fetchsize);
	
	public Serializable save(Object objectinstance);
	
	public void update(Object objectinstance);

}
