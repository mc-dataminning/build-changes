import java.util.List;

public interface gcr<T> extends gcu<T> {
   static <T> gcr<T> b() {
      return $$0 -> List.of();
   }

   default void a() {
   }
}
