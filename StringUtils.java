package palindromas;

import java.util.Scanner;

public class StringUtils {
    public static boolean isPalindrome(String str) {
        // Remova os espaços em branco e converta a string para letras minúsculas
        str = str.replaceAll("\\s+", "").toLowerCase();

        // Converter a string em um array de caracteres
        char[] charArray = str.toCharArray();

        // Verificar se o array de caracteres é palíndromo
        int length = charArray.length;
        for (int i = 0; i < length / 2; i++) {
            if (charArray[i] != charArray[length - 1 - i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        if (StringUtils.isPalindrome(palavra)) {
            System.out.println("A palavra é palíndroma.");
        } else {
            System.out.println("A palavra não é palíndroma.");
        }

        scanner.close();
    }
}