import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;

  public Range(int start,  int end){
    start=start;
    end=end;
  }

  public void reset(){  }

  public int length(){  }

  public boolean hasNext(){  }

  //@throws NoSuchElementException
  public int next(){    }

  public void main(String[] args){
    IntegerSequence r = new Range(10,20);
    /*
    while(r.hasNext()){
      System.out.print(r.next())
       if( r.hasNext() )
          System.out.print( ", " );
    }
    System.out.println();
    */
  }

}
