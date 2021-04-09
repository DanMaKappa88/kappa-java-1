package hu.flowacademy.kappa;

public class Main {

    public static void main(String[] args) {
        Jarmu r = new AudiS8("ASD-123", 20, true);
        Object r2 = new Robogo("ASD-122", 30, 50);
        megy(r2);
//        if(r instanceof Robogo) {
//            ((Robogo)r).menj(1,2);
//        }
        String str = "Cica,kutya,eger";
        //String str2 = new String("Alma");
        String[] arr = str.split(",");
        System.out.println(str.charAt(0));
        str += ",alma";
        long start = System.currentTimeMillis();
        for(int i = 0; i < 50000; i++) {
            str += ".";
        }
        System.out.println("Sima:" + (System.currentTimeMillis() - start));
        StringBuilder sb = new StringBuilder("Cica,kutya,eger");
        start = System.currentTimeMillis();
        for(int i = 0; i < 50000; i++) {
            sb.append(".");
        }
        sb.toString();
        System.out.println("builder:" + (System.currentTimeMillis() - start));

    }

    public static void megy(Object o) {
        System.out.println("Osztály:" + o.getClass() + " - " + Robogo.class);
        if(o instanceof Megy) {
            ((Megy)o).menj(1,2);
        }
    }
}
