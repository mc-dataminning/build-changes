import javax.annotation.Nullable;

public interface kg {
   @Nullable
   <T> T a(kk<? extends T> var1);

   default <T> T a(kk<? extends T> $$0, T $$1) {
      T $$2 = this.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   @Nullable
   default <T> kn<T> b(kk<T> $$0) {
      T $$1 = this.a($$0);
      return $$1 != null ? new kn<>($$0, $$1) : null;
   }
}
