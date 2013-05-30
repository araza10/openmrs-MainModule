package org.openmrs.module.smsmodule.api;


import java.util.List;


import org.openmrs.api.OpenmrsService;
import org.openmrs.module.smsmodule.DataException;
import org.openmrs.module.smsmodule.Device;
import org.openmrs.module.smsmodule.Device.DeviceStatus;
import org.openmrs.module.smsmodule.OutboundMessage.PeriodType;
import org.openmrs.module.smsmodule.OutboundMessage.Priority;
import org.openmrs.module.smsmodule.Project;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface DeviceService extends OpenmrsService {
	
org.openmrs.module.smsmodule.Device findDeviceById(int id);
	
	List<org.openmrs.module.smsmodule.Device> findDevice(String imei, DeviceStatus status, boolean notStatus , String projectName , String sim) throws DataException;

	List<org.openmrs.module.smsmodule.Device> getAllDevices(int firstResult, int fetchsize);
	
	void saveDevice(Device device);
	
	void updateDevice(Device device);
	
	Project findProjectById(int id);
	
	List<Project> findProject(String projectname);

	List<Project> getAllProjects(int firstResult, int fetchsize);
	
	void saveProject(Project project);
	
	void updateProject(Project project);

}
