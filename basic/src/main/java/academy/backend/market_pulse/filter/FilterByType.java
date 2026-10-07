package main.java.academy.backend.market_pulse.filter;

import academy.backend.market_pulse.filter.InstrumentFilter;
import academy.backend.market_pulse.model.Instrument;
public class FilterByType implements InstrumentFilter {

    private final String filterType;

    public FilterByType(String currencyType){
        this.filterType = currencyType;
    }
    @Override
    public boolean matches(Instrument instrument){
        String instrumentType = instrument.getType();
        return instrumentType.equals(filterType);
    }
}
