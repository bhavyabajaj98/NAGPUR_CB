package f1;
public class B4_StringBuilder {
    public static void main(String[] args){
        // declare
        // StringBuilder sb = new StringBuilder("hello");

        // //print
        // System.out.println(sb);

        // // get
        // System.out.println(sb.charAt(4));

        // // set
        // sb.setCharAt(4, 'd');
        // System.out.println(sb);

        // // length
        // System.out.println(sb.length());

        // // insert
        // sb.insert(1, 'a');
        // System.out.println(sb);

        // // append
        // // sb = sb + 'f';
        // sb.append('f');
        // System.out.println(sb);

        // // delete
        // sb.deleteCharAt(0);
        // System.out.println(sb);

        // //toString()
        // String ans = sb.toString();

        // sb = new StringBuilder("hello");
        // // sb.insert(5, 'd');
        // sb.append('d');
        // System.out.println(sb);

        int n = 100000000;

        // long t1 = System.currentTimeMillis();
        // String s = "hello";
        // for(int i = 0; i < n; i++){
        //     s += i;
        // }
        // long t2 = System.currentTimeMillis();

        // System.out.println(t2-t1);


        long t3 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("hello");
        for(int i = 0; i < n; i++){
            sb.append(i);
        }
        long t4 = System.currentTimeMillis();

        System.out.println(t4-t3);
    }
}
