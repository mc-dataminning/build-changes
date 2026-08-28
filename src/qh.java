import com.mojang.serialization.Lifecycle;

public interface qh<T> {
   je.c<T> a(alf<T> var1, T var2, Lifecycle var3);

   default je.c<T> a(alf<T> $$0, T $$1) {
      return this.a($$0, $$1, Lifecycle.stable());
   }

   <S> jf<S> a(alf<? extends jr<? extends S>> var1);
}
