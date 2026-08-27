import com.mojang.serialization.Lifecycle;

public interface ou<T> {
   ib.c<T> a(agf<T> var1, T var2, Lifecycle var3);

   default ib.c<T> a(agf<T> $$0, T $$1) {
      return this.a($$0, $$1, Lifecycle.stable());
   }

   <S> ic<S> a(agf<? extends io<? extends S>> var1);
}
