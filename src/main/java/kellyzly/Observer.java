package kellyzly;

import java.util.HashMap;
import java.util.Map;

public class Observer{
        private Map<String, StockData> memoryStore = new HashMap<String, StockData>();

        public void notifyStockData(String exchangeCode,StockData newStockData){
         if( memoryStore.containsKey(exchangeCode)){
             StockData oldStockData =   memoryStore.get(exchangeCode);
             if( newStockData.getSystemType() == SystemType.LME && oldStockData.getSystemType()== SystemType.PRIME){
              //We trust/use the last trading date and delivery date from the LME exchange over that of PRIME.
                 memoryStore.put(exchangeCode, newStockData);

               //  System.out.println(newStockData.toString());
             }
         }else{
             memoryStore.put(exchangeCode, newStockData);

            // System.out.println(newStockData.toString());
         }

        }

    public Map<String, StockData> getMemoryStore() {
        return memoryStore;
    }
}