/*package hibernate.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "vaccination")
public class Vaccination {

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

    @Column(name = "name_vac")
    String name_vac;

    @Column(name = "place")
    String place;

    @Column(name = "reason")
    String reason;

    @Lob
    @Column(name = "document")
    private byte[] document;

    @ManyToOne
    @JoinColumn(name = "id_history")
    private History history;

    public Vaccination() {}

    public Vaccination(LocalDate date, LocalTime time, String name_vac, String place, String reason, byte[] document) {
        this.date = date;
        this.time = time;
        this.name_vac = name_vac;
        this.place = place;
        this.reason = reason;
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
    public String getNameVac() {
        return this.name_vac;
    }
    public void setNameVac(String name_vac) {
        this.name_vac = name_vac;
    }
    public String getPlace() {
        return this.place;
    }
    public void setPlace(String place) {
        this.place = place;
    }
    public String getReason() {
        return this.reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }
    public byte[] getDocument() {
        return this.document;
    }
    public void setDocument(byte[] document) {
        this.document = document;
    }
}*/
