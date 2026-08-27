import com.mojang.serialization.Lifecycle;

public interface nr<T> {
   he.c<T> a(aev<T> var1, T var2, Lifecycle var3);

   default he.c<T> a(aev<T> $$0, T $$1) {
      return this.a($$0, $$1, Lifecycle.stable());
   }

   <S> hf<S> a(aev<? extends hq<? extends S>> var1);
}
