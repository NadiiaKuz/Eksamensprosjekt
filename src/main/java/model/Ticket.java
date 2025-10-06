package main.java.model;

import main.java.enums.TicketType;

import java.time.LocalDate;

public class Ticket {
    private int ticketId;
    private TicketType ticketType;
    private LocalDate validFrom;
    private LocalDate validTo;
    private int price;

    public Ticket(int ticketId, TicketType ticketType, LocalDate validFrom, LocalDate validTo, int price) {
        this.ticketId = ticketId;
        this.ticketType = ticketType;
        this.validFrom = validFrom;
        this.validTo = validTo;
        this.price = price;
    }


    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public TicketType getTicketType() {
        return ticketType;
    }

    public void setTicketType(TicketType ticketType) {
        this.ticketType = ticketType;
    }

    public LocalDate getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(LocalDate validFrom) {
        this.validFrom = validFrom;
    }

    public LocalDate getValidTo() {
        return validTo;
    }

    public void setValidTo(LocalDate validTo) {
        this.validTo = validTo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}