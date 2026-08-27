import java.util.List;

public interface gds<T> extends gdv<T> {
   static <T> gds<T> b() {
      return $$0 -> List.of();
   }

   default void a() {
   }
}
