package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Getter
@Table(name = "Notatki")
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Notatka {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @NonNull
    private String tresc;
@NonNull
    private String dataUtworzenia;

    @NonNull
    private String nazwaKontrahenta;
    @ManyToOne
    @JoinColumn(name = "id_kontrahenta")
    private User user;

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }

    public String getDataUtworzenia() {
        return dataUtworzenia;
    }

    public void setDataUtworzenia(String dataUtworzenia) {
        this.dataUtworzenia = dataUtworzenia;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getNazwaKontrahenta() {
        return nazwaKontrahenta;
    }

    public void setNazwaKontrahenta(String nazwaKontrahenta) {
        this.nazwaKontrahenta = nazwaKontrahenta;
    }
}

