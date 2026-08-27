import java.util.List;

public interface fyi<T> extends fyl<T> {
   static <T> fyi<T> b() {
      return $$0 -> List.of();
   }

   default void a() {
   }
}
