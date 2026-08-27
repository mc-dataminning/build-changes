import com.mojang.serialization.Lifecycle;

public interface pf<T> {
   ih.c<T> a(ahg<T> var1, T var2, Lifecycle var3);

   default ih.c<T> a(ahg<T> $$0, T $$1) {
      return this.a($$0, $$1, Lifecycle.stable());
   }

   <S> ii<S> a(ahg<? extends it<? extends S>> var1);
}
