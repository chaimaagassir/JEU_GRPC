package ma.enset.server;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import ma.enset.services.NbrMgService;

import java.util.Random;


import java.util.Random;

public class GrpcServer {

    public static void main(String[] args) throws Exception {
        int randomNum = new Random().nextInt(1000) + 1;
        Server server = ServerBuilder.forPort(800)
                .addService(new NbrMgService(randomNum))
                .build();
        server.start();
        System.out.println("Le serveur est démarré avec le nombre aléatoire : " + randomNum);
        server.awaitTermination();
    }
}

