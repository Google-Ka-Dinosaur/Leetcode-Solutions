/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2)
{
struct ListNode* tmp;
struct ListNode* start;
if(list1==NULL)
return list2;
if(list2==NULL)
return list1;
if(list1->val<list2->val)
    {
        start=list1;
        tmp=start;
        list1=list1->next;
    }
    else
    {

        start=list2;
        tmp=start;
        list2=list2->next;
    }
while(list1!=NULL&&list2!=NULL)
{
    if(list1->val<list2->val)
    {
        tmp->next=list1;
        list1=list1->next;
        tmp=tmp->next;
    }
    else
    {
       tmp->next=list2;
        list2=list2->next;
        tmp=tmp->next;
    }
}
    if(list2!=NULL)
    {
        tmp->next=list2;
    }
    else
    {
        tmp->next=list1;
    }
    return start;
}