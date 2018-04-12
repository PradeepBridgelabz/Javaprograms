package Bridgelabz.ClinicManagement;

import java.sql.Date;
import java.time.LocalDate;

public class Appointment {
private String doctorName;
private String patientName;
private int doctorId;
private int patientId;
private LocalDate date;
private String docterAvalability;
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate localDate) {
	this.date =  localDate;
}
public String getDocterAvalability() {
	return docterAvalability;
}
public void setDocterAvalability(String docterAvalability) {
	this.docterAvalability = docterAvalability;
}
public String getDoctorName() {
	return doctorName;
}
public void setDoctorName(String doctorName) {
	this.doctorName = doctorName;
}
public String getPatientName() {
	return patientName;
}
public void setPatientName(String patientName) {
	this.patientName = patientName;
}
public int getDoctorId() {
	return doctorId;
}
public void setDoctorId(int doctorId) {
	this.doctorId = doctorId;
}
public int getPatientId() {
	return patientId;
}
public void setPatientId(int patientId) {
	this.patientId = patientId;
}
@Override
public String toString() {
	return "Appointment [doctorName=" + doctorName + ", patientName=" + patientName + ", doctorId=" + doctorId
			+ ", patientId=" + patientId + ", date=" + date + ", docterAvalability=" + docterAvalability + "]";
}



}
