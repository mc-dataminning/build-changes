import javax.annotation.Nullable;

public interface jm {
   jn a();

   @Nullable
   default <T> T a(jq<? extends T> $$0) {
      return this.a().a($$0);
   }

   default <T> T a(jq<? extends T> $$0, T $$1) {
      return this.a().a($$0, $$1);
   }

   default boolean b(jq<?> $$0) {
      return this.a().b($$0);
   }
}
