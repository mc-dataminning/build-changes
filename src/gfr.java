import java.util.List;

public interface gfr<T> extends gfu<T> {
   static <T> gfr<T> b() {
      return $$0 -> List.of();
   }

   default void a() {
   }
}
