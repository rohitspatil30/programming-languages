#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *link;
};
void end_insert(struct node *head)
{
    struct node *newnode;
    struct node *temp;
    temp = head;
    newnode = (struct node *)malloc(sizeof(struct node));

    while (temp->link != NULL)
    {
        temp = temp->link;
    }
    temp->link = newnode;
    int num;
    printf("\nenter the value of the node you want ot insert : ");
    scanf("%d", &num);
    newnode->data = num;
    newnode->link = NULL;
}
struct node *begin_insert(struct node *head)
{
    struct node *newnode = (struct node *)malloc(sizeof(struct node));
    int num;
    printf("\nenter the value of the node you want ot insert : ");
    scanf("%d", &num);
    newnode->data = num;
    newnode->link = head;
    head = newnode;
    return head;
}

void middle_insert(struct node *head)
{
    int num, pos;
    printf("\nenter the value: ");
    scanf("%d", &num);
    printf("\nenter the position at which you want to insert: ");
    scanf("%d", &pos);
    struct node *newnode = (struct node *)malloc(sizeof(struct node));
    newnode->data = num;
    struct node *temp = (struct node *)malloc(sizeof(struct node));
    temp = head;
    pos--;
    while (pos != 1)
    {
        temp = temp->link;
        pos--;
    }
    newnode->link = temp->link;
    temp->link = newnode;
}

int main()
{
    struct node *head;
    head = (struct node *)malloc(sizeof(struct node));
    printf("\n***********linked list***********\n\n\n");
    int option = 1;
    printf("\nlets create a node: ");
    int num;
    printf("\nenter the value of the node you want ot insert : ");
    scanf("%d", &num);
    head->data = num;
    head->link = NULL;

    while (option > 0)
    {
        printf("\nenter the operation: \n1)insert in the beggining \n2)insert in the end \n3)insert in the middle \n4)delete from the beggining \n5)delete from the end \n6)delete from the middle \n7)traverse or print the list: ");
        scanf("\n%d", &option);
        switch (option)
        {

        case 1:
            printf("\n**insert at the beggining******\n\n\n\n");
            head = begin_insert(head);
            break;
        case 2:
            printf("\n**insert at the end******\n\n\n\n");
            end_insert(head);
            break;
        case 3:
            printf("\n**insert in the middle******\n\n\n\n");
            middle_insert(head);
            break;
        case 4:
            printf("\n**delete from the beggining******\n\n\n\n");
            // begin_del(head);
            break;
        case 5:
            printf("\n**delete from the end**********\n\n\n\n");
            // end_del(head);
            break;
        case 6:
            printf("\n**delete from the middle******\n\n\n\n");
            // del_mid(head);
            break;
        case 7:
            struct node *temp;
            temp = (struct node *)malloc(sizeof(struct node));
            temp = head;
            int i = 1;
            do
            {
                printf("\nnode->data of node %d: %d \nnode->link of node %d: %d", i, temp->data, i, temp->link);
                i++;
                temp = temp->link;
            } while (temp->link != NULL);
            printf("\nnode->data of node %d: %d \nnode->link of node %d: %d", i, temp->data, i, temp->link);
            break;
        case 8:
            exit(0);
        }
    }
}
