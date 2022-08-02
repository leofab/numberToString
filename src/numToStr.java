

public class numToStr {

    public static void main(String[] args) {
        int a = 12;
        int b = 1;
//        int c = 12212;
//        int d = 612;
//        int e = -212;
//        int f = 12345412;
//        int g = 9112;

//        String a1 = String.valueOf(f);
        System.out.println(numberToString(a));
        System.out.println(numberToString(b));

    }

        public static String numberToString(int x){
            String[] zeroToNineteen = {"zero","um","dois","tres","quatro","cinco","seis","sete","oito","nove","dez","onze","doze","treze","quatorze","quinze","dezesseis","dezessete","dezoito","dezenove"};
            String a1 = String.valueOf(x);
            switch (a1.length()) {
                case 1:
                    for (int i = 0; i < 20; i++){
                        if (x == i) return zeroToNineteen[i];
                    }
                case 2:
                    for (int i = 20; i < 30; i++){
                        if (x == i) return null;
                    }
                default:
                        return null;
            }
        }
}
