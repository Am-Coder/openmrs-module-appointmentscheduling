package org.openmrs.module.appointment.extension.html;

import org.openmrs.api.context.Context;
import org.openmrs.module.web.extension.PatientDashboardTabExt;

public class PatientDashboardAppointmentTabExt extends PatientDashboardTabExt {
	
	@Override
	public String getPortletUrl() {
		return "appointments.portlet";
	}
	
	@Override
	public String getRequiredPrivilege() {
		return "View Patient Appointment History";
	}
	
	@Override
	public String getTabId() {
		return "Appointments";
	}
	
	@Override
	public String getTabName() {
		return Context.getMessageSourceService().getMessage("appointment.appointmentsTab");
	}
	
}
