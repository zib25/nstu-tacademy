package academy.backend.market_pulse.filter;

import academy.backend.market_pulse.model.Currency;
import academy.backend.market_pulse.model.Instrument;

public class FilterByCurrency implements InstrumentFilter{
    private final Currency currency;

    public FilterByCurrency(Currency currency){
        this.currency = currency;
    }

    @Override
    public boolean matches(Instrument instrument){
        Currency instrumentCurrency = instrument.getCurrency();

        return  instrumentCurrency.equals(currency);
    }
}
