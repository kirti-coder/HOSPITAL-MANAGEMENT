import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Appointment {

	Date App_date;
	int Doc_id;
	String doctor_name;
	List<Test> test=new ArrayList<Test>();
	
	public Appointment() {
		super();
	}
	public Appointment(Date app_date, int doc_id, List<Test> test) {
		super();
		App_date = app_date;
		Doc_id = doc_id;
		this.test = test;
	}
	public Date getApp_date() {
		return App_date;
	}
	public void setApp_date(Date app_date) {
		App_date = app_date;
	}
	public int getDoc_id() {
		return Doc_id;
	}
	public void setDoc_id(int doc_id) {
		Doc_id = doc_id;
	}
	public List<Test> getTest() {
		return test;
	}
	public void setTest(List<Test> test) {
		this.test = test;
	}
	
}
