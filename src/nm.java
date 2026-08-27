import com.mojang.serialization.Lifecycle;

public interface nm<T> {
   he.c<T> a(acp<T> var1, T var2, Lifecycle var3);

   default he.c<T> a(acp<T> $$0, T $$1) {
      return this.a($$0, $$1, Lifecycle.stable());
   }

   <S> hf<S> a(acp<? extends hr<? extends S>> var1);
}
