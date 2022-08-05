# Problem Statement - Sales Data Analysis

Sales analysis is done at regular intervals by sales ​
managers of large organizations. Studying and analyzing past sales records, helps them decide the products their teams need to focus on and understand the likes and dislikes of their customers more effectively.​
In this challenge, you need to build an analyzer to analyze the historical sales data of an e-commerce website, ​
which is available as a CSV (Comma Separated Value) file.

The file contains the following information:​

- date – It contains the date of the purchase.​
- customer_id – It contains the customer_id of the customer who has purchased the product.​
- product_category – It contains the category_id of the product being sold.​
- payment_method - This can have only two values, credit for credit card payment and paypal for payments made through PayPal.​
- value – It contains the sales amount in USD.​
- time_on_site – This contains the amount of time a customer has spent on the e-commerce site.​
- clicks_in_site – It contains the number of clicks a user has made while accessing a site. This value is captured to see how many products a customer has visited before making a purchase decision.​

- Create a class to hold the sales record of individual products called SalesData and declare attributes as specified in the csv file. ​
- Use appropriate data types for all the variables​
- Write it as a well encapsulated class.​
- Override the toString() method.​
- Write a parameterized constructor.​
- Create an implementation class called as SalesDataAnalyzer​
- Write the below method to read the CSV file that contains data of the sales record

  **public List<SalesRecord> readFile(String fileName)**

- In the readFile method:​

  - Read the file line by line, using the FileReader and BufferedReader classes.​
  - Declare a salesData list that will hold objects of SalesRecord.​
  - Iterate through the salesData list and add the values to it.​
  - Parse the values as required and add it to the SalesData object.
  - Display all the records.​
  - Handle all exceptional situations that might occur while reading the file and parsing the values.​

- In the implementation class SalesDataAnalyzer​
- Write the below method to sort the sales records in descending order of purchase amount.​

**public List<SalesRecord> getAllCustomersSortedByPurchaseAmount(List<SalesRecord> salesData, AmountComparator amountComparator)**​

- The method takes the list of all sales records as an argument.​
- Use the Collections.sort method and sort the list, use the Comparator as an anonymous class in the sort method.​
- Simplify the code using lambdas.​
- The method returns the sorted list.

- In the implementation class SalesDataAnalyzer​
- Write the below method to find the customer who spent maximum amount of time on the ecommerce website​

  **public SalesRecord getTopCustomerWhoSpentMaxTimeOnSite(List<SalesRecord> salesData)​**​

- The method takes the list of all sales records as an argument.​
- Use a Comparator as an anonymous class and simplify the code using lambdas.​
- Return the first SalesRecord object that will give the customer who has spent maximum time on the website.​

​

​

​

​
​
