package entities;

import entities.enums.OrderStatus;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDateTime moment;
    private OrderStatus status;
    
    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    StringBuilder sb = new StringBuilder();
    DateTimeFormatter format02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    
    public Order() {
    }

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    
    public void addItem(OrderItem item) {
        items.add(item);            
    }
    
    public void removeItem(OrderItem item) {
        items.remove(item);
    }
    
    public Double total(){
        double soma = 0.0;
        for(OrderItem item : items){
           soma += item.subTotal();
        }
        return soma;
    }
    
    @Override
    public String toString(){
               sb.append("ORDER SUMMARY: \n");
               sb.append("Order moment: " + moment.format(format02) + "\n");
               sb.append("Order status: " + status + "\n");
               sb.append("Client: " + client + "\n");
               sb.append("Order items: \n");
               for(OrderItem item : items){
                    sb.append(item + "\n");
               }
               sb.append("Total price: " + total());
               return sb.toString();
    }
}
