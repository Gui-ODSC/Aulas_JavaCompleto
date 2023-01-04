package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation() {
		
	}
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}
	
	//metodos
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();//pega a diferenca das datas em milisegundos
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);//conversão de milisegundos para dias através da chamada de TimeUnit
		
	}
	
	public String updateDates(Date checkin, Date checkout) {
		
		Date now = new Date();
		if(checkin.before(now) || checkout.before(now)) {
			return "Reservation dates for update must be future dates";
		}
		if (!checkout.after(checkin)) {
			return "Check-out date must be after check-in date";
		}
		this.checkIn = checkin;
		this.checkOut = checkout;
		return null;
	}
	
	@Override
	public String toString() {
		return "Room " + roomNumber + ", check-in: " + sdf.format(checkIn) + 
				", check-out: " + sdf.format(checkOut) + ", " + duration() + " nights";
	}
}
