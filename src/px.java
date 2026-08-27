import com.mojang.serialization.Lifecycle;

public interface px<T> {
   il.c<T> a(ajs<T> var1, T var2, Lifecycle var3);

   default il.c<T> a(ajs<T> $$0, T $$1) {
      return this.a($$0, $$1, Lifecycle.stable());
   }

   <S> im<S> a(ajs<? extends iy<? extends S>> var1);
}
