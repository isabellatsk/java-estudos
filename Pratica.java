package src;

public class Pratica{
    public static void main(String[] args){

        int num1 = 1;
        float num2 = 40.50f;
        char caracter1 = 'G';
        String  nome = "Yuri";
        System.out.println(num1 + ", " + num2 + ", " + caracter1 + ", " + nome);


        int n1 = 10;
        int n2 = 32;
        int soma = (n1 + n2);
        System.out.println(soma);


        boolean temChuva =  true;
        if (temChuva){
            System.out.println("Leve guarda-chuva");
        } else{
            System.out.println("Não precisa de guarda-chuva");

        }


        char inicial = 'I';
        System.out.println("Minha inicial é "+ inicial);


        double decimal = 409.89;
        System.out.println(Math.floor(decimal));
        System.out.println(Math.ceil(decimal));
        System.out.println(Math.round(decimal));


        String cartao = " POSITIVO ";
        System.out.println(cartao);
        System.out.println(cartao.trim());

        int[] vetor = {2, 3, 6, 8};
        System.out.println((vetor.length));
        System.out.println(vetor[0]);
        System.out.println(vetor[vetor.length - 1]);
    }
}
