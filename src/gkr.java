import java.util.List;

public interface gkr<T> extends gku<T> {
   static <T> gkr<T> b() {
      return $$0 -> List.of();
   }

   default void a() {
   }
}
