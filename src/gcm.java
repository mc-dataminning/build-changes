import java.util.List;

public interface gcm<T> extends gcp<T> {
   static <T> gcm<T> b() {
      return $$0 -> List.of();
   }

   default void a() {
   }
}
