import javax.annotation.Nullable;

public interface jw {
   jx a();

   @Nullable
   default <T> T a(ka<? extends T> $$0) {
      return this.a().a($$0);
   }

   default <T> T a(ka<? extends T> $$0, T $$1) {
      return this.a().a($$0, $$1);
   }

   default boolean b(ka<?> $$0) {
      return this.a().b($$0);
   }
}
