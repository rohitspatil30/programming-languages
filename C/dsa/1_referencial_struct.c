#include <stdio.h>

struct code
{
    int i;
    struct code *ptr;
};

int main()
{
    struct code var;
    var.i = 34;
    printf("\n%d", var.i);
    struct code var2;
    var2.i = 100;
    var.ptr = &var2;            // address of the var2 is stored in the var.ptr
    printf("\n%d", var.ptr);    // prints address of the var2 struct variable.
    printf("\n%d", var.ptr->i); // value stored at that pointer
    int a = 11;
    a = (a++) + (++a) + (--a);
    printf("\na: %d", a);
}
