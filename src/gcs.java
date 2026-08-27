import java.util.List;

public interface gcs<T> extends gcv<T> {
   static <T> gcs<T> b() {
      return $$0 -> List.of();
   }

   default void a() {
   }
}
