package academy.backend.market_pulse.filter;

import academy.backend.market_pulse.model.Instrument;

public class FilterByType implements InstrumentFilter{

    private final String targetType;

    public FilterByType(String targetType){
        this.targetType = targetType;
    }

    @Override
    public boolean matches(Instrument instrument){
        String instrumentType = instrument.getType();

        return  instrumentType.equals(targetType);

    }

}
