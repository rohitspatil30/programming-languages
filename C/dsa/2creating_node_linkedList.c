#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *link;
};

int main()
{
    struct node *head;
    head = (struct node *)malloc(sizeof(struct node));
    head->data = 45; // pointer uses ->to connect the struct.
    head->link = NULL;
    printf("\nthe data in the node: %d \nthe link part : %d", head->data, head->link);
}