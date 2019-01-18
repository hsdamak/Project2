package head;
import java.util.Arrays;
public class Lists {
int[] list = new int[10];
    public static void main(String[] args) {

        Lists l = new Lists();
        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.insert(4);
        l.insert(5);
        l.insert(6);
        l.insert(7);

        System.out.println("before" + Arrays.toString(l.list));
        l.remove(2);
        System.out.println("before" + Arrays.toString(l.list));
    }

        void insert(int value)
        {
            for(int i=0;i<list.length;i++)
            {
                if(list[i]==0)
                {
                    list[i]=value;
                break;
            }

            }
        }


    void remove(int index){
            for (int i=index ;i<list.length-1; i++){
                list[i]=list[i+1];
            }
list[list.length-1]=0;
        }


        int isEmpty(){
            if(list[0]==0){
                return 1;
            }
            else{
                return 0;
            }
        }

        int isFull()
        {
        if(list[list.length-1]!=0)
        {
            return 1;
        }
        else {
            return 0;
        }
        }

    }



