package com.rabbitmq.springrabbitmqconsumer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExchangeData {

    private Date exchangeDate;
    private List<Market> exchangeData;
}
