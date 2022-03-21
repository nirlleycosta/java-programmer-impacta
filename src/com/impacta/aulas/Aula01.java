package com.impacta.aulas;

/* Aula 01 - Impacta Treinamentos
 *
 * Essa aula é um resumo da apostila 1 página 30 até 50.
 *
 * */

public class Aula01 {

    public static void main(String[] args) {

        /*Sobre tipos de dados, os literais, os primitivos e variáveis.

         Há 2 categorias de tipos em Java

         1° categoria, o tipo - Primitivos*/

        byte b = 1; // 1 byte/8 bits, abrange -128 to 127, numeros inteiros e pode economizar memória em arrays longos.
        short s = 2; // 2 bytes/16 bits, abrange -32.768 to 32.767, numeros inteiro e também podem lhe poupar memória.
        int a = 30; // 4 bytes/32 bits, abrange -2.147.483.648 to 2.147.483.647, valor padrão para inteiros.
        long l = 40; // 8 bytes/64 bits, abrange -9.223.372.036.854.775.808 to +mesmovalor, números inteiros, muito maior que o int.
        float f = 5.0f; // 8 bytes/32 bits, abrange -3.40292347e+38 to 3.40292347e+38, ponto flutante, pode ser usado em arrays de ponto flutuante, mas não funciona para valores precisos.
        double d = 6.0; // 8 bytes/64 bits, abrange 1.79769313486231570E+308 ponto flutuante e geralmente é o tipo padrão para decimais. Também não funciona para valores precisos.
        char c = 'c'; // 2 bytes/ 16 bits, "/u0000" to "\uFFFF", caracteres textuais representa tudo pelo código unicode.
        boolean boo = true; // 1 bit, true or false, booleano, indica condições falsas ou verdadeiras.

        // Agora vamos utilizá-los em demonstrações

        System.out.println("Meu byte é: " + b);
        System.out.println("Meu short é: " + s);
        System.out.println("Meu int é: " + a);
        System.out.println("Meu float é: " + l);
        System.out.println("Meu float é: " + f);
        System.out.println("Meu double é: " + d);
        System.out.println("Meu char é: " + c);
        System.out.println("Meu boolean é: " + boo);

        /*Literais.
         Um literal é uma representação, em código fonte de um valor fixo. Eles não necessitam de nenhuma operação computacional
         para serem representados, isso ocorre de forma direta no código. Literais podem ser atribuídos aos tipos primitivos.*/

        byte b_literal = 100;
        short s_literal = 0100;
        int i_literal = 0x100;
        long l_literal = 100L;
        float f_literal = 0.000123f;
        double d_literal = 123d;
        char c_literal = '\u0022';
        boolean boo_literal = true;

        // Vamos separá-los em 4 formas.

        /*Decimal (Base 10)
         Dígitos de 0-9 são permitidos nessa forma*/
        int x_base10 = 101; // // então 100 é literal
        System.out.println(x_base10);

        /*Octal (Base 8)
        Dígitos de 0-7 são permitidos, sempre devem ter o prefixo 0.*/
        int x_base8 = 0146;
        System.out.println(x_base8);

        /*Hexa-Decimal (Base 16)
        Dígitos de 0-9 são permitidos e também caracteres de a-f e maíusculas A-F.*/
        int x_hexaDecimal = 0X123Face;
        System.out.println(x_hexaDecimal);

        /*Binário
        Um literal desse tipo deve ter o prefixo ob e oB, de 1.7 pode-se também literais binários, ou seja, 0 e 1.*/
        int x_binario = 0b1111;
        System.out.println(x_binario);

        // Caracteres de escape
        // Caractere (ou sequência) de escape              Descrição
        // \’                                        Aspas simples (apóstrofo)
        // \”                                             Aspas duplas
        // \\                                            Barra invertida
        // \r                                         Caractere de retorno
        // \n                                    Nova linha (alimentação de linha)
        // \f                                        Alimentação de formulário
        // \t                                                Tabulação
        // \v                                            Tabulação vertical
        // \b                                                Backspace

        /* Variáveis

          Variável é um espaço na memória utilizado para armazenar temporariamente um valor.
          Identificada por um nome, a variável contém um identificador e um tipo, podendo ter um inicializador opcional.
          A visibilidade e a duração de tempo de uma variável são definidas pelo escopo.
          O valor que uma variável recebe é determinado pelo programa.
          Elas podem possuir modificadores ou qualificadores opcionais que conferem comportamento diferenciado,
          conforme a necessidade do programa. Elas também podem ser declaradas com o qualificador final,
          para que sejam uma constante, tome o PI como um exemplo de uso, teriámos uma constante.

          As variáveis podem ser simples, se armazenarem apenas um valor por vez, ou compostas,
          se armazenarem dois ou mais valores, identificados em posições por um índice.

          Por suas características, as variáveis possuem duas funções básicas:

          - Podem servir para ação,
          já que uma variávek oide ser modificada para obter determinado resultado durante o processamento do programa.

          - Podem servir para controle, já que durante o processamento é possível acompanhar ou vigiar a variável.

          A variável sempre estará dentro de um escopo, refere-se ao limite ou ciclo de vida de um objeto. O escopo é criado sempre
          que um novo bloco é iniciado e permite que outros programas visualizem ou não certos objetos, além de estipular o seu tempo
          de duração.
         **/

        // Definindo uma variável

        // <tipo> <nomeVariavel>;
        // <tipo> <nomeVariável> = <valor>;
        // <tipo> <nomeVariável1>, <nomeVariável2>;
        // <tipo> <nomeVariável1> = <valor>, <nomeVariável2> = <valor>;

        /* Casting
         O casting é a conversão entre variáveis de tipos primitivos, ocorre de forma natural sempre que precisamos utilizar
         um valor "pequeno" em uma variável ou parâmetro de tipo "maior"*/

        int ano = 2014;
        int anoAtual = ano;
        float salarioMinimo = 2000.15f;
        double salarioTotal = salarioMinimo;

        // Se você tentar o oposto ocorrerá um erro de compilação que deve ser corrigido com o casting.

        long nascimento = 1992;
        int idade = (int) nascimento;

        double altura = 1.75;
        float imc = (float) altura;


        // 2° categoria, o tipo - Referência

        // Tipo String
        String referencia = "O tipo String representa uma classe que encapsula sequências de caracteres, a variável possui um " +
                "objeto imutável tipo String";

        /*Tipo Enum
         Enum é um tipo de dados especial que permite que uma variável assuma qualquer valor de um conjunto predefinido de
         constantes. A variável deve assumir, obrigatoriamente, um dos valores definidos neste conjunto. Você pode modificar
         o seu acesso. Convencionalmente por serem constantes os nomes dos campos de uma são escritas em Maiúsculo.*/
        enum DiaDaSemana {
            SEGUNDA,TERCA,QUARTA,QUINTA,SEXTA,SABADO,DOMINGO;
        }

        // Usando o Enum
        DiaDaSemana diaBom = DiaDaSemana.DOMINGO;
        System.out.println("Dia bom é " + diaBom.name());

        /*Tipo Classes Wrapper
         Cada um dos 8 tipos primitivos possuem uma classe correspondente. Essas classes são chamadas de Wrapper (envelope) pois
         encapsulam o tipo primitivo em um objeto.

         As classes Wrapper são bastante úteis para dois propósitos essenciais:

         • Prover um mecanismo de encapsulamento do valor primitivo em objetos,
           em contextos onde somente objetos são considerados, como em coleções
           (listas, conjuntos e tabelas hash);

        • Para se utilizar funções utilitárias associadas ao tipo primitivo que são
          executadas a partir do objeto da classe correspondente.
         */

        int w = 13; // tipo de dado primitivo
        Integer wrapper = Integer.valueOf(27); // objeto de uma classe wrapper
    }
}
