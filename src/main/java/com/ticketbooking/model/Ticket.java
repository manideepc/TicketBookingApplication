package com.ticketbooking.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="tbl_ticket")
public class Ticket {

    /*
    To Autopopulate the Primary Key Value
    1. Auto
    2. Identity
     */

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ticket_id")
    private Integer ticketId;

    @Column(name="passengerName")
    private String passengerName;

    @Column(name="source_station")
    private String sourceStation;

    @Column(name="destination_station")
    private String destinationStation;

    @Column(name="travel_date")
    private Date travelDate;

    @Column(name="email")
    private String email;

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getSourceStation() {
        return sourceStation;
    }

    public void setSourceStation(String sourceStation) {
        this.sourceStation = sourceStation;
    }

    public String getDestinationStation() {
        return destinationStation;
    }

    public void setDestinationStation(String destinationStation) {
        this.destinationStation = destinationStation;
    }

    public Date getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(Date travelDate) {
        this.travelDate = travelDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Ticket(String passengerName, String sourceStation, String destinationStation, Date travelDate) {
        this.passengerName = passengerName;
        this.sourceStation = sourceStation;
        this.destinationStation = destinationStation;
        this.travelDate = travelDate;
    }
    public Ticket(){}

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                ", passengerName=" + passengerName +
                ", sourceStation=" + sourceStation +
                ", destinationStation=" + destinationStation +
                ", travelDate=" + travelDate +
                '}';
    }
}
