package com.ics.demo.university.model;
import com.ics.demo.student.model.Student;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "universities")
public class University {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull(groups = Update.class)
	@Column(name = "id")
	private Long id;

	@NotNull(groups = Create.class)
	@Column(name = "name")
	private String name;

	@NotNull(groups = Create.class)
	@Column(name = "location")
	private String location;

	@Column(name = "year_founded")
	private String yearFounded;

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	//one university is mapped to many universities
	@OneToMany(mappedBy = "university" )
	private List<Student> studentList;
	public University(String name, String location) {
		this.name = name;
		this.location = location;
	}

	public University() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getYearFounded() {
		return yearFounded;
	}

	public void setYearFounded(String yearFounded) {
		this.yearFounded = yearFounded;
	}

	public interface  Update{

    }

    public interface Create{

    }
}


