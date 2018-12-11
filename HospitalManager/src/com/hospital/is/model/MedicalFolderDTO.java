package com.hospital.is.model;


import java.util.Map;

public class MedicalFolderDTO {

	private Map<Integer, DiseaseDTO> diseaseMap;
	
	private Map<Integer, PrescriptionDTO> prescriptionMap;
	
	private Map<Integer, AppointmentDTO> appointmentMap;


	/**
	 * @return the diseaseList
	 */
	public Map<Integer, DiseaseDTO> getDiseaseMap() {
		return diseaseMap;
	}

	/**
	 * @param diseaseList the diseaseList to set
	 */
	public void setDiseaseMap(Map<Integer, DiseaseDTO> diseaseMap) {
		this.diseaseMap = diseaseMap;
	}
	

	/**
	 * @return the prescriptionList
	 */
	public Map<Integer, PrescriptionDTO> getPrescriptionMap() {
		return prescriptionMap;
	}

	/**
	 * @param prescriptionList the prescriptionList to set
	 */
	public void setPrescriptionMap(Map<Integer, PrescriptionDTO> prescriptionMap) {
		this.prescriptionMap = prescriptionMap;
	}
	

	/**
	 * @return the appointmentList
	 */
	public Map<Integer, AppointmentDTO> getAppointmentMap() {
		return appointmentMap;
	}

	/**
	 * @param appointmentList the appointmentList to set
	 */
	public void setAppointmentMap(Map<Integer, AppointmentDTO> appointmentMap) {
		this.appointmentMap = appointmentMap;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MedicalFolder [diseaseMap=" + diseaseMap + "]";
	}
	
	
}
