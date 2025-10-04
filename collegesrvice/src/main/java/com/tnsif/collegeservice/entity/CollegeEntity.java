package com.tnsif.collegeservice.entity;




import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String location;
    private String University;
    private String principalName;
    private int establishedYear;
    private int studentCount;
    private String accredation;


    


    }

    // Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public int EstablishedYear() { return establishedYear; }
    public void setEstablishedYear(int establishedyear) { this.establishedYear = establishedYear; }

   public String setUniversity() { return university; }
    public void setUniversity(String university) { this.university= university; 
}

    public String principalName() { return principalName; }
    public void setPrincipalName(String principalName ) { this. principalName= principalName; 
}
    public int StudentCount() { return studentCount; }
    public void setStudentCount(int studentCount) { this. studentCount = studentCount; }

    public String getAccreditation(){
        return accreditation;}
     public void setAccreditation(String Accreditation) { this.accreditation= accreditation; 

}
}


