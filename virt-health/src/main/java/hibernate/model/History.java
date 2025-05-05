/*package hibernate.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "history")
public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToOne(mappedBy = "history")
    Client client;

    @OneToMany(mappedBy = "history", cascade = CascadeType.ALL)
    private List<Vaccination> vaccination;

    @OneToMany(mappedBy = "history", cascade = CascadeType.ALL)
    private List<Test> test;

    @OneToMany(mappedBy = "history", cascade = CascadeType.ALL)
    private List<Prescription> prescription;

    @OneToMany(mappedBy = "history", cascade = CascadeType.ALL)
    private List<Consultation> consultations;

    public History() {
    }

    public Long getId() {
        return this.id;
    }
    public List<Consultation> getConsultations() {
        return this.consultations;
    }

}*/
