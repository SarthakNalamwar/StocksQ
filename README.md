**StocksQuotes**

StartFragment
Overview
The Stock Quotes API provides endpoints to retrieve real-time and historical stock data. It supports fetching stock quotes by individual symbols, getting batch quotes for multiple symbols, and retrieving historical options data. The API is secured with Basic Authentication, requiring users to authenticate before accessing the endpoints.
Base URL
All endpoints are prefixed with /api/stocks.
Example Base URL: https://your-domain.com/api/stocks
Authentication
Type: HTTP Basic Authentication
Required: Yes
Description: All endpoints require authentication via Basic Auth. Clients must provide a valid username and password in the Authorization header of each request.
StartFragment
Start the Application: Upon starting the application, a password will be generated and printed in the logs.

The API uses Basic Authentication to secure its endpoints. The following details describe the authorization process:Steps to Authenticate:EndFragment



Plain Text








- **Username**: `user1`
- **Password**: 'password'


2. Use Postman for Authentication:
In Postman, navigate to the Authorization tab.
Select Basic Auth from the dropdown menu.
Enter user as the Username.
Enter 'password' as the Password
Proceed to make authenticated requests to the API endpoints.

EndFragment

**GET BY SYMBOL**
StartFragment
Method: GET
Description: Retrieves the stock quote for a specified stock symbol.
Request Parameters:
symbol (String): The stock symbol for which the quote is requested.

Responce:
JSON

{
    "01. symbol": "IBM",
    "02. open": 199.11,
    "03. high": 202.17,
    "04. low": 198.73,
    "05. price": 202.13,
    "06. volume": 4750999,
    "07. latest trading day": "2024-08-30",
    "08. previous close": 198.9,
    "09. change": 3.23,
    "10. change percent": "1.6239%"
}


EndFragment

GET BY BATCH

StartFragment
Method: POST
Description: Retrieves stock quotes for a batch of stock symbols.
Request Parameters:
symbols (String): A comma-separated list of stock symbols.

Responce:

JSON
[
    {
        "01. symbol": "AAPL",
        "02. open": 230.19,
        "03. high": 230.4,
        "04. low": 227.48,
        "05. price": 229.0,
        "06. volume": 52990770,
        "07. latest trading day": "2024-08-30",
        "08. previous close": 229.79,
        "09. change": -0.79,
        "10. change percent": "-0.3438%"
    },
    {
        "01. symbol": "IBM",
        "02. open": 199.11,
        "03. high": 202.17,
        "04. low": 198.73,
        "05. price": 202.13,
        "06. volume": 4750999,
        "07. latest trading day": "2024-08-30",
        "08. previous close": 198.9,
        "09. change": 3.23,
        "10. change percent": "1.6239%"
    },
    {
        "01. symbol": "GOOG",
        "02. open": 164.22,
        "03. high": 165.28,
        "04. low": 163.41,
        "05. price": 165.11,
        "06. volume": 18498777,
        "07. latest trading day": "2024-08-30",
        "08. previous close": 163.4,
        "09. change": 1.71,
        "10. change percent": "1.0465%"
    }
]


EndFragment




 
 
