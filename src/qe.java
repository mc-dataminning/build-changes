import com.mojang.serialization.Lifecycle;

public interface qe<T> {
   jr.c<T> a(akt<T> var1, T var2, Lifecycle var3);

   default jr.c<T> a(akt<T> $$0, T $$1) {
      return this.a($$0, $$1, Lifecycle.stable());
   }

   <S> js<S> a(akt<? extends ke<? extends S>> var1);
}
