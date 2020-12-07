import java.util.NoSuchElementException;

public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int []data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other){
    currentIndex=0;
    data=new int[other.length];
    for(int i=0;i<other.length;i++){
      data[i]=other[i];
    }
  }

  public boolean hasNext(){//does the sequence have more elements?
    return currentIndex<length();
  }

  //throw a NoSuchElementException
  public int next(){       //return the current value in the sequence and advances to the next element.
    if(!hasNext()){
      throw new NoSuchElementException("No more values left");
    }
    int c=data[currentIndex];
    currentIndex++;
    return c;
  }

  public int length(){     //returns the total length of the sequence
    return data.length;
  }

  public void reset(){     //start over from the start of the sequence
    currentIndex=0;
  }

//Postcondition: The otherseq will be reset.
//This constructor will copy ALL values of the `otherseq` into the data array.
  public ArraySequence(IntegerSequence otherseq){
    currentIndex=0;
    data=new int[otherseq.length()];
    while(otherseq.hasNext()){
      data[currentIndex]=otherseq.next();
      currentIndex++;
    }
    reset();
    otherseq.reset();
  }

  public static void main(String[] args){
    int[]nums = {1,3,5,0,-1,3,9};
    IntegerSequence as = new ArraySequence(nums);

    IntegerSequence r = new Range(10,15);
    IntegerSequence as1 = new ArraySequence(r);

    try{
      System.out.println("ArraySequence(array):");
      while(as.hasNext()){
        System.out.print(as.next()+", ");
      }
      System.out.println();

      System.out.println("Range(10,15):");
      while(r.hasNext()){
        System.out.print(r.next()+", ");
      }
      System.out.println();

      System.out.println("ArraySequence(seq):");
      while(as1.hasNext()){
        System.out.print(as1.next()+", ");
      }
      System.out.println();

    }catch(NoSuchElementException e){
      System.out.println("No more values left");
    }
  }

}
