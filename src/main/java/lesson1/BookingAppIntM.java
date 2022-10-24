package lesson1;

import hw_StepProject.Bookings;

import java.util.List;
import java.util.Optional;

public interface BookingAppIntM {
    List<Bookings> getAllBooking();
    List<Bookings> getBookingId(int bookid);
    public void cancelBooking(int bookId);
    public void saveBooking(Bookings book);
    public Optional<Bookings> findBook(int bookId);



}
