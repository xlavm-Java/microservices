package com.udea;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.springframework.lang.NonNull;

@Entity
public class Reservation implements Serializable {
	
	@Id
    @GeneratedValue
    private Long id;
    private @NonNull String reservationName;

    @Override
    public String toString() {
        return "una reservacion{"
                + "id:" + id
                + ", Nombre de la Reserva='" + getReservationName()+ '\''
                + '}';
    }

    public Reservation() {
    }

    public Reservation(String reservationName) {
        this.reservationName = reservationName;
    }

    public Long getId() {
        return id;
    }

    public String getReservationName() {
        return reservationName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setReservationName(String reservationName) {
        this.reservationName = reservationName;
    }
}
