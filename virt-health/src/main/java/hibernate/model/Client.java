package hibernate.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_history")
    private History history;

    @Column(name = "first_name")
    String first_name;

    @Column(name = "last_name")
    String last_name;

    @Column(name = "date_birth")
    private LocalDate date_birth;

    @Column(name = "email")
    String email;

    @Column(name = "tel")
    Integer tel;

    @Column(name = "address")
    String address;

    @Lob
    @Column(name = "document")
    private byte[] document; //save doc

    @Lob
    @Column(name = "photo", columnDefinition = "BLOB")
    private byte[] photo;

    public Client() {
    }

    public Client(String first_name, String last_name, LocalDate date_birth, String email, Integer tel, String address) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.date_birth = date_birth;
        this.email = email;
        this.tel = tel;
        this.address = address;
    }

    public Long getId() {
        return this.id;
    }

    public String getFirst_name() {
        return this.first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getLast_name() {
        return this.last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public LocalDate getDate_birth() {
        return this.date_birth;
    }
    public void setDate_birth(LocalDate date_birth) {
        this.date_birth = date_birth;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getTel() {
        return this.tel;
    }
    public void setTel(Integer tel) {
        this.tel = tel;
    }
    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public byte[] getDocument() {
        return this.document;
    }
    public void setDocument(byte[] document) {
        this.document = document;
    }
    public byte[] getPhoto() {
        return this.photo;
    }
    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
}
