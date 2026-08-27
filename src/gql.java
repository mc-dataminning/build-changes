import java.util.List;

public interface gql<T> extends gqo<T> {
   static <T> gql<T> b() {
      return $$0 -> List.of();
   }

   default void a() {
   }
}
