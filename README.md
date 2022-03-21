//Fleet Controller

GET METHOD:

http://localhost:9090/FleetController/viewAllFleet

OUTPUT:

{ { "FleetId": "1", "code": "440010",  "model": "147" , "TotalEconomySeats": "50" , "TotalPremiumSeats": "80" , "TotalBuisnessSeats" : "70"} }


POST METHOD:

http://localhost:9090/FleetController/addFleet

{ { "FleetId": "2", "code": "440060",  "model": "343" , "TotalEconomySeats": "80" , "TotalPremiumSeats": "50" , "TotalBuisnessSeats" : "80"} }

 PUT METHOD:
 
http://localhost:9090/FleetController/updateFleet

OUTPUT:

{ { "FleetId": "3", "code": "440050",  "model": "145" , "TotalEconomySeats": "54" , "TotalPremiumSeats": "60" , "TotalBuisnessSeats" : "50"} }



DELETE METHOD:

http://localhost:9090/FleetController/removeFleet

OUTPUT:

{ { "FleetId": "5", "code": "440030",  "model": "137" , "TotalEconomySeats": "70" , "TotalPremiumSeats": "90" , "TotalBuisnessSeats" : "50"} }

