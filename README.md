

---

# **Stock Quotes API**

The **Stock Quotes API** provides real-time and historical stock data. It allows retrieving quotes for individual stock symbols, batch stock quotes for multiple symbols, and historical options data. All endpoints are secured with Basic Authentication.

## **Base URL**
- All API requests are prefixed with `/api/stocks`
- Example Base URL: `https://your-domain.com/api/stocks`

## **Authentication**
- **Type**: HTTP Basic Authentication
- **Required**: Yes
- **Description**: Authentication via Basic Auth is required for all endpoints. Clients must provide a valid username and password in the `Authorization` header of each request.

### **Authentication Details**
- **Username**: `user1`
- **Password**: `password`

### **Authentication via Postman**
1. Open Postman and navigate to the **Authorization** tab.
2. Select **Basic Auth** from the dropdown.
3. Enter `user1` as the **Username**.
4. Enter `password` as the **Password**.
5. Proceed to make authenticated requests to the API.

## **API Endpoints**

### **GET Stock Quote by Symbol**
- **Method**: `GET`
- **Description**: Retrieves the stock quote for a specific stock symbol.
- **Request Parameters**:
  - `symbol` (String): The stock symbol for which the quote is requested.

#### **Response (Example)**
```json
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
```

---

### **POST Batch Stock Quotes**
- **Method**: `POST`
- **Description**: Retrieves stock quotes for a batch of symbols.
- **Request Parameters**:
  - `symbols` (String): A comma-separated list of stock symbols.

#### **Response (Example)**
```json
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
```

---

