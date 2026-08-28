import javax.annotation.Nullable;

public interface kh {
   ki a();

   @Nullable
   default <T> T a(kl<? extends T> $$0) {
      return this.a().a($$0);
   }

   default <T> T a(kl<? extends T> $$0, T $$1) {
      return this.a().a($$0, $$1);
   }

   default boolean b(kl<?> $$0) {
      return this.a().b($$0);
   }
}
