import java.util.List;

public interface gsv<T> extends gsy<T> {
   static <T> gsv<T> b() {
      return $$0 -> List.of();
   }

   default void a() {
   }
}
