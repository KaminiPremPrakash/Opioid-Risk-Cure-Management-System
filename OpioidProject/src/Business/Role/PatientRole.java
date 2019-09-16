/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DoctorRole.DoctorAppointmentRequestsJPanel;
import userinterface.PatientRole.PatientWorkAreaJPanel;
//import userinterface.PatientRole.PatientWorkAreaJPanel;

/**
 *
 * @author Kamini Prakash
 */
public class PatientRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new PatientWorkAreaJPanel(userProcessContainer, account, organization, enterprise, network);
        //return null;
    }

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
