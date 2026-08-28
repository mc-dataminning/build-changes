import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface te {
   int a() default 100;

   String b() default "defaultBatch";

   boolean c() default false;

   int d() default 0;

   boolean e() default true;

   boolean f() default false;

   String g() default "";

   long h() default 0L;

   int i() default 1;

   int j() default 1;
}
