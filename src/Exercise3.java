public class Exercise3 {
    public static void main(String[] args) {
        int i = 0;
        int rez39 = 0;

        do {
            i++;
            if (i % 39 == 0) {
                rez39 = i;
            }
        }
        while (i <= 5000);
        System.out.println("Постусловие: " + rez39);

        i = 1;
        rez39 = 0;

        while (i <= 5000) {
          if (i % 39 == 0) {
              rez39 = i;
          }
        i++;
        }
        System.out.println("Предусловие: " + rez39);
    }
}

