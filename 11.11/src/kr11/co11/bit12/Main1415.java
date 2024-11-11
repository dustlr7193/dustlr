package kr11.co11.bit12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Num {
    int n;

    Num(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return n + "";
    }

    @Override
    public int hashCode() {
        return n;
    }

    public boolean equals(Object obj) {
        Num num = (Num) obj;
        if (n == n) {
            return true;
        } else {
            return false;
        }
    }

    public class Main1415 {
        public static void main(String[] args) {
            Set<Num> h = new HashSet<Num>();
            h.add(new Num(30));
            h.add(new Num(60));
            h.add(new Num(40));
            h.add(new Num(60));

            //p656
            Iterator<Num> it = h.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }
    }
}
