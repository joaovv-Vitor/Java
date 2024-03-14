/**
 * Dado um array de inteiros nums e um inteiro target retorne os indices dos dois numeros que somam target
 * 
 * resolva essa questao sem utiliar a forca bruta.
 * 
 * 
 * nao completada, preciso estudar mais sobre a funcao hasMap
 */

package desafios.desafio01;
import java.util.*;


public class desafio01 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};

        int target = 9;
        //resposta "0, 1"

        int[] hashMap = new int[nums.length];
        for (int i = 0; i < hashMap.length; i++) {
            hashMap[i] = 0;
        }

        int hashMapNum = nums[1];
        for(int i = 0; i<nums.length;i++){
            if(nums[i]+hashMapNum == target){

            }
        }

        // if (hashMap[1]== 0) {
        //     System.out.print(hashMap[1]);
        // }

        for(int i = 0; i<nums.length;i++){
            
            if(hashMap[i]== 1){
                System.out.print(hashMap[i]);
            }
        }

    }
}
