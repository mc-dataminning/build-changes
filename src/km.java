import javax.annotation.Nullable;

public interface km {
   kn a();

   @Nullable
   default <T> T a(kq<? extends T> $$0) {
      return this.a().a($$0);
   }

   default <T> T a(kq<? extends T> $$0, T $$1) {
      return this.a().a($$0, $$1);
   }

   default boolean b(kq<?> $$0) {
      return this.a().b($$0);
   }
}
