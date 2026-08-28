import javax.annotation.Nullable;

public interface ki {
   kj a();

   @Nullable
   default <T> T a(km<? extends T> $$0) {
      return this.a().a($$0);
   }

   default <T> T a(km<? extends T> $$0, T $$1) {
      return this.a().a($$0, $$1);
   }

   default boolean b(km<?> $$0) {
      return this.a().b($$0);
   }
}
