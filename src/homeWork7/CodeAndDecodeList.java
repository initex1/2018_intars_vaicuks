package homeWork7;

import java.util.Scanner;

public class CodeAndDecodeList {


    public static void main(String[] args) {
        char keySymbol = 's';
        int codeOrDecode = -1;
        System.out.println("Izvēlies kodēšanas vai dekodēšanas režīmu (0 vai 1)");
        codeOrDecode = modeSelect(codeOrDecode);
        switch (codeOrDecode) {
            case 0:
                String inputText = "";
                System.out.println("Iedod ziņu šifrēšanai...");
                inputText = getMessageInput(inputText);
                //System.out.println("Nešifrētā ziņa: " + inputText);
                char[] listToCode = splitToCharList(inputText);
                // printCharList(listToCode);
                //codeMessage(listToCode, keySymbol);
                String codedMessage = codeMessage(listToCode, keySymbol);
                System.out.println("Šifrētā ziņa: " + codedMessage);
                break;

            case 1:
                inputText = "";
                System.out.println("Iedod ziņu atšifrēšanai...");
                inputText = getMessageInput(inputText);
                listToCode = splitToCharList(inputText);
                decodeMessage(listToCode, keySymbol);
                String decodedMessage = decodeMessage(listToCode, keySymbol);
                System.out.println("Atšifrētā ziņa: " + decodedMessage);
                break;
        }
    }

    private static String decodeMessage(char[] listToCode, char keySymbol) {
        int vowelsInList = countVowels(listToCode);
        int newListSize = listToCode.length - vowelsInList;
        char[] newCharList = new char[newListSize];
        int index = 0;
        for (int i = 0; i < listToCode.length; i++) {
            if (i + 1 < listToCode.length && listToCode[i] == keySymbol && isVowel(listToCode[i + 1])) {
                i++;
            } else {
                newCharList[index] = listToCode[i];
                index++;
            }
        }
        return convertCharListToString(newCharList);
    }

    private static String convertCharListToString(char[] newCharList) {
        String codedMessage = "";
        for (char i : newCharList) {
            codedMessage = codedMessage + i;
        }
        return codedMessage;
    }

    private static int modeSelect(int codeOrDecode) {
        Scanner scanner = new Scanner(System.in);
        codeOrDecode = scanner.nextInt();
        return codeOrDecode;

    }

    private static String codeMessage(char[] listToCode, char keySymbol) {

        int vowelsInList = countVowels(listToCode);
        int newListSize = listToCode.length + vowelsInList * 2;
        char[] newCharList = new char[newListSize];
        int index = 0;
        for (int i = 0; i < listToCode.length; i++) {
            if (isVowel(listToCode[i])) {
                newCharList[index] = listToCode[i];
                index++;
                newCharList[index] = keySymbol;
                index++;
                String charLowering = Character.toString(listToCode[i]).toLowerCase();
                char loweredVowel = charLowering.charAt(0);
                newCharList[index] = loweredVowel;
                index++;
            } else {
                newCharList[index] = listToCode[i];
                index++;
            }
        }
        return convertCharListToString(newCharList);
    }

    private static int countVowels(char[] listToCode) {
        int countVowels = 0;
        for (int i = 0; i < listToCode.length; i++) {
            if (isVowel(listToCode[i])) {
                countVowels++;
            }
        }
        return countVowels;
    }

    private static char[] splitToCharList(String inputText) {
        char[] charList = inputText.toCharArray();
        return charList;
    }

    private static String getMessageInput(String inputText) {
        Scanner scanner = new Scanner(System.in);
        inputText = scanner.nextLine();
        return inputText;
    }

    private static void printCharList(char[] list) {
        for (char i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static boolean isVowel(char enteredChar) {
        String convertChar = Character.toString(enteredChar).toLowerCase();

        switch (convertChar) {
            case "a":
            case "ā":
            case "e":
            case "ē":
            case "i":
            case "ī":
            case "o":
            case "u":
            case "ū":
                return true;
            default:
                return false;
        }
    }


}
