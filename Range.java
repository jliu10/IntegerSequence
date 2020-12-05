import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;

  public Range(int s, int e){
    start=s;
    end=e;
    current=start;
  }

  public void reset(){

  }

  public int length(){
    return 0;
  }

  public boolean hasNext(){
    return true;
  }

  //@throws NoSuchElementException
  public int next(){
    return 0;
  }

  public static void main(String[] args){
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
