# QA Challenge 

Please do not work longer than a few hours on this assignment. Do not hesitate to write us and ask any questions if you have doubts 
about the assignment. If you don’t manage to complete the challenge, please write a short text in your response email on what you 
would want to do to finish the challenge. 

In CryptoBroker, we develop a web trading platform for cryptocurrencies, using a microservices' architecture. 
Most of our functionality is based on Java and reactive RESTful interfaces. As front-end we use the Angular framework. The challenge consists out of 2 assignments:

1. Requirements analysis and test cases definition.
2. Technical skills, in the form of designing and developing unit test.

# 1. Requirements analysis

Your goal in this challenge is to define test cases based on the below requirements, feel free to describe the test cases in any 
form you like (for example text, or a diagram, or some tools that you are familiar with):

*Update the logic for order creation, so we can provide the most common order types.*

To do: After an order is created, the corresponding transaction is set to INITIALIZED. There are different type of orders, namely: market order, limit and stop limit. 

1. In case of a *market order*, and the transaction is executed immediately at the market price so no price needs to be set. 
2. In case of a *limit order* the limit price needs to be set, and the transaction is hold till the price limit is met.
3. Finally, for a *stop limit order*, we got a stop and limit price, whenever the stop price is hit, and the limit price is reached or higher, the transaction is executed (in case of selling). 
   However, for a stop limit order we create two transactions, the second transaction is for journal purposes.

# 2. Technical skills

The challenge consists of a simple Java-Maven app that calculates the fees for a given list of orders.
Go through the code, understand the purpose of each class and *design and implement the unit test cases you consider convenient for OrderServiceImpl*.

The current setup provides as a dependency the jUnit 4.12 testing library, so you can use it directly, but you don't have to. 
Feel free to use a posterior JUnit version or a different testing library/framework.
 

# Evaluation

In order to evaluate the result we will take into account the following aspects:

* Test case identification 
* Correct understanding of the given requirements
* Communication and collaboration skills

Good luck!

