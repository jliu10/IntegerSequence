import java.util.NoSuchElementException;

public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int []data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other){  }


//throw a NoSuchElementException

//Postcondition: The otherseq will be reset.
//This constructor will copy ALL values of the `otherseq` into the data array.
  public ArraySequence(IntegerSequence otherseq){  }

  public static void main(String[] args){

    try{


    }catch(NoSuchElementException e){
      System.out.println("No more values left");
    }

  }

}
