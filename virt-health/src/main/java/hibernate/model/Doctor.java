package hibernate.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "doctor")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    String first_name;

    @Column(name = "last_name")
    String last_name;

    @Column(name = "date_birth")
    private LocalDate date_birth;

    @Column(name = "email_work")
    String email_work;

    @Column(name = "email_personal")
    String email_personal;

    @Column(name = "education_secondary")
    String education_secondary;

    @Column(name = "education_higher")
    String education_higher;

    @Column(name = "experience")
    String experience;

    @Column(name = "tel_personal")
    Integer tel_personal;

    @Column(name = "tel_work")
    Integer tel_work;

    @Column(name = "sex")
    Character sex;

    @Column(name = "address_work")
    String address_work;

    @Column(name = "address_personal")
    String address_personal;

    @Column(name = "name_establishment")
    String name_establishment;

    @Column(name = "job_title")
    String job_title;

    @Lob
    @Column(name = "document")
    private byte[] document; //save doc

    @Lob
    @Column(name = "photo", columnDefinition = "BLOB")
    private byte[] photo;

    @Column(name = "about")
    String about;

    public Doctor() {}

    public Doctor(String first_name, String last_name, LocalDate date_birth, String email_work, String email_personal,
                  String education_secondary, String education_higher, String experience, Integer tel_personal,
                  Integer tel_work, Character sex, String address_work, String address_personal, String name_establishment,
                  String job_title, byte[] document, byte[] photo, String about) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.date_birth = date_birth;
        this.email_work = email_work;
        this.email_personal = email_personal;
        this.education_secondary = education_secondary;
        this.education_higher = education_higher;
        this.experience = experience;
        this.tel_personal = tel_personal;
        this.tel_work = tel_work;
        this.sex = sex;
        this.address_work = address_work;
        this.address_personal = address_personal;
        this.name_establishment = name_establishment;
        this.job_title = job_title;
        this.document = document;
        this.photo = photo;
        this.about = about;
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
    public String getEmail_work() {
        return this.email_work;
    }
    public void setEmail_work(String email_work) {
        this.email_work = email_work;
    }
    public String getEmail_personal() {
        return this.email_personal;
    }
    public void setEmail_personal(String email_personal) {
        this.email_personal = email_personal;
    }
    public String getEducation_secondary() {
        return this.education_secondary;
    }
    public void setEducation_secondary(String education_secondary) {
        this.education_secondary = education_secondary;
    }
    public String getEducation_higher() {
        return this.education_higher;
    }
    public void setEducation_higher(String education_higher) {
        this.education_higher = education_higher;
    }
    public String getExperience() {
        return this.experience;
    }
    public void setExperience(String experience) {
        this.experience = experience;
    }
    public Integer getTel_personal() {
        return this.tel_personal;
    }
    public void setTel_personal(Integer tel_personal) {
        this.tel_personal = tel_personal;
    }
    public Integer getTel_work() {
        return this.tel_work;
    }
    public void setTel_work(Integer tel_work) {
        this.tel_work = tel_work;
    }
    public Character getSex(){
        return this.sex;
    }
    public void setSex(Character sex){
        this.sex = sex;
    }
    public String getAddress_work() {
        return this.address_work;
    }
    public void setAddress_work(String address_work) {
        this.address_work = address_work;
    }
    public String getAddress_personal() {
        return this.address_personal;
    }
    public void setAddress_personal(String address_personal) {
        this.address_personal = address_personal;
    }
    public String getName_establishment() {
        return this.name_establishment;
    }
    public void setName_establishment(String name_establishment) {
        this.name_establishment = name_establishment;
    }
    public String getJob_title() {
        return this.job_title;
    }
    public void setJob_title(String job_title) {
        this.job_title = job_title;
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
    public String getAbout() {
        return this.about;
    }
    public void setAbout(String about) {
        this.about = about;
    }
}
