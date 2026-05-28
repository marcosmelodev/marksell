package br.com.marcos.marksell.entities.enums;

public enum OrderStatus {

    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private int code;

    //construtor de enum é private
    private OrderStatus(int code){
        this.code = code;
    }

    //acessa o construtor privado
    public int getCode(){
        return code;
    }

    //converter um valor numérico para enumerado
    public static OrderStatus valueOf(int code){
        for(OrderStatus value : OrderStatus.values()){
            if (value.getCode() == code){
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus code");
    }


}
