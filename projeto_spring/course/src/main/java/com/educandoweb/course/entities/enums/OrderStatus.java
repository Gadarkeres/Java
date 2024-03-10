package com.educandoweb.course.entities.enums;

public enum OrderStatus {

    WAITTING_PAYMENT(0), // como se fosse 0
    PAID(1), // como se fosse 1
    SHIPPED(2),
    DELIVERED(3),
    CANCELED(4);

    private int code;

    private OrderStatus (int code){
        this.code = code;
    }

    public int getCode(){
        return code;
    }

    public static OrderStatus valueOf(int code){ // static funciona sem precisar instanciar
        for (OrderStatus value : OrderStatus.values()){
            if (value.getCode() == code){ // se o valor for igual ao código retorna o enum correspondente.
                return value;
            }
        }
        throw new IllegalArgumentException("Código invalido"); // se o código for inválido
    } 

}
