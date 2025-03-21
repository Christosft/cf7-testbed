package gr.aueb.cf1.ch7;

public class StrBuilderApp {

    public static void main(String[] args) {

        StringBuilder concatStr = new StringBuilder();
        long timeStart = 0L;
        long timeEnd = 0L;
        double elapsedTime = 0.0;
        double sbElapsedTime = 0.0;
        StringBuilder sb = new StringBuilder();

        timeStart = System.currentTimeMillis();

        for (int i = 1; i <= 500000; i++) {
            concatStr.append(i);
        }
        timeEnd = System.currentTimeMillis();
        elapsedTime = (timeEnd - timeStart) / 1000.0;


        timeStart = System.currentTimeMillis();

        for (int i = 1; i <= 500000; i++) {
           sb.append(i);
        }
        timeEnd = System.currentTimeMillis();
        sbElapsedTime = (timeEnd - timeStart) / 1000.0;


        System.out.println("String elapsed time: " + elapsedTime + " seconds");
        System.out.println("Sb elapsed time: " + sbElapsedTime + "seconds");
    }
}
