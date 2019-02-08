package com.wyair.demo1.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Setter@Getter@ToString
public class Flight
{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(length = 20)
    private String srcCity;
    @Column(length = 20)
    private String srcAirport;
    @Column(length = 20)
    private String desCity;
    @Column(length = 20)
    private String desAirport;
    @JsonFormat(timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime depTime;
    private LocalDateTime arrTime;
    private Integer totalTicket;
    private Integer leftTicket;
    private Double ecoPrice;
    @Nullable
    private Double busiPrice;

    public Flight() { }

    public Flight(String srcCity, String srcAirport, String desCity, String desAirport, LocalDateTime depTime, LocalDateTime arrTime, Integer totalTicket, Integer leftTicket, Double ecoPrice, Double busiPrice)
    {
        this.srcCity = srcCity;
        this.srcAirport = srcAirport;
        this.desCity = desCity;
        this.desAirport = desAirport;
        this.depTime = depTime;
        this.arrTime = arrTime;
        this.totalTicket = totalTicket;
        this.leftTicket = leftTicket;
        this.ecoPrice = ecoPrice;
        this.busiPrice = busiPrice;
    }
}
