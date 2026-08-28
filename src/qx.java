import com.mojang.serialization.Lifecycle;

public interface qx<T> {
   jp.c<T> a(alg<T> var1, T var2, Lifecycle var3);

   default jp.c<T> a(alg<T> $$0, T $$1) {
      return this.a($$0, $$1, Lifecycle.stable());
   }

   <S> jq<S> a(alg<? extends kc<? extends S>> var1);
}
