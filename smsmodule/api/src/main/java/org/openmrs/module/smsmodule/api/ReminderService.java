package org.openmrs.module.smsmodule.api;

import java.util.List;

import org.openmrs.module.smsmodule.Reminder;

public interface ReminderService {

	
	public List<Reminder> getAllReminders();
	public Reminder getReminder(int reminderId);
	public Reminder getReminder(String reminderName);
	public List<Reminder> getRemindersByName(String reminderName);


}
