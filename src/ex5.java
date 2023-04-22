public class ex5 {
    public static void main(String[] args){

        System.out.println("Digite uma palavra: ");
        String original = "String invertida";
            
        String reversed = "";
        for (int i = original.length() - 1;  0 <= i; i--) {
            reversed += original.charAt(i);
        }

        System.out.println(reversed);
           
    }
}
