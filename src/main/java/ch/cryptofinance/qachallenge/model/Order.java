package ch.cryptofinance.qachallenge.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private String id;
    private CurrencyType currency;
    private Double amount;
    private Double feePercentage;
}
