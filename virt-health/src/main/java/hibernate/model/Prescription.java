package hibernate.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity

@Table(name = "prescription")
public class Prescription {

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

    @Column(name = "treatment")
    String treatment;

    @Lob
    @Column(name = "document")
    private byte[] document;

    @ManyToOne
    @JoinColumn(name = "id_history")
    private History history;

    public Prescription() {}

    public Prescription(LocalDate date, LocalTime time, String treatment, byte[] document) {
        this.date = date;
        this.time = time;
        this.treatment = treatment;
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
    public String getTreatment() {
        return this.treatment;
    }
    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }
    public byte[] getDocument() {
        return this.document;
    }
    public void setDocument(byte[] document) {
        this.document = document;
    }
}
