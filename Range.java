import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;

  public Range(int start, int end){
    this.start=start;
    this.end=end;
    current=start;
  }

  public void reset(){
    current=start;
  }

  public int length(){
    return end-start+1;
  }

  public boolean hasNext(){
    return current<end;
  }

  //@throws NoSuchElementException
  public int next(){
    if(!hasNext()){
      throw new NoSuchElementException("No more values left");
    }
    int c=current;
    current++;
    return c;
  }

  public static void main(String[] args){
    IntegerSequence r = new Range(10,15);
    System.out.println(r.length());

    while(r.hasNext()){
      System.out.print(r.next());
       if( r.hasNext() )
          System.out.print( ", " );
    }
    System.out.println();
    // Expected output:
    // 10, 11, 12, 13, 14, 15
  }

}
