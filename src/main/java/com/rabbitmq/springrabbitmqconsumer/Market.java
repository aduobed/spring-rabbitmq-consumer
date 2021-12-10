package com.rabbitmq.springrabbitmqconsumer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Market {

    @JsonProperty("LAST_TRADED_PRICE")
        private String LAST_TRADED_PRICE;

    @JsonProperty("SELL_LIMIT")
        private String SELL_LIMIT;

       @JsonProperty("BID_PRICE")
        private String BID_PRICE;

    @JsonProperty("ASK_PRICE")
        private String ASK_PRICE;

    @JsonProperty("BUY_LIMIT")
        private String BUY_LIMIT;

    @JsonProperty("TICKER")
        private String TICKER;

    @JsonProperty("MAX_PRICE_SHIFT")
        private String MAX_PRICE_SHIFT;

    @Override
    public String toString() {
        return "{" +
                "LAST_TRADED_PRICE='" + LAST_TRADED_PRICE + '\'' +
                ", SELL_LIMIT='" + SELL_LIMIT + '\'' +
                ", BID_PRICE='" + BID_PRICE + '\'' +
                ", ASK_PRICE='" + ASK_PRICE + '\'' +
                ", BUY_LIMIT='" + BUY_LIMIT + '\'' +
                ", TICKER='" + TICKER + '\'' +
                ", MAX_PRICE_SHIFT='" + MAX_PRICE_SHIFT + '\'' +
                '}';
    }
}