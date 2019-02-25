package kellyzly;

import java.text.ParseException;


/**
 * Hello world!
 *
 */
public class App 
{


    private Publisher publisher = null;

    private Observer observer = null;

    public App(Publisher publisher, Observer observer) {
        this.publisher = publisher;
        this.observer = observer;
    }

    public void notifyStockData(String  code, StockData stockData){
        publisher.notifyStockData(code,stockData);
    }


    public Observer getObserver() {
        return observer;
    }

    public void setObserver(Observer observer) {
        this.observer = observer;
    }

    public static void main(String[] args ) throws ParseException {
        Publisher publisher  = new Publisher();
        Observer observer = new Observer();
        publisher.setObserver(observer);
        App app = new App(publisher, observer);


        StockData stockData_prime = new StockData("15-03-2018",
                 "17-03-2018", "PB","Lead 13 March 2018",SystemType.PRIME
                );

        StockData stockData_lme = new StockData("14-03-2018",
                "16-03-2018", "PB","Lead 13 March 2018",SystemType.LME
        );


        app.notifyStockData("PB_03_2018",stockData_prime);
        app.notifyStockData("PB_03_2018", stockData_lme);



    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
}

