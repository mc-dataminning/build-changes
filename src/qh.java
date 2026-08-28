import com.mojang.serialization.Lifecycle;

public interface qh<T> {
   jf.c<T> a(alh<T> var1, T var2, Lifecycle var3);

   default jf.c<T> a(alh<T> $$0, T $$1) {
      return this.a($$0, $$1, Lifecycle.stable());
   }

   <S> jg<S> a(alh<? extends js<? extends S>> var1);
}
