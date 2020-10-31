
import de.proto.greet.OrderServiceGrpc;
import de.proto.greet.ProductRequest;
import de.proto.greet.ProductResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Client {

    public static void main(String[] args) {

        System.out.println("Hello Im a Client");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        System.out.println("Creating stub");


        //created a greet service client (blocking - synchronous)
        OrderServiceGrpc.OrderServiceBlockingStub orderClient = OrderServiceGrpc.newBlockingStub(channel);


        //do the same for a greet Request
        ProductRequest productRequest = ProductRequest.newBuilder()
                .setId("11")
                .build();

        System.out.println("test");

        //call the RPC and get back a GreetResponse
        ProductResponse productResponse = orderClient.showProduct(productRequest);

        System.out.println("test");

        System.out.println(productResponse.getProductName());
        System.out.println(productResponse.getPrice());

        // do something
        System.out.println("Shutting down channel");

        channel.shutdown();
    }
    }

