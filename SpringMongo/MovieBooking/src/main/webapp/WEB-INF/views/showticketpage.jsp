<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html>
    <html>
    <head>
    <meta charset="ISO-8859-1">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
    <title>MovieFrom</title>
    </head>
    <body>
    <h1>Welcome to Movie Ticket Booking</h1>
    <form action="checkSeats">    
   	Mobile Number : 
    <input type="tel" name="mno">    
    <br><br>    
    Movie Name : 
    <select name="movielist">        
    <option value="tjmm">Screen 1 - Tu Jhoothi Main Makkaar</option>        
    <option value="pathaan">Screen 2 Pathaan</option>        
    <option value="vash">Screen 3 Vash</option>        
    <option value="antman">Screen 4 Antman</option>    
    </select>   
     <br><br>    
     Show Date :
    <input type="date" name="mdate" id="showdate">    
    <br><br>    
    Show Time : 
    <select name="mtime">        
    <option value="morning">Morning - 10:00</option>        
    <option value="noon">Afternoon - 2:30</option>        
    <option value="evening">Evening - 6:00</option>        
    <option value="night">Night - 10:00</option>    
    </select>    
    <br><br>    
    Ticket Type :
    Economy Rs.150
    <input type="radio" value="economy" name="economy">    
    Platinum Rs.250
    <input type="radio" value="platinum" name="platinum">    
    <br><br>    
    Number of Tickets :
    <input type="number" name="nseats">    
    <br><br>    
    <input type="submit" value="Check Availability">    
    <br><br>    
    Payment Type :
    <select name="ptype" disabled>        
    <option value="card">Card</option>        
    <option value="cash">Cash</option>        
    <option value="upi">UPI</option>    
    </select>    
    <br><br>    
    Transaction Number : 
    <input type="text" name="tid" disabled>    
    <br><br>    
    <input type="submit" value="Book Now" disabled>
    </form>
    <script type="text/javascript">
	    var today = new Date();
	    var dd = String(today.getDate()).padStart(2, '0');
	    var dd5 = String(today.getDate()+4).padStart(2, '0');
	    var mm = String(today.getMonth() + 1).padStart(2, '0');
	    var yyyy = today.getFullYear();
	    today = yyyy + '-' + mm + '-' + dd;
	    today5 = yyyy + '-' + mm + '-' + dd5;
	    $('#showdate').attr('min',today);
	    $('#showdate').attr('max',today5);
    </script>
    </body>

</html>