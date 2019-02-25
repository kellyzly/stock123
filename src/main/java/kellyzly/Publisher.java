package kellyzly;

public class Publisher{

     private Observer observer = null;
      public void notifyStockData(String code, StockData stockData){
        if( observer!= null){
            observer.notifyStockData(code,stockData);
        }

      }

      public void setObserver(Observer observer){
          this.observer = observer;
      }

        public Observer getObserver() {
            return observer;
        }
    }
