import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//Count100어노테이션을 JVM실행시에 감지할 수 있도록 하려면 
//@Retention(RetentionPolicy.RUNTIME)를 붙여줘야 합니다.
@Retention(RetentionPolicy.RUNTIME)
public @interface Count100 {

}