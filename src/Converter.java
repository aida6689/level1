public class Converter {
    public static String converter (int dollar, String currency){
        switch(currency){
            case "yen":
                return (dollar * 121.03) + " yen";
            case "euro":
                return (dollar * 0.91) + " euro";
            case "lira":
                return (dollar * 14.15) + " lira";
        }
        return currency;
    }


    public static void main(String[] args) {
        System.out.println(converter(1,"yen"));
    }
}
