
package homeWork7;

import java.util.Scanner;

public class CodeAndDecodeList {

    /*
    Pupiņ-valodas teksta šifrēšana un atšifrēšana
     */


    public static void main(String[] args) {
        char keySymbol = 's';  //constant
        int codeOrDecode = -1;   //use enum
        System.out.println("Izvēlies kodēšanas vai dekodēšanas režīmu (0 vai 1)");
        codeOrDecode = modeSelect(codeOrDecode);
        doJob(codeOrDecode, keySymbol);

    }

    //move common logic to separate method or out of switch statement
    private static void doJob(int codeOrDecode, char keySymbol) {
        switch (codeOrDecode) {
            case 0:
                String inputText = "";  //no need to declare it here, declare it where it will be used
                System.out.println("Iedod ziņu šifrēšanai...");  //this is common
                inputText = getMessageInput(inputText);  //this is common
                char[] listToCode = splitToCharList(inputText); //this is common
                String codedMessage = codeMessage(listToCode, keySymbol);
                System.out.println("Šifrētā ziņa: " + codedMessage); //this is common
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
            //move to separate method if condition
            if (i + 1 < listToCode.length && listToCode[i] == keySymbol
                    && isVowel(listToCode[i + 1])) {
                i++;
            } else {
                newCharList[index] = listToCode[i];
                index++; //no need for it, since index could be incremented in previous line
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

    private static int modeSelect(int codeOrDecode) { //unused parameter
        Scanner scanner = new Scanner(System.in);
        codeOrDecode = scanner.nextInt();
        return codeOrDecode;

    }

    private static String codeMessage(char[] listToCode, char keySymbol) {

        int vowelsInList = countVowels(listToCode);
        int newListSize = listToCode.length + vowelsInList * 2;  //move to separate method
        char[] newCharList = new char[newListSize];
        int index = 0;
        for (int i = 0; i < listToCode.length; i++) {
            if (isVowel(listToCode[i])) {
                newCharList[index] = listToCode[i];
                index++; //could do this in previous line
                newCharList[index] = keySymbol;
                index++; //could do this in previous line
                //move this logic to separate method, which will return loweredVowel
                String charLowering = Character.toString(listToCode[i]).toLowerCase();
                char loweredVowel = charLowering.charAt(0);
                newCharList[index] = loweredVowel;
                index++;//could do this in previous line
            } else {
                newCharList[index] = listToCode[i];
                index++;//could do this in previous line
            }
        }
        return convertCharListToString(newCharList);
    }

    private static int countVowels(char[] listToCode) {
        int countVowels = 0;
        //use foreach
        for (int i = 0; i < listToCode.length; i++) {
            if (isVowel(listToCode[i])) {
                countVowels++;
            }
        }
        return countVowels;
    }

    //no need for this method
    private static char[] splitToCharList(String inputText) {
        char[] charList = inputText.toCharArray();  //why do you need this variable?
        return charList;
    }

    private static String getMessageInput(String inputText) { //unused parameter
        Scanner scanner = new Scanner(System.in); //this object will be created each time method is called
        inputText = scanner.nextLine();
        return inputText;
    }

    //remove - it's not used
    private static void printCharList(char[] list) {
        for (char i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static boolean isVowel(char enteredChar) {
        String convertChar = Character.toString(enteredChar).toLowerCase();
//could create a static List of vowels and use method contains to to do this
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
