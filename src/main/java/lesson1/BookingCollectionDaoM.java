package lesson1;

import hw_StepProject.Bookings;
import lesson1.BookingAppIntM;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BookingCollectionDaoM implements BookingAppIntM {
        private File fileBooking;

        public BookingCollectionDaoM(File bookingFile) {
            this.fileBooking = bookingFile;
        }
        @Override
        public List<Bookings> getAllBooking() {
            try (FileInputStream fs = new FileInputStream(fileBooking);
                 BufferedInputStream bs = new BufferedInputStream(fs);
                 ObjectInputStream os = new ObjectInputStream(bs);)
            {
                Object bookings = os.readObject();
                List<Bookings> allBookins = (ArrayList<Bookings>) bookings;
                return allBookins;
            } catch (IOException | ClassNotFoundException ex) {
                System.out.println(ex.getMessage());
                return new ArrayList<>();
            }
        }
        private void writeBooking(List<Bookings> bookings) {
            try (FileOutputStream fs = new FileOutputStream(fileBooking);
                 BufferedOutputStream bs = new BufferedOutputStream(fs);
                 ObjectOutputStream os = new ObjectOutputStream(bs);)
            {
                os.writeObject(bookings);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        @Override
        public List<Bookings> getBookingId (int bookId) {
            return getAllBooking().stream()
                    .filter(s -> s.getFlight().getFlightId() == bookId)
                    .collect(Collectors.toList());
        }
    @Override
    public void cancelBooking(int bookId) {
        List<Bookings> bookings = getAllBooking().stream()
                .filter(s -> s.getFlight().getFlightId() != bookId)
                .collect(Collectors.toList());
        writeBooking(bookings);
    }

    @Override
    public void saveBooking(Bookings book) {
        List<Bookings> bookings = getAllBooking();
        bookings.add(book);
        writeBooking(bookings);
    }
    @Override
    public Optional<Bookings> findBook(int bookId) {
        return getAllBooking().stream().filter(s -> s.getFlight().getFlightId() == bookId).findFirst();
    }

}
