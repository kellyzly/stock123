package kellyzly;



public class StockData {
    private SystemType systemType;
    private String LAST_TRADING_DATE;
    private String DELIVERY_DATE;
    private String MARKET;
    private String LABEL;


    public StockData(String lastTradingString, String deliveryString,  String market, String label,
                     SystemType systemType){
     this.LAST_TRADING_DATE = lastTradingString;
     this.DELIVERY_DATE = deliveryString;
     this.MARKET = market;
     this.LABEL = label;
     this.systemType = systemType;

    }

    public String getLAST_TRADING_DATE() {
        return LAST_TRADING_DATE;
    }

    public void setLAST_TRADING_DATE(String  LAST_TRADING_DATE) {
        this.LAST_TRADING_DATE = LAST_TRADING_DATE;
    }

    public String getDELIVERY_DATE() {
        return DELIVERY_DATE;
    }

    public void setDELIVERY_DATE(String DELIVERY_DATE) {
        this.DELIVERY_DATE = DELIVERY_DATE;
    }

    public String getMARKET() {
        return MARKET;
    }

    public void setMARKET(String MARKET) {
        this.MARKET = MARKET;
    }

    public String getLABEL() {
        return LABEL;
    }

    public void setLABEL(String LABEL) {
        this.LABEL = LABEL;
    }



//    public int compareTo(Object o) {
//        int ret = 1;
//
//        StockData other = (StockData)o;
//
//         if( this.getLAST_TRADING_DATE().compareTo(other.getLAST_TRADING_DATE())   == 0) {
//             ret = this.getDELIVERY_DATE().compareTo(other
//                     .getDELIVERY_DATE());
//
//         }
//
//         return ret;
//    }


    public SystemType getSystemType() {
        return systemType;
    }

    public void setSystemType(SystemType systemType) {
        this.systemType = systemType;
    }


    @Override
    public String toString() {
        return "|  LAST_TRADING_DATE | DELIVERY_DATE |  MARKET  | LABEL                 |  TRADABLE       |" +"\n"+

                "|" +getLAST_TRADING_DATE() +" |"+ getDELIVERY_DATE()+"|"+ getMARKET()+" |"+getLABEL()+"|"
                + (getSystemType() == SystemType.PRIME? "FALSE":"TRUE")+"|";

    }
}
