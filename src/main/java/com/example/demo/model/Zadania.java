package com.example.demo.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Table(name = "Zadaniaa")
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Zadania {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String opisZadania;
    @NonNull
    private String produkt;
    @NonNull
    private int kwotaumowy;
    @NonNull
    private String typumowy;

    private int sumaumowy;
    @NonNull
    private String xddd;

    @ManyToOne
    @JoinColumn(name = "userid")
    @NonNull
    private User user;
    @NonNull
    public String firmy;

    @ManyToOne
    @JoinColumn(name = "firmyid")

    private Firmy firmyy;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getOpisZadania() {
        return opisZadania;
    }

    public void setOpisZadania(String opisZadania) {
        this.opisZadania = opisZadania;
    }


    public String getTypumowy() {
        return typumowy;
    }

    public void setTypumowy(String typumowy) {
        this.typumowy = typumowy;
    }

    public int getKwotaumowy() {
        return kwotaumowy;
    }

    public void setKwotaumowy(int kwotaumowy) {
        this.kwotaumowy = kwotaumowy;
    }

    public String getProdukt() {
        return produkt;
    }

    public void setProdukt(String produkt) {
        this.produkt = produkt;
    }

    public int getSumaumowy() {
        return sumaumowy;
    }

    public void setSumaumowy(int sumaumowy) {
        this.sumaumowy = sumaumowy;
    }

    public String getXddd() {
        return xddd;
    }

    public void setXddd(String xddd) {
        this.xddd = xddd;
    }

    public String getFirmy() {
        return firmy;
    }

    public void setFirmy(String firmy) {
        this.firmy = firmy;
    }

    public Firmy getFirmyy() {
        return firmyy;
    }

    public void setFirmyy(Firmy firmyy) {
        this.firmyy = firmyy;
    }
}