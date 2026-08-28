import javax.annotation.Nullable;

public interface kr {
   @Nullable
   <T> T a(kw<? extends T> var1);

   default <T> T a(kw<? extends T> $$0, T $$1) {
      T $$2 = this.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   @Nullable
   default <T> kz<T> b(kw<T> $$0) {
      T $$1 = this.a($$0);
      return $$1 != null ? new kz<>($$0, $$1) : null;
   }
}
