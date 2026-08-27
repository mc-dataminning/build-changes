import com.mojang.serialization.Lifecycle;

public interface ql<T> {
   iw.c<T> a(akg<T> var1, T var2, Lifecycle var3);

   default iw.c<T> a(akg<T> $$0, T $$1) {
      return this.a($$0, $$1, Lifecycle.stable());
   }

   <S> ix<S> a(akg<? extends jj<? extends S>> var1);
}
