package BusResv;

public class JavaTraining {
    public static void main(String[] args) {
        System.out.println("Hello");
    }


    static class Schedule implements Comparable<Schedule> {
        int start;
        int end;

        public Schedule(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Schedule o) {
            if (start == o.start) {
                return end - o.end;
            }
            return 0;
        }
    }
}
