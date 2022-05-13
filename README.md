# Java-OOP-Hotel-reservation-application
Included in Udacity Nano Degree Programme - Become a Java Developer
The goal was to create a hotel application which allows users to book and manage room reservations. The project emphasizes the use of Java programming language for practicing and elevating fundamental skills as a Java developer.

	User Scenarios	
	The application provides four user scenarios:

	1.Creating a customer account: The user needs to first create a customer account before they can create a reservation.

	2.Searching for rooms: The app should allow the user to search for available rooms based on provided checkin and checkout dates.
	If the application has available rooms for the specified date range, a list of the corresponding
	rooms will be displayed to the user for choosing.

	3.Booking a room: Once the user has chosen a room, the app will allow them to book the room and create a reservation.

	4.Viewing reservations: After booking a room, the app allows customers to view a list of all their reservations.
	
	
![image](https://user-images.githubusercontent.com/105473927/168212807-bf7b9c41-e172-423c-bc6c-8a6935cd3cca.png)


	Admin Scenarios
	The application provides four administrative scenarios:

	1.Displaying all customers accounts.

	2.Viewing all of the rooms in the hotel.

	3.Viewing all of the hotel reservations.

	4.Adding a room to the hotel application.

![image](https://user-images.githubusercontent.com/105473927/168212860-60d0e57f-ce69-4111-aafe-3349117c3007.png)



	Reserving a Room:
	
	1.The application allows customers to reserve a room. Here are the specifics:

	2.Avoid conflicting reservations: A single room may only be reserved by a single customer per a checkin and checkout date range.
	Search for recommended rooms: If there are no available rooms for the customer's date range, a search will be performed that 
	displays recommended rooms on alternative dates. The recommended room search will add seven days to the original checkin 
	and checkout dates to see if the hotel has any availabilities, and then display the recommended rooms/dates to the customer
	
	
	Room Requirements:
	
	Room cost: Rooms will contain a price per night. When displaying rooms, paid rooms will display the price per night and
	free rooms will display "Free" or have a $0 price. Unique room numbers: Each room will have a unique room number,
	meaning that no two rooms can have the same room number. Room type: Rooms can be 
	either single occupant or double occupant (Enumeration: SINGLE, DOUBLE).

	Customer Requirements
	The application will have customer accounts. Each account has:
	
	A unique email for the customer: RegEx is used to check that the email is in the correct format (i.e., name@domain.com).
	A first name and last name.
	The email RegEx is simple for the purpose of this exercise and may not cover all real-world valid emails.


	Error Requirements:
	
	The hotel reservation application handles all exceptions gracefully (user inputs included), meaning:
	No crashing: The application does not crash based on user input.
	No unhandled exceptions: The app has try and catch blocks that are used to capture exceptions and provide useful information to the user.
	There are no unhandled exceptions.

