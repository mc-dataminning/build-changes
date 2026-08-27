import java.util.List;

public interface gfm<T> extends gfp<T> {
   static <T> gfm<T> b() {
      return $$0 -> List.of();
   }

   default void a() {
   }
}
