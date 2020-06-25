# orderItem



https://github.com/bagoud/order.git
https://github.com/bagoud/orderItem.git


Url for Retrieving Orders: http://localhost:8081/orders/1001
Url for Creating   Orders: http://localhost:8081/orders/

JSON: 

{
  "orderid": 1003,
  "customerName": "Dhoni",
  "orderDate": "2020-06-25T10:00:16.961+00:00",
  "shippingAddress": "Jharkand",
  "orderItems": [
    {
      "orderId": 1003,
      "quantity": "1",
      "productName": "Keyboard",
      "productCode": 104
    }
  ]
}

TODO:

1. Exception Handling
2. Input validation
