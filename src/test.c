
#include<stdio.h>

int foo(int x) {
  printf("foo\n");
  return 2*x+1;
}

void bar(int x) {
  static int i = foo(x);
  printf("i = %d\n",i);
}

main() {
  int i =0;
  for(i=0; i<5;i++) {
    bar(i);
  }
}

