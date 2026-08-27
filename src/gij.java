import java.util.List;

public interface gij<T> extends gim<T> {
   static <T> gij<T> b() {
      return $$0 -> List.of();
   }

   default void a() {
   }
}
