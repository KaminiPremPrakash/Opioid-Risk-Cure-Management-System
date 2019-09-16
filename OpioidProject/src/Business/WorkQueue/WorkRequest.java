/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Ami Gandhi
 */
public abstract class WorkRequest {

    //data for Accomodation Enterprise
    //common data
    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private int hashcode;
    private String labresult;
    private String resulttype;
    private String solution;
    private String appointmentDecision;
    private String fromDate;
    private String toDate;

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getAppointmentDecision() {
        return appointmentDecision;
    }

    public void setAppointmentDecision(String appointmentDecision) {
        this.appointmentDecision = appointmentDecision;}
    private String medlist="";

    private String doc_med_history;
    private String lab_solution;
    private String diagnose;

    public String getDoc_med_history() {
        return doc_med_history;
    }

    public void setDoc_med_history(String doc_med_history) {
        this.doc_med_history = doc_med_history;
    }

    public String getLab_solution() {
        return lab_solution;
    }

    public void setLab_solution(String lab_solution) {
        this.lab_solution = lab_solution;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    public String getLabresult() {
        return labresult;
    }

    public void setLabresult(String labresult) {
        this.labresult = labresult;
    }

    public String getResulttype() {
        return resulttype;
    }

    public void setResulttype(String resulttype) {
        this.resulttype = resulttype;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public int getHashcode() {
        return hashcode;
    }

    public void setHashcode(int hashcode) {
        this.hashcode = hashcode;
    }

    public String getMedlist() {
        return medlist;
    }

    public void setMedlist(String medlist) {
        this.medlist = medlist;
    }
    
    //common getter and setter
    public WorkRequest() {
        requestDate = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void updateStauts(WorkRequest w) {
        this.status = w.getStatus();
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    @Override
    public String toString() {
        return String.valueOf(this.message);
    }
}
