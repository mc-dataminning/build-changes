import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface kp {
   kq a();

   @Nullable
   default <T> T a(kt<? extends T> $$0) {
      return this.a().a($$0);
   }

   default <T> Stream<T> a(Class<? extends T> $$0) {
      return this.a().c().map(kw::b).filter($$1 -> $$0.isAssignableFrom($$1.getClass())).map($$0x -> (T)$$0x);
   }

   default <T> T a(kt<? extends T> $$0, T $$1) {
      return this.a().a($$0, $$1);
   }

   default boolean b(kt<?> $$0) {
      return this.a().b($$0);
   }
}
