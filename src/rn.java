import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface rn {
   int a() default 100;

   String b() default "defaultBatch";

   boolean c() default false;

   int d() default 0;

   boolean e() default true;

   String f() default "";

   long g() default 0L;

   int h() default 1;

   int i() default 1;
}
