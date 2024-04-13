package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Table(name = "Wizyty")
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor

public class Wizyty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @NonNull
    public String data;
    @NonNull
    public String godzina;
    @NonNull
    public String celspotkania;
    @NonNull
    public String notatka;

    @ManyToOne
    @JoinColumn(name = "useridd")
    @NonNull
    private User user;
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getGodzina() {
        return godzina;
    }

    public void setGodzina(String godzina) {
        this.godzina = godzina;
    }

    public String getCelspotkania() {
        return celspotkania;
    }

    public void setCelspotkania(String celspotkania) {
        this.celspotkania = celspotkania;
    }

    public String getNotatka() {
        return notatka;
    }

    public void setNotatka(String notatka) {
        this.notatka = notatka;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
