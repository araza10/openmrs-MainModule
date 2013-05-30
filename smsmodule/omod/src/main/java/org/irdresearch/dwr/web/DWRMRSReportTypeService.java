package org.irdresearch.dwr.web;

import java.util.ArrayList;
import java.util.List;
import org.openmrs.api.context.Context;
import org.openmrs.module.smsmodule.InboundMessage;
import org.openmrs.module.smsmodule.OutboundMessage;
import org.openmrs.module.smsmodule.api.SmsModuleService;
import org.springframework.beans.support.PagedListHolder;
public class DWRMRSReportTypeService {

	
	public List<OutboundMessage> getMessageByName(String patientID)
	{
		
		List<OutboundMessage> patientList = null;
		try
		{
		
		
		patientList = new  ArrayList<OutboundMessage>();
		
		SmsModuleService smsService = Context.getService(SmsModuleService.class);
		patientList = smsService.findByPatientID(patientID);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		return patientList;
	}

}
