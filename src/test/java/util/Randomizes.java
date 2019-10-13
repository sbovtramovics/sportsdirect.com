package util;

import java.util.Random;

public class Randomizes {

    private static int random(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    public static String randomEmailAddress() {
        Random rng = new Random();
        String characters = "abcdefghijklmnopqrstuvwxyz";
        int lengthUserName = random(2, 11);
        int lengthMailName = random(2, 11);
        int lengthMailDomain = random(2, 3);
        char[] UserName = new char[lengthUserName];
        for (int i = 0; i < lengthUserName; i++) {
            UserName[i] = characters.charAt(rng.nextInt(characters.length()));
        }

        char[] MailName = new char[lengthMailName];
        for (int i = 0; i < lengthMailName; i++) {
            MailName[i] = characters.charAt(rng.nextInt(characters.length()));
        }

        char[] MailDomain = new char[lengthMailDomain];
        for (int i = 0; i < lengthMailDomain; i++) {
            MailDomain[i] = characters.charAt(rng.nextInt(characters.length()));
        }

        return new String(UserName) + "@" + new String(MailName) + "." + new String(MailDomain);
    }

    public static String randomWebSite() {
        Random rng = new Random();
        String characters = "abcdefghijklmnopqrstuvwxyz";
        int lengthFirstName = random(2, 11);
        int lengthSecondName = random(2, 11);
        int lengthDomain = random(2, 3);
        char[] UserName = new char[lengthFirstName];
        for (int i = 0; i < lengthFirstName; i++) {
            UserName[i] = characters.charAt(rng.nextInt(characters.length()));
        }

        char[] MailName = new char[lengthSecondName];
        for (int i = 0; i < lengthSecondName; i++) {
            MailName[i] = characters.charAt(rng.nextInt(characters.length()));
        }

        char[] MailDomain = new char[lengthDomain];
        for (int i = 0; i < lengthDomain; i++) {
            MailDomain[i] = characters.charAt(rng.nextInt(characters.length()));
        }

        return new String(UserName) + "." + new String(MailName) + "." + new String(MailDomain);
    }

    public static String randomPhoneNumber() {
        Random rng = new Random();
        String characters = "0123456789";
        int lengthPhoneNumber = random(8, 8);
        char[] PhoneNumber = new char[lengthPhoneNumber];
        int zerroCounter = 0;
        for (int i = 0; i < lengthPhoneNumber; i++) {
            PhoneNumber[i] = characters.charAt(rng.nextInt(characters.length()));
            if (PhoneNumber[i] == '0') {
                zerroCounter++;
            }
        }
        if (zerroCounter == lengthPhoneNumber) {
            int randomPhoneNumberIndex = random(0, lengthPhoneNumber - 1);
            PhoneNumber[randomPhoneNumberIndex] = '1';
        }
        return new String(PhoneNumber);
    }

    public static String randomName() {
        Random rng = new Random();
        String lowCharacters = "abcdefghijklmnopqrstuvwxyz";
        String bigCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int lengthName = random(3, 10);
        char[] name = new char[lengthName];
        name[0] = bigCharacters.charAt(rng.nextInt(bigCharacters.length()));
        for (int i = 1; i < lengthName; i++) {
            name[i] = lowCharacters.charAt(rng.nextInt(lowCharacters.length()));
        }
        return new String(name);
    }
}