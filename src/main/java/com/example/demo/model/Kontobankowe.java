package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Table(name = "kontoo")
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Kontobankowe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @NonNull
    public String nazwabanku;
    @NonNull
    public String nrkonta;
    @NonNull
    public String SWIFT;

    public String getNazwabanku() {
        return nazwabanku;
    }

    public void setNazwabanku(String nazwabanku) {
        this.nazwabanku = nazwabanku;
    }

    public String getNrkonta() {
        return nrkonta;
    }

    public void setNrkonta(String nrkonta) {
        this.nrkonta = nrkonta;
    }

    public String getSWIFT() {
        return SWIFT;
    }

    public void setSWIFT(String SWIFT) {
        this.SWIFT = SWIFT;
    }
}
