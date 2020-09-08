import java.util.ArrayList;
import java.util.List;

public class Patients {

	int id ;
	String Patient_name;
	List<Appointment> appoint=new ArrayList<Appointment>();
	
	
	public Patients() {
		super();
	}


	public Patients(int id, String patient_name, List<Appointment> appoint) {
		super();
		this.id = id;
		Patient_name = patient_name;
		this.appoint = appoint;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getPatient_name() {
		return Patient_name;
	}


	public void setPatient_name(String patient_name) {
		Patient_name = patient_name;
	}


	public List<Appointment> getAppoint() {
		return appoint;
	}


	public void setAppoint(List<Appointment> appoint) {
		this.appoint = appoint;
	}
}
