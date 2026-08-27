import com.mojang.serialization.Lifecycle;

public interface pc<T> {
   ih.c<T> a(ahc<T> var1, T var2, Lifecycle var3);

   default ih.c<T> a(ahc<T> $$0, T $$1) {
      return this.a($$0, $$1, Lifecycle.stable());
   }

   <S> ii<S> a(ahc<? extends it<? extends S>> var1);
}
