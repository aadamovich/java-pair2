package com.playtech;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Point2 {

    public static class Point {

        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public double distance(Point b) {
            return Math.sqrt(Math.pow(x - b.x, 2) + Math.pow(y - b.y, 2));
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }


    public static void main(String[] args) throws IOException {

        //List<String> points = Files.readAllLines(Paths.get("points.txt"));

        List<Point> points = Arrays.asList(
                new Point(7, 5),
                new Point(1, 3),
                new Point(2, 6),
                new Point(3, 4),
                new Point(5, 4),
                new Point(3, 6),
                new Point(3, 5)
        );

        System.out.println("points within given rectangle");
        points
                .stream()
                .filter(m -> m.getX() >= 2 && m.getX() <= 4 && m.getY() >= 5 && m.getY() <= 7)
                .forEach(System.out::println);

        Point cc = new Point(4,5);

        System.out.println("points within given circle");
        points
                .stream()
                .filter(m -> m.distance(cc) <= 2)
                .forEach(System.out::println);

        System.out.println("sort by distance from given point");
        Comparator<Point> c = (Point a, Point b) ->
                (int) Math.signum(a.distance(cc) - b.distance(cc));
        points
                .stream()
                .sorted(c)
                .forEach(System.out::println);

    }

}
