package academy.backend.market_pulse.filter;

import academy.backend.market_pulse.model.Instrument;

public class FilterByTicker implements InstrumentFilter{

    private final String ticker;

    public FilterByTicker(String ticker){
        this.ticker = ticker;
    }

    @Override
    public boolean matches(Instrument instrument){
        String instrumentTicker = instrument.getTicker();

        return  instrumentTicker.equals(ticker);
    }
}
