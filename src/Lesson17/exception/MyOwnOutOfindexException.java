package Lesson17.exception;

/**
 * Created by User on 08.04.2016.
 */
public class MyOwnOutOfIndexException extends Exception {
        public MyOwnOutOfIndexException(String message){
            super(message);
        }
    }