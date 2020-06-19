public class Main {
    public static void main(String[] args) {
//        int count = 6;
//        //ရိုးရိုး while loop က condition မှန်မှ code block ထဲက code တွေ run မှာဖြစ်တယ်
//        while(count != 6){
//            System.out.println("Count value is " + count);
//            count++;
//        }

//        for (int i = 6; i != 6; i++){
//            System.out.println("Count value is " + i);
//        }

        //do while loop က code block ထဲကကုဒ်တွေ အနည်းဆုံးတစ်ကြိမ် run တယ်
        //ပြီးမှ condition စစ်တဲ့အခြေအနေရောက်တယ်

//        count = 6;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//
//            if (count >100){
//                break;
//            }
//        } while (count !=6);

        int number = 4;
        int finishNumber = 50;
        int evenNumRecord = 0;
        int totalEvenNum = 0;

        while (number <= finishNumber){
            number++;
            if (!isEvenNumber(number)){
                //continue က break နဲ့ဆင်တယ်
                //break ကလုံး၀ရပ်သွားတယ် continue ကအောက်ကကုဒ်တွေဆီဆက်မသွားပဲ
                //loop ပြန်ပတ်တယ် (ဆိုလိုတာက next iteration)
                //အကယ်၍ continue မပါရင် loop ပတ်တိုင်း အောက်က print statement ဆီရောက်မယ်
                continue;
            }

            System.out.println("Even number " + number);
            totalEvenNum += number;
            evenNumRecord++;
            if (evenNumRecord == 5){
                System.out.println("Total number of " + evenNumRecord +
                        " even numbers found is " + totalEvenNum);
                break;
            }

        }

        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found

    }

    public static boolean isEvenNumber (int num){
        if ((num % 2) == 0){
            return true;
        } else {
            return false;
        }
    }
}

// Create a method called isEvenNumber that takes a parameter of type int
// Its purpose is to determine if the argument passed to method is
// an even number or not
// return true if an even number, otherwise return false;
