package src;

import java.util.ArrayList; // importar classe de outras bibliotecas
import java.time.LocalDate;
import java.util.HashSet;
import java.util.HashMap;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class Main { // classe principal
    public static void main(String[] args) throws Exception { // onde o programa começa - add throws para tratar exceções do Files
        //JV ser usado também via terminal, o args permite que o user envie valores ao iniciar o programa

        System.out.println("Hello World!");

        /*VARIABLES AND PRIMITIVE TYPES*/
        //type nameVariable = value;
        //var nameVariable = value;

        // integers
        byte variable1 = 127; // ocupa 8 bits (-128 a 127)
        short variable2 = 32767; // ocupa 16 bits (-32.768 a 32.767)
        int variable3 = 2147483647; // ocupa 32 bits na memória(-2.147.483.648 a 2.147.483.647)
        long variable4 = 9223372036854775807L; // ocupa 64 bits (-9.223.372.036.854.775.808 a 9.223.372.036.854.775.807)
        // decimal
        float teste1 = 39.20f; // 32 bits (poucas casas depois da vírgula)
        double teste2 = 3.1498; // 64 bits
        // string
        String name = "Isa";
        char genero = 'F'; // um caracter
        // boolean
        boolean pagamento = true;

        int num1 = 7; int num2 = 2;
        String soma = String.valueOf(num1 + num2);
        System.out.println("A soma entre "+ num1 +" e "+ num2 +" é: "+ soma);


        /*CONDITIONAlS*/
        //variaveis p teste
        byte b = 100;
        short s = 10000;
        int i = 14;
        long l = 100000L;
        float f = 10.5f;
        double d = 20.5;
        char c = 'A';
        String str = "Yuri";
        boolean bool = true;

        //isBlank() verifica se está vazia
        if(str.isBlank()){
            System.out.println("Verdadeiro");
        } else{
            System.out.println("Falso");
        }

        //equals() compara o conteúdo
        if(str.equals("YUri")){
            System.out.println("Verdadeiro");
        } else{
            System.out.println("Falso");
        }

        if(i >= 18){
            System.out.println("É maior de idade. Liberado sem acompanhante responsável");
        } else if(i >= 15) {
            System.out.println("É menor de idade. Liberado com acompanhante responsável");
        } else{
            System.out.println("Não liberado.");
        }

        /*VECTORS*/
        int[] colecaoInteiros = {1, 2, 3, 4, 5};
        int[] meusNumeros = new int[4]; // é preciso dizer o tamanho do vetor
        meusNumeros[1] = 23;

        System.out.println(colecaoInteiros[0]);
        System.out.println(colecaoInteiros.length);
        System.out.println(meusNumeros[1]);
        System.out.println(meusNumeros.length);

        /*ARRAY LIST*/
        // para funcionar tem que importar lá emcima(import java.util.ArrayList;)
        // lista dinâmica, permite add e remove itens de forma dinâmica
        // Valores do mesmo tipo. Tamanho definido na criação
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("João");
        nomes.add("Lucas");
        nomes.add("Adri");
        nomes.add("Isa");

        System.out.println(nomes);
        System.out.println(nomes.get(0));

        nomes.remove(0);
        System.out.println(nomes.get(0));

        nomes.remove("Isa");
        System.out.println(nomes);


        /*COLLECTIONS*/
        // import java.util.ArrayList; import java.util.HashSet; import java.util.HashMap;

        // LIST - permite elementos repetidos, tem ordem
        ArrayList<String> apelidos = new ArrayList<>();
        apelidos.add("João");
        apelidos.add("Lucas");
        apelidos.add("João"); // pode repetir
        System.out.println("Lista: " + apelidos);

        // SET - não permite repetidos, ordem não garantida
        HashSet<String> cores = new HashSet<>();
        cores.add("Azul");
        cores.add("Vermelho");
        cores.add("Azul"); // não entra de novo
        System.out.println("Set: " + cores);

        // MAP - pares chave e valor
        HashMap<String, Integer> idades = new HashMap<>();
        idades.put("João", 20);
        idades.put("Lucas", 25);
        System.out.println("Idade do João: " + idades.get("João"));

        /*OPERAÇÕES COM ARRAYS*/
        int[] numeros = {3, 1, 2};

        // Arrays.sort(numeros); // Ordena os elementos do array
        //Arrays.toString(numeros);  // Retorna uma string representando o array
        //Arrays.equals(numeros, new int[]{1,2,3});  // Compara se dois arrays são iguais

        java.util.Arrays.sort(numeros);
        System.out.println(java.util.Arrays.toString(numeros));
        System.out.println(java.util.Arrays.equals(numeros, new int[]{1,2,3}));


        /*MÉTODOS*/
        //String
        String texto = "  Java  ";

        texto.isBlank();            // Verifica se a string está vazia ou só com espaços
        texto.isEmpty();            // Verifica se a string está totalmente vazia ("")
        texto.equals("Java");       // Compara o conteúdo da string com outra
        texto.equalsIgnoreCase("java"); // Compara ignorando maiúsculas/minúsculas
        texto.contains("av");       // Verifica se a string contém o trecho especificado
        texto.startsWith("  J");    // Verifica se começa com o prefixo dado
        texto.endsWith("a  ");      // Verifica se termina com o sufixo dado
        texto.substring(2);         // Retorna parte da string a partir do índice dado
        texto.toUpperCase();        // Converte todos os caracteres para maiúsculas
        texto.toLowerCase();        // Converte todos os caracteres para minúsculas
        texto.trim();               // Remove espaços do início e fim
        texto.replace("a", "x");    // Substitui um caractere ou trecho por outro
        texto.split(" ");           // Divide a string com base no separador indicado
        texto.charAt(2);            // Retorna o caractere na posição indicada
        texto.length();             // Retorna o tamanho da string

        //Object
        Object obj1 = new Object();
        Object obj2 = obj1;

        obj1.equals(obj2);          // Compara se dois objetos são iguais
        obj1.hashCode();            // Retorna o código hash do objeto (para coleções)
        obj1.toString();            // Retorna a string que representa o objeto - java.lang.Object@75b84c92
        obj1.getClass();            // Retorna a classe do objeto em tempo de execução - class java.lang.Object


        /*OPERAÇÕES MATEMÁTICAS*/
        Math.max(10, 20);           // Retorna o maior valor
        Math.min(10, 20);           // Retorna o menor valor
        Math.abs(-5);               // Retorna o valor absoluto
        Math.pow(2, 3);             // Calcula a potência (2 elevado a 3)
        Math.sqrt(16);              // Retorna a raiz quadrada
        Math.round(4.6);            // Arredonda para o inteiro mais próximo
        Math.floor(4.6);            // Arredonda para baixo
        Math.ceil(4.2);             // Arredonda para cima
        Math.random();              // Retorna um número aleatório entre 0.0 e 1.0

        /*LOCALDATE*/
        LocalDate hoje = LocalDate.now();              // Obtém a data atual
        LocalDate aniversario = LocalDate.of(2025, 6, 4); // Cria uma data específica

        System.out.println(hoje.isBefore(aniversario)); // Verifica se a data atual é anterior
        System.out.println(hoje.plusDays(5));  // Soma dias à data
        System.out.println(hoje.getDayOfWeek()); // Retorna o dia da semana

        /*FILES AND PATH*/
        Path caminho = Paths.get("exemplo.txt");

        System.out.println(Files.exists(caminho)); // Verifica se o arquivo existe
        System.out.println(Files.isDirectory(caminho)); // Verifica se é um diretório
        System.out.println(Files.readAllLines(caminho)); // Lê todas as linhas de um arquivo como lista
        Files.write(caminho, List.of("linha1", "linha2")); // Escreve linhas no arquivo

    }

}
