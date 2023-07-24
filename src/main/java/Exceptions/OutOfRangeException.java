package Exceptions;

public class OutOfRangeException extends Exception
{
  OutOfRangeException()
  {
    this("Your input is out of range!");
  }
 
  public OutOfRangeException(String msg)
  {
    super(msg);
  }
}
