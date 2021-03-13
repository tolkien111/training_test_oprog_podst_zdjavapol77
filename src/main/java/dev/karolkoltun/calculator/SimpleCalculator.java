package dev.karolkoltun.calculator;

class SimpleCalculator {
  int add(int x, int y) {
    return x + y;
  }

  int subtract(int x, int y) {
    return x - y;
  }

  int multiply(int x, int y) {
    return x * y;
  }

  int calculateFibonacci(int n) {
    if (n <= 1) {
      return n;
    }
    return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
  }
  int moduloNumber(int x, int y){
    return  x % y;
  }
  double splitNumber(double x, double y){
    return  x / y;
  }
}
