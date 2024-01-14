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
    struct node *second_node;
    struct node *third_node;
    struct node *fourth_list;
    head = (struct node *)malloc(sizeof(struct node));
    second_node = (struct node *)malloc(sizeof(struct node));
    third_node = (struct node *)malloc(sizeof(struct node));
    fourth_list = (struct node *)malloc(sizeof(struct node));
    head->data = 45; // pointer uses ->to connect the struct.
    head->link = second_node;
    printf("\nthe data in the node: %d \nthe link part : %d", head->data, head->link);
    second_node->data = 10;
    second_node->link = third_node;
    third_node->data = 20;
    third_node->link = fourth_list;
    fourth_list->data = 30;
    fourth_list->link = NULL;
    struct node *temp;
    temp = head;
    int i = 1;
    do
    {
        printf("\nnode->data of node %d: %d \nnode->link of node %d: %d", i, temp->data, i, temp->link);
        i++;
        temp = temp->link;
    } while (temp->link != NULL);
    printf("\nnode->data of node %d: %d \nnode->link of node %d: %d", i, temp->data, i, temp->link);
}