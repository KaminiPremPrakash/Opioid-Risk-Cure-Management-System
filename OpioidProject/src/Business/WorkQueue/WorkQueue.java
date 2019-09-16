/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author Ami Gandhi
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;
    private ArrayList<PatientAppointmentRequest> patientAppointmentRequest;
    private ArrayList<DoctorLabRequest> doctorLabRequest;

    
    public WorkQueue() {
        workRequestList = new ArrayList();
        patientAppointmentRequest= new ArrayList();
        doctorLabRequest= new ArrayList();

    }
    
     public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
     
    // For patientAppointmentRequest

    public ArrayList<PatientAppointmentRequest> getPatientAppointmentRequest() {
        return patientAppointmentRequest;
    }

    public void setPatientAppointmentRequest(ArrayList<PatientAppointmentRequest> patientAppointmentRequest) {
        this.patientAppointmentRequest = patientAppointmentRequest;
    }

    
    public ArrayList<DoctorLabRequest> getDoctorLabRequest() {
        return doctorLabRequest;
    }

    public void setDoctorLabRequest(ArrayList<DoctorLabRequest> doctorLabRequest) {
        this.doctorLabRequest = doctorLabRequest;
    }
    }