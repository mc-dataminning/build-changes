import javax.annotation.Nullable;

public interface jk {
   jl a();

   @Nullable
   default <T> T a(jo<? extends T> $$0) {
      return this.a().a($$0);
   }

   default <T> T a(jo<? extends T> $$0, T $$1) {
      return this.a().a($$0, $$1);
   }

   default boolean b(jo<?> $$0) {
      return this.a().b($$0);
   }
}
