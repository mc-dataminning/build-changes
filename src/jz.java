import javax.annotation.Nullable;

public interface jz {
   ka a();

   @Nullable
   default <T> T a(kd<? extends T> $$0) {
      return this.a().a($$0);
   }

   default <T> T a(kd<? extends T> $$0, T $$1) {
      return this.a().a($$0, $$1);
   }

   default boolean b(kd<?> $$0) {
      return this.a().b($$0);
   }
}
