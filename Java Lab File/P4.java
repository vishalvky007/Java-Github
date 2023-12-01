/*
 * Developing java applications working on complex array arithmetic
 * using Comparable and Comparator interfaces.
*/

import java.util.Arrays;
import java.util.Comparator;

// Complex number class
class Complex implements Comparable<Complex> {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Getter methods for real and imaginary parts
    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    // Method to calculate the magnitude of a complex number
    public double magnitude() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    // Implementing Comparable interface based on magnitude
    @Override
    public int compareTo(Complex other) {
        return Double.compare(this.magnitude(), other.magnitude());
    }

    // Override toString for better display of complex numbers
    @Override
    public String toString() {
        return "(" + real + " + " + imaginary + "i)";
    }
}

class ComplexExample {
    public static void main(String[] args) {
        // Creating an array of complex numbers
        Complex[] complexArray = {
                new Complex(3, 4),
                new Complex(1, -2),
                new Complex(-2, 6),
                new Complex(5, 0),
                new Complex(-1, -1)
        };

        // Sorting the array using Comparable (based on magnitude)
        Arrays.sort(complexArray);

        // Displaying sorted array
        System.out.println("Sorted Array (Comparable):");
        for (Complex complex : complexArray) {
            System.out.println(complex);
        }

        // Sorting the array using Comparator (based on real part)
        Arrays.sort(complexArray, Comparator.comparingDouble(Complex::getReal));

        // Displaying sorted array
        System.out.println("\nSorted Array (Comparator - Real Part):");
        for (Complex complex : complexArray) {
            System.out.println(complex);
        }
    }
}