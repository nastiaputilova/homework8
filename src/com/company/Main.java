package com.company;

    public class Main {
    public static void main(String[] args) {
        doExercise1(2020);
        String name = "iOS";
        int getClientOS = getClientOS(name);
        doExercise2 (name,2020);
        doExercise3 (1000);
        doExercise4 ("aabccddefgghiijjkk");
        doExercise5 ("3,2,1,6,5");

    }
            // 1

        public static void doExercise1(int year){

            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                System.out.println(year + " — високосный год");
            } else {
                System.out.println(year + " — не високосный год");
            }
        }
            // 2

        public static int getClientOS(String name){
            if (name.equals("iOS")) {
                return 0;
            } else {
                return 1;
            }
        }

        public static void doExercise2(String name, int phoneYear) {
            int currentYear = 2022;
            int getClientOS = getClientOS("Android");
            if (phoneYear < currentYear && getClientOS == 0){
                System.out.println("Установите облегченную версию приложения для iOS");
        } else {
                if (phoneYear < currentYear && getClientOS == 1){
                    System.out.println("Установите облегченную версию приложения для Android");
            } else {
                    System.out.println("Не нужно устанавливать облегченную версию приложения");
                }
            }
        }


            // 3

        public static void doExercise3(int deliveryDistance){
            int deliveryTime = 1;
            if (deliveryDistance <=20) {
                System.out.println("Потребуется дней: " + deliveryTime);
            } else if (deliveryDistance >20 && deliveryDistance <= 60) {
                System.out.println("Потребуется дней: " + (deliveryTime + 1));
            } else if (deliveryDistance >60 && deliveryDistance <=100) {
                System.out.println("Потребуется дней: " + (deliveryTime + 2));
            } else {
                System.out.println("Доставка невозможна");
            }
            }

            // 4

        public static void doExercise4(String letters) {
            char string[] = letters.toCharArray();
            int count;
            for(int i = 0; i <string.length; i++) {
                count = 1;
                for(int j = i+1; j <string.length; j++) {
                    if(string[i] == string[j] && string[i] != ' ') {
                        count++;
                        string[j] = '0';
                    }
                }
                if(count > 1 && string[i] != '0')
                    System.out.println("В строке есть дубли: " + string[i]);
            else if (count == 1 && string[i] != '0')
                    System.out.println("В строке нет дублей");
                    return;
                }

            }

            // 5

        public static void doExercise5(String array) {
            char[] reverseNumbers = array.toCharArray();
            for (int i = reverseNumbers.length-1; i >= 0; i--) {
                System.out.print(reverseNumbers[i]);


        }

        }
    }




