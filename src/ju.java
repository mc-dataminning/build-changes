import javax.annotation.Nullable;

public interface ju {
   jv a();

   @Nullable
   default <T> T a(jy<? extends T> $$0) {
      return this.a().a($$0);
   }

   default <T> T a(jy<? extends T> $$0, T $$1) {
      return this.a().a($$0, $$1);
   }

   default boolean b(jy<?> $$0) {
      return this.a().b($$0);
   }
}
