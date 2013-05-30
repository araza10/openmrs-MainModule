package org.openmrs.module.smsmodule.api.db;

import java.util.List;

import org.openmrs.module.smsmodule.Reminder;

public interface DAOReminder {
	
	public List<Reminder> getAllReminders();
	
	public List<Reminder> getReminder(int reminderId);
	
	public List<Reminder> getReminder(String reminderName);
	
	public List<Reminder> getRemindersByName(String reminderName);

}
