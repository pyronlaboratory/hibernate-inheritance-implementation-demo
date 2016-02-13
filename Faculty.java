import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="FACULTY_TYPE", discriminatorType=DiscriminatorType.STRING)

@Table(name="FACULTY")
public class Faculty {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="FACULTY_ID",length=10)
	private int facultyID;
	@Column(name="NAME",length=30)
	private String name;
	
	public int getFacultyID() {
		return facultyID;
	}
	public void setFacultyID(int facultyID) {
		this.facultyID = facultyID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
