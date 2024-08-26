package src.En;

import java.io.IOException;
import java.util.Scanner;

public class Main {
        private static final int start= 151;
        private static final int point = 3;
        private static final String secret= "<|{{{NP(&^VY*^%5$^#4^7*^*&ეწცცწ>'</ე12";

        public static void main(String[] args) throws IOException {
            System.out.println("""
                1. encrypt
                2. decrypt
                3. exit
                Input num : --
                """);
            Scanner scanner = new Scanner(System.in);


            int inp;
            do {
                inp = Integer.parseInt(scanner.nextLine());
                String st;
                if (inp == 1) {
                    StringBuilder text = new StringBuilder();
                    while (scanner.hasNextLine()){
                        st = scanner.nextLine();
                        if(st.equals("^xq")){
                            break;
                        }

                        text.append(st);
                    }

                    encrypt(text);
                } else if (inp == 2) {
                    StringBuilder text = new StringBuilder();
                    while (scanner.hasNextLine()){
                        st = scanner.nextLine();
                        if(st.equals("^xq")){
                            break;
                        }

                        text.append(st);
                    }
                    Decrypt(text);
                }
            } while (inp != 3);

        }

        public static void encrypt(StringBuilder st) {
            int secInd = 0;
            int starInd =0;
            int[] ar = new int[st.length()];
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < st.length(); i++) {
                ar[i] = (int) st.charAt(i);
            }

            for (int i = 0; i < ar.length; i++) {

                if (i % point == 0 ) {
                    ar[i] = ar[i] + 1;
                } else if (i % 7 ==0 ) {
                    ar[i] = start + ar[i];
                } else if (i % 5 ==0) {
                    ar[i] = ar[i] + 3;
                }
                else if (i % 2 == 0) {
                    int code = (int) secret.charAt(secInd);
                    ar[i] = ar[i] + code;
                    secInd++;

                    if(secInd == secret.length()-1){
                        secInd = 0;
                    }
                }
            }

            for (int i = 0; i < ar.length; i++) {
                stringBuilder.append((char) ar[i]);
            }

            System.out.println(stringBuilder);
        }

        public static void Decrypt(StringBuilder st) {
            int secInd =0;
            int[] ar = new int[st.length()];
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < ar.length; i++) {
                ar[i] = (int) st.charAt(i);
            }

            for (int i = 0; i < ar.length; i++) {

                if (i % point == 0 ) {
                    ar[i] = ar[i] - 1;
                } else if (i % 7==0) {
                    ar[i] = ar[i] - start;
                } else if (i % 5 ==0) {
                    ar[i] = ar[i] - 3;
                } else if (i % 2 == 0) {

                    int code = (int) secret.charAt(secInd);

                    ar[i] = ar[i] - code;
                    secInd++;

                    if(secInd == secret.length()-1){
                        secInd =0;
                    }
                }
            }

            for (int i = 0; i < ar.length; i++) {
                stringBuilder.append((char) ar[i]);
            }
            System.out.println(stringBuilder);
        }

    }

