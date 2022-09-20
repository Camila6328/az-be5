package hw_StepProject;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Flights  implements Serializable {
    int flightId; //serial number of flight
    String  toCity;
    String dateFrom;
    String timeFrom;
    int avblTicketCnt;

    // Calendar cdr = Calendar.getInstance();
    public Flights() {};
    public Flights(int flightId, String toCity, String dateFrom, String timeFrom,int avblTicketCnt) throws ParseException {
        SimpleDateFormat frm1 = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat frm2 = new SimpleDateFormat("hh:mm");
        Date dFrom = frm1.parse(dateFrom);
        Date tFrom = frm2.parse(timeFrom);
        this.flightId = flightId;
        this.toCity =  toCity;
        this.dateFrom = frm1.format(dFrom);
        this.timeFrom = frm2.format(tFrom);
        this. avblTicketCnt =  avblTicketCnt;
    }
    @Override
    public String toString() {
        return "Flights{" +
                "flightId=" + flightId +
                ", fromCity='" + "Kiev" + '\'' +
                ", toCity='" + toCity + '\'' +
                ", dateFrom='" + dateFrom + '\'' +
                ", dateTime ='" + timeFrom + '\'' +
                ", avblTicketCnt=" +  avblTicketCnt +
                '}';
    }

    public int getFlightId() {
        return flightId;
    }


    public String getToCity() {
        return toCity;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public String getTimeFrom() {
        return timeFrom;
    }

    public int getAvblTicketCnt() {
        return avblTicketCnt;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public void setToCity(String toCity) {
        this.toCity = toCity;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public void setTimeFrom(String timeFrom) {
        this.timeFrom = timeFrom;
    }

    public void setAvblTicketCnt(int avblTicketCnt) {
        this.avblTicketCnt = avblTicketCnt;
    }

}
