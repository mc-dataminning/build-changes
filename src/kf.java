import javax.annotation.Nullable;

public interface kf {
   @Nullable
   <T> T a(kj<? extends T> var1);

   default <T> T a(kj<? extends T> $$0, T $$1) {
      T $$2 = this.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   @Nullable
   default <T> km<T> b(kj<T> $$0) {
      T $$1 = this.a($$0);
      return $$1 != null ? new km<>($$0, $$1) : null;
   }
}
