package com.example.demo.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Table(name = "Firmy")
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Firmy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @NonNull
    private String nazwafimry;
    @NonNull
    private String branza;
    @NonNull
    public String osobadecyzyjna;
    @NonNull
    public String telefon;
    @NonNull
    public String email;
    @NonNull
    public String adres;



    public String getNazwafimry() {
        return nazwafimry;
    }

    public void setNazwafimry(String nazwafimry) {
        this.nazwafimry = nazwafimry;
    }

    public String getBranza() {
        return branza;
    }

    public void setBranza(String branza) {
        this.branza = branza;
    }


    public String getOsobadecyzyjna() {
        return osobadecyzyjna;
    }

    public void setOsobadecyzyjna(String osobadecyzyjna) {
        this.osobadecyzyjna = osobadecyzyjna;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
    
}
