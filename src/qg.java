import com.mojang.serialization.Lifecycle;

public interface qg<T> {
   js.c<T> a(alc<T> var1, T var2, Lifecycle var3);

   default js.c<T> a(alc<T> $$0, T $$1) {
      return this.a($$0, $$1, Lifecycle.stable());
   }

   <S> jt<S> a(alc<? extends kf<? extends S>> var1);
}
