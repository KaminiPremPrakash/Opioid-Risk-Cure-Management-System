/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Kamini Prakash
 */
public class LabDoctorReportSentRequest extends WorkRequest {
    private String patientName;
    private String patientGender;
    private int patientAge;
    private String healthRisk;
    private String medicalDoseDetail;
    private String medicalHistory;
    private String labAssessmentResult;

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientGender() {
        return patientGender;
    }

    public void setPatientGender(String patientGender) {
        this.patientGender = patientGender;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public String getHealthRisk() {
        return healthRisk;
    }

    public void setHealthRisk(String healthRisk) {
        this.healthRisk = healthRisk;
    }

    public String getMedicalDoseDetail() {
        return medicalDoseDetail;
    }

    public void setMedicalDoseDetail(String medicalDoseDetail) {
        this.medicalDoseDetail = medicalDoseDetail;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getLabAssessmentResult() {
        return labAssessmentResult;
    }

    public void setLabAssessmentResult(String labAssessmentResult) {
        this.labAssessmentResult = labAssessmentResult;
    }
}
