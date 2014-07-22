class Search {
int[] sortedList;
int low = 0;
int high = 0;
int mid = 0;
int number;
boolean flag = false;
int index = 0;
 
public Search(int[] sortedList, int number) {
this.sortedList = sortedList;
this.number = number;
high = sortedList.length - 1;
}
 
public int bi_search(int mid) {
 
if (sortedList[mid] == number) {
flag = true;
index = mid;
} else if (high <= low && number != sortedList[mid]) {
flag = false;
index = -1;
} else {
if (number > sortedList[mid]) {
low = mid + 1;
 
} else if (number < sortedList[mid]) {
high = mid - 1;
}
mid = (high + low) / 2;
bi_search(mid);
}
return index;
}
 
}

public class SearchTest {
 
public static void main(String[] args) {
int number = 99;
int[] sortedList = { 1, 2, 3, 4, 5, 6, 7, 8 };
int low = 0;
int high = sortedList.length - 1;
int mid = (low+high)/2;
 
Search s = new Search (sortedList,number); 
int index = s.bi_search(mid);
if(index >=0)
System.out.println("Number "+number+" is at index "+index);
else
System.out.println("Number Not Found");
 
 
 
}
}
