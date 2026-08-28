import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface kf extends ke {
   kg a();

   @Nullable
   @Override
   default <T> T a(ki<? extends T> $$0) {
      return this.a().a($$0);
   }

   default <T> Stream<T> a(Class<? extends T> $$0) {
      return this.a().c().map(kl::b).filter($$1 -> $$0.isAssignableFrom($$1.getClass())).map($$0x -> (T)$$0x);
   }

   @Override
   default <T> T a(ki<? extends T> $$0, T $$1) {
      return this.a().a($$0, $$1);
   }

   default boolean c(ki<?> $$0) {
      return this.a().c($$0);
   }
}
