import javax.annotation.Nullable;

public interface kl {
   km a();

   @Nullable
   default <T> T a(kp<? extends T> $$0) {
      return this.a().a($$0);
   }

   default <T> T a(kp<? extends T> $$0, T $$1) {
      return this.a().a($$0, $$1);
   }

   default boolean b(kp<?> $$0) {
      return this.a().b($$0);
   }
}
