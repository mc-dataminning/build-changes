import javax.annotation.Nullable;

public interface jv {
   jw a();

   @Nullable
   default <T> T a(jz<? extends T> $$0) {
      return this.a().a($$0);
   }

   default <T> T a(jz<? extends T> $$0, T $$1) {
      return this.a().a($$0, $$1);
   }

   default boolean b(jz<?> $$0) {
      return this.a().b($$0);
   }
}
