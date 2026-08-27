import java.util.List;

public interface gcy<T> extends gdb<T> {
   static <T> gcy<T> b() {
      return $$0 -> List.of();
   }

   default void a() {
   }
}
