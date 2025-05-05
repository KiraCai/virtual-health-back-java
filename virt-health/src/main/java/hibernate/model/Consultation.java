/*package hibernate.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "consultation")
public class Consultation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_doctor", referencedColumnName = "id")
    private Doctor doctor;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "time")
    private LocalTime time;

    @Column(name = "complaints")
    String complaints;

    @Column(name = "decision")
    String decision;

    @Lob
    @Column(name = "document")
    private byte[] document;

    @ManyToOne
    @JoinColumn(name = "id_history")
    private History history;

    public Consultation() {}

    public Consultation(LocalDate date, LocalTime time, String complaints, String decision, byte[] document) {
        this.date = date;
        this.time = time;
        this.complaints = complaints;
        this.decision = decision;
        this.document = document;
    }
    public Long getId() {
        return this.id;
    }
    public LocalDate getDate() {
        return this.date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public LocalTime getTime() {
        return this.time;
    }
    public void setTime(LocalTime time) {
        this.time = time;
    }
    public String getComplaints() {
        return this.complaints;
    }
    public void setComplaints(String complaints) {
        this.complaints = complaints;
    }
    public String getDecision() {
        return this.decision;
    }
    public void setDecision(String decision) {
        this.decision = decision;
    }
    public byte[] getDocument() {
        return this.document;
    }
    public void setDocument(byte[] document) {
        this.document = document;
    }
}*/

