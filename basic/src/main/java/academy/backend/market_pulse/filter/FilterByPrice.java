package academy.backend.market_pulse.filter;

import academy.backend.market_pulse.model.Instrument;
import academy.backend.market_pulse.model.Stock;

import java.math.BigDecimal;

public class FilterByPrice implements  InstrumentFilter{

    private final BigDecimal price;

    public FilterByPrice(BigDecimal price){
        this.price = price;
    }

    @Override
    public boolean matches(Instrument instrument){
        switch (instrument){
            case Stock stock:
                BigDecimal stockPrice = stock.getDividendYield();
                return stockPrice.equals(price);

            default:
                return false;
        }


    }
}
