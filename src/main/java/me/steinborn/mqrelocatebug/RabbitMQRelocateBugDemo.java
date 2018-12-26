package me.steinborn.mqrelocatebug;

import com.rabbitmq.client.impl.ClientVersion;

public class RabbitMQRelocateBugDemo {
    public static void main(String... args) {
        System.out.println(ClientVersion.VERSION);
    }
}
