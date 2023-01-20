/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;       
 * };
 */
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2){
    struct ListNode* t1=l1;
    struct ListNode* t2=l2;
    struct ListNode* last;
    int carry=0;
    int len1=0;
    int len2=0;
    while(t1!= NULL||t2!=NULL)
    {
        if(t1!=NULL)
        {
      t1=t1->next;
      len1++;
        }
        if(t2!=0)
        {
        t2=t2->next;
        len2++;
        }
    }
    t1=l1;
    t2=l2;
    if(len1>=len2)
    {
    while(t1!=NULL||t2!=NULL)
    {
        if(t2!=NULL)
        {
        t1->val= t1->val+ t2->val+carry;
        if(t1->val>=10 &&t1->next!=NULL)
        {
            t1->val=t1->val-10;
            carry=1;
        }
        else
        {
            carry=0;
        }
        t1=t1->next;
        t2=t2->next;
    }
    else
    {
        t1->val=t1->val+carry;
            if(t1->val>=10 &&t1->next !=NULL)
        {
            t1->val=t1->val-10;
            carry=1;
        }
        else
        {
            carry=0;
        }
        t1=t1->next;
        }
    }
    }

    else
    {
        while(t1!=NULL||t2!=NULL)
    {
        if(t1!=NULL)
        {
            t2->val= t2->val+ t1->val+carry;
             if(t2->val>=10 && t2->next!=NULL)
            {
            t2->val=t2->val-10;
            carry=1;
            }
           else
           {
            carry=0;
            }
        t1=t1->next;
        t2=t2->next;
       }
    else
    {
        t2->val=t2->val+carry;
            if(t2->val>=10 && t2->next!=NULL)
        {
            t2->val=t2->val-10;
            carry=1;
        }
        else
        {
            carry=0;
        }

        t2=t2->next;
        }
    }
    }
    if(len1>=len2)
    {
        t1=l1;
        while(t1->next!=NULL)
        t1=t1->next;
        if(t1->val >=10)
        {
    struct ListNode* newNode=malloc(sizeof(struct ListNode));
    newNode->next=NULL;
    newNode->val=1;
    t1->next=newNode;
    t1->val=t1->val-10;
    len1++;
        }
    return l1;
    }
    else
    {
            t2=l2;
        while(t2->next!=NULL)
        t2=t2->next;
        if(t2->val>=10)
        {
    struct ListNode* newNode=(struct ListNode*)malloc(sizeof(struct ListNode));
    newNode->next=NULL;
    newNode->val=1;
    t2->next=newNode;
    t2->val=t2->val-10;
        }
    return l2;
    }

}