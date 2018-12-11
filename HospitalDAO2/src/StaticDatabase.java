

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hospital.is.entity.Appointment;
import com.hospital.is.entity.Disease;
import com.hospital.is.entity.Doctor;
import com.hospital.is.entity.MedicalFolder;
import com.hospital.is.entity.Patient;

public class StaticDatabase {

	public static Map<String, Object> getGenericMap(String key) {

		switch (key) {
		case "Patient":
			return getPatientMap();
//		case "Disease":
//			return getPatientMap();
//		case "Appointment":
//			return getPatientMap();
//		case "MedicalFolder":
//			return getPatientMap();

		default:
			break;
		}

		return null;
	}

	/**
	 * @return the diseaseList
	 */
	public static Map<Integer, Disease> getDiseaseMap() {
		// List<Disease> diseaseList = new ArrayList<>();
		Map<Integer, Disease> diseaseMap = new HashMap<Integer, Disease>();

		Disease disease = new Disease();
		disease.setNature("gastro");
		disease.setDescription("gastro description");
		disease.setDiagDate("06/12/2018");

		diseaseMap.put(1, disease);

		return diseaseMap;
	}

	/**
	 * 
	 * @return
	 */
	public static Map<Integer, Appointment> getAppointmentMap() {
		// List<Disease> diseaseList = new ArrayList<>();
		Map<Integer, Appointment> appointmentMap = new HashMap<Integer, Appointment>();

		Appointment appointment = new Appointment();
		appointment.setDateTimeAppointment(null);
		appointment.setDoctor(new Doctor());
		appointment.setPrescriptionMap(null);
		appointment.setTypeAppointment("Consultation");

		appointmentMap.put(1, appointment);

		return appointmentMap;
	}

	/**
	 * @return the medicalFolderList
	 */
	public static Map<Integer, MedicalFolder> getMedicalFolderMap() {
		// List<MedicalFolder> medicalFolderList = new ArrayList<>();
		Map<Integer, MedicalFolder> medicalFolderMap = new HashMap<Integer, MedicalFolder>();
		MedicalFolder medicalFolder = new MedicalFolder();

		medicalFolder.setDiseaseMap(getDiseaseMap());

		medicalFolderMap.put(1, medicalFolder);

		return medicalFolderMap;
	}

	/**
	 * @return the patientList
	 */
	public static Map<String, Object> getPatientMap() {

		List<Patient> patientList = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();

		Patient patient = new Patient();

		patient.setMedicalFolder(getMedicalFolderMap().get(0));
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
