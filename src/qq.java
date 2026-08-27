import com.mojang.serialization.Lifecycle;

public interface qq<T> {
   ja.c<T> a(aks<T> var1, T var2, Lifecycle var3);

   default ja.c<T> a(aks<T> $$0, T $$1) {
      return this.a($$0, $$1, Lifecycle.stable());
   }

   <S> jb<S> a(aks<? extends jn<? extends S>> var1);
}
