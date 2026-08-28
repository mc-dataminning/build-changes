import com.mojang.serialization.Lifecycle;

public interface qi<T> {
   jg.c<T> a(alq<T> var1, T var2, Lifecycle var3);

   default jg.c<T> a(alq<T> $$0, T $$1) {
      return this.a($$0, $$1, Lifecycle.stable());
   }

   <S> jh<S> a(alq<? extends jt<? extends S>> var1);
}
