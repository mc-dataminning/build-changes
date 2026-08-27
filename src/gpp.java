import java.util.List;

public interface gpp<T> extends gps<T> {
   static <T> gpp<T> b() {
      return $$0 -> List.of();
   }

   default void a() {
   }
}
