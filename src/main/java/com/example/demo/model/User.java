package com.example.demo.model;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Getter
@Table(name = "Users")
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @NonNull
    private String username;

    private String password;
    @NonNull
    public String nazwisko;
    @NonNull
    public String email;
    @NonNull
    public String telefon;
    public int sumaumow;


    @OneToMany(mappedBy = "user")
    private List<Zadania> zadania;

    @OneToMany(mappedBy = "user")
    private List<Wizyty> wizyty;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public List<Zadania> getZadania() {
        return zadania;
    }

    public void setZadania(List<Zadania> zadania) {
        this.zadania = zadania;
    }

    public int getSumaumow() {
        return sumaumow;
    }

    public void setSumaumow(int sumaumow) {
        this.sumaumow = sumaumow;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}