package hibernate.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "test")
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_doctor")
    private Doctor doctor;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "time")
    private LocalTime time;

    @Column(name = "name_test")
    String name_test;

    @Column(name = "place")
    String place;

    @Column(name = "result")
    String result;

    @Column(name = "reason")
    String reason;

    @Lob
    @Column(name = "document")
    private byte[] document;

    @ManyToOne
    @JoinColumn(name = "id_history")
    private History history;

    public Test() {}

    public Test(LocalDate date, LocalTime time, String name_test, String place, String result, String reason, byte[] document) {
        this.date = date;
        this.time = time;
        this.name_test = name_test;
        this.place = place;
        this.result = result;
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
    public String getNameTest() {
        return this.name_test;
    }
    public void setNameTest(String name_test) {
        this.name_test = name_test;
    }
    public String getPlace() {
        return this.place;
    }
    public void setPlace(String place) {
        this.place = place;
    }
    public String getResult() {
        return this.result;
    }
    public void setResult(String result) {
        this.result = result;
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
}
