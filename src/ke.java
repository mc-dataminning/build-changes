import javax.annotation.Nullable;

public interface ke {
   @Nullable
   <T> T a(ki<? extends T> var1);

   default <T> T a(ki<? extends T> $$0, T $$1) {
      T $$2 = this.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   @Nullable
   default <T> kl<T> b(ki<T> $$0) {
      T $$1 = this.a($$0);
      return $$1 != null ? new kl<>($$0, $$1) : null;
   }
}
