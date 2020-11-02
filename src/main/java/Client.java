
import de.proto.order.OrderServiceGrpc;
import de.proto.order.Orderrequest;
import de.proto.order.ProductRequest;
import de.proto.order.ProductResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
public class Client {

    public static void main(String[] args) {

        System.out.println("Hello Im a Client");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        System.out.println("Creating stub");


        //created a service client (blocking - synchronous)
        OrderServiceGrpc.OrderServiceBlockingStub orderClient = OrderServiceGrpc.newBlockingStub(channel);

/*
        // Unary
        ProductRequest productRequest = ProductRequest.newBuilder()
                .setId("11")
                .build();

        System.out.println("test");

        //call the RPC and get back a GreetResponse
        ProductResponse productResponse = orderClient.showProduct(productRequest);

        System.out.println("test");

        System.out.println(productResponse.getProductName());
        System.out.println(productResponse.getPrice());*/

        //Server Streaming
        Orderrequest orderrequest = Orderrequest.newBuilder()
                .setId("1")
                .build();

        orderClient.showOrder(orderrequest)
                .forEachRemaining(orderResponse -> {
                    System.out.println(orderResponse.getProduct().toString());
                });


        channel.shutdown();
    }
    }

