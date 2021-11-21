Feature: Logic for order creation


  Scenario Outline: Market order
    Given a client creates a market "<operation>" order
    Then the order is set to INITIALIZED
    And the order is executed at market price

    Examples:
      | operation |
      | sell      |
      | buy       |

  Scenario Outline: Limit order
    Given a client creates a "<operation>" limit order
    And the limit is set to <limitPrice>
    Then the order is set to INITIALIZED
    And the transaction is hold until the price limit is met

    Examples:
      | operation | limitPrice |
      | sell      | 50         |
      | buy       | 100        |

  Scenario Outline: Stop Limit order executed
    Given a client creates a "<operation>" stop limit order
    And the limit is set to <limitPrice>
    And the stop  is set to <stopPrice>
    When the <stopPrice> is hit
    And the <limitPrice> is reached or higher
    Then the order is set to INITIALIZED
    And the transaction is executed
    And a second transaction for journal purposes is created

    Examples:
      | operation | limitPrice | stopPrice |
      | sell      | 45         | 50        |
      | buy       | 55         | 50        |


  Scenario Outline: Stop Limit order not executed
    Given a client creates a "<operation>" stop limit order
    And the limit is set to <limitPrice>
    And the stop  is set to <stopPrice>
    When the <stopPrice> is hit
    And the <limitPrice> is not reached
    Then the order is set to INITIALIZED
    And the transaction is not executed

    Examples:
      | operation | limitPrice | stopPrice |
      | sell      | 68         | 70        |
      | buy       | 52         | 50        |



