import java.util.ArrayList;
import java.util.List;

public class Doctors {

	private int Doc_id;
	private String docName;
	List<Speciality> speciality=new ArrayList<Speciality>();
	List<Availability> available=new ArrayList<Availability>();
	
	public Doctors() {
		super();
	}
	public Doctors(int id, String docName, List<Speciality> speciality, List<Availability> available) {
		super();
		this.Doc_id = id;
		this.docName = docName;
		this.speciality = speciality;
		this.available = available;
	}
	public int getId() {
		return Doc_id;
	}
	public void setId(int id) {
		this.Doc_id = id;
	}
	public String getDocName() {
		return docName;
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	public List<Speciality> getSpeciality() {
		return speciality;
	}
	public void setSpeciality(List<Speciality> speciality) {
		this.speciality = speciality;
	}
	public List<Availability> getAvailable() {
		return available;
	}
	public void setAvailable(List<Availability> available) {
		this.available = available;
	}
}
