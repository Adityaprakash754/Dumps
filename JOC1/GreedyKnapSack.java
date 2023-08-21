package JOC1;

import java.util.Scanner;
public class GreedyKnapSack {
    private int []w;
    private double []p;
    private int []ind;
    private int []x;
    private int n;
    private double weight;
    Scanner sc = new Scanner(System.in);
    public void input(){
    	double xin,y;
    	int ch;
        System.out.println("Enter the no. of items , amt to pay, total amt: ");
        n = sc.nextInt();
        xin = sc.nextInt();
        y = sc.nextInt();
        
        weight = y - xin;

        ind = new int [n];
        w = new int [n];
        p = new double [n];
        System.out.println("Enter the profit and weight for each item: ");
        for(int i = 0; i < n; i++){
            p[i] = sc.nextInt();
            w[i] = sc.nextInt();

            ind[i] = i;
        }
        
        System.out.println("enter 1: more coins 2: less coins ");
        ch = sc.nextInt();
        
        if(ch == 1) {
        	for(int i = 0; i < n - 1; i++){
                for(int j = 0; j < n - i - 1; j++){
                    if(p[j] > p[j+1]){
                        double temp1 = p[j];
                        p[j] = p[j+1];
                        p[j+1] = temp1;

                        int temp2 = w[j];
                        w[j] = w[j+1];
                        w[j+1] = temp2;

                        int temp = ind[j];
                        ind[j] = ind[j+1];
                        ind[j+1] = temp;
                    }
                }
            }
        }
        
        else if (ch == 2) {
        	for(int i = 0; i < n - 1; i++){
                for(int j = 0; j < n - i - 1; j++){
                    if(p[j] < p[j+1]){
                        double temp1 = p[j];
                        p[j] = p[j+1];
                        p[j+1] = temp1;

                        int temp2 = w[j];
                        w[j] = w[j+1];
                        w[j+1] = temp2;

                        int temp = ind[j];
                        ind[j] = ind[j+1];
                        ind[j+1] = temp;
                    }
                }
            }
        }

        
        knapSack();
    }

    public void knapSack(){
    	double t = 0.0;
        x = new int [n];
        for(int i = 0; i < n; i++)
            x[i] = 0;

        double u = weight;
        int i;
        for(i = 0; i < n; i++){
            if(u == 0)
                break;
            
            if(w[i]>0 && t != 0.5) {
            	x[i] += p[i];
                u = u - x[i]*p[i];
                w[i]--;
                
                t = u;
                while(t >0) {
                	t = t-1; 
                }
            }
            
        }
    }

    public void display(){   
        int count = 0; 
        System.out.println("Solution Vector: ");
        for(int i = 0; i < n; i++,count++){
            int j;
            for(j = 0; j < n; j++){
                if (ind [j] == count)
                    break;
            }
            System.out.print(x[j]+" ");
            System.out.println();
        }
    }
}