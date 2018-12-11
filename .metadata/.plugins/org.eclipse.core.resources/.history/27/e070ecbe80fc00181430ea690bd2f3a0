package com.hospital.is;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hospital.is.model.Appointment;
import com.hospital.is.model.Disease;
import com.hospital.is.model.Doctor;
import com.hospital.is.model.MedicalFolder;
import com.hospital.is.model.Patient;

public class StaticDatabase {

	public static Map<String, Object> getGenericMap(String key) {

		switch (key) {
		case "Patient":
			return getPatientList();
//		case "Disease":
//			return getPatientList();
//		case "Appointment":
//			return getPatientList();
//		case "MedicalFolder":
//			return getPatientList();

		default:
			break;
		}

		return null;
	}

	/**
	 * @return the diseaseList
	 */
	public static Map<Integer, Disease> getDiseaseList() {
		// List<Disease> diseaseList = new ArrayList<>();
		Map<Integer, Disease> diseaseList = new HashMap<Integer, Disease>();

		Disease disease = new Disease();
		disease.setNature("gastro");
		disease.setDescription("gastro description");
		disease.setDiagDate("06/12/2018");

		diseaseList.put(1, disease);

		return diseaseList;
	}

	/**
	 * 
	 * @return
	 */
	public static Map<Integer, Appointment> getAppointmentList() {
		// List<Disease> diseaseList = new ArrayList<>();
		Map<Integer, Appointment> appointmentList = new HashMap<Integer, Appointment>();

		Appointment appointment = new Appointment();
		appointment.setDateTimeAppointment(null);
		appointment.setDoctor(new Doctor());
		appointment.setPrescriptionList(null);
		appointment.setTypeAppointment("Consultation");

		appointmentList.put(1, appointment);

		return appointmentList;
	}

	/**
	 * @return the medicalFolderList
	 */
	public static Map<Integer, MedicalFolder> getMedicalFolderList() {
		// List<MedicalFolder> medicalFolderList = new ArrayList<>();
		Map<Integer, MedicalFolder> medicalFolderList = new HashMap<Integer, MedicalFolder>();
		MedicalFolder medicalFolder = new MedicalFolder();

		medicalFolder.setDiseaseList(getDiseaseList());

		medicalFolderList.put(1, medicalFolder);

		return medicalFolderList;
	}

	/**
	 * @return the patientList
	 */
	public static Map<String, Object> getPatientList() {

		List<Patient> patientList = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();

		Patient patient = new Patient();

		patient.setMedicalFolder(getMedicalFolderList().get(0));
		patient.setFirstName("Majda");
		patient.setLastName("AMCHICHI");
		patient.setAddress("30 rue soulaimane achaairi, 20500, Tetouan Maroc");
		patient.setBirthDate("01/01/1970");
		patient.setPhone("+212 6 66 77 88 99");

		patientList.add(patient);

		map.put(patient.getLastName() + patient.getFirstName(), patient);

		return map;
	}

	/**
	 * @return the patientList
	 */
	public static Map<String, Doctor> getDoctorList() {

		List<Doctor> doctorList = new ArrayList<>();
		Map<String, Doctor> map = new HashMap<>();

		Doctor doctor = new Doctor();

		doctor.setFirstName("Ahmed");
		doctor.setLastName("BENANI");
		doctor.setAddress("30 rue soulaimane achaairi, 20500, Tetouan Maroc");
		doctor.setBirthDate("01/01/1974");
		doctor.setPhone("+212 6 66 77 88 77");

		doctorList.add(doctor);

		map.put(doctor.getLastName() + doctor.getFirstName(), doctor);

		return map;
	}

}
