package decisionMaking;

public class nested_If {
    public static void main(String[] args)
    {
        String address="Delhi, Kolkata, India";
        if (address.endsWith("India"))
            if(address.contains("Meerut")) System.out.println("Your city is Meerut");
            else if(address.contains("Noida")) System.out.println("Your city is Noida");
            else System.out.println(address.split(",")[1]);
        else System.out.println("You are not from India");
    }
}
