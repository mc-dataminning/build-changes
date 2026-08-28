import com.mojang.serialization.Lifecycle;

public interface qq<T> {
   jm.c<T> a(akq<T> var1, T var2, Lifecycle var3);

   default jm.c<T> a(akq<T> $$0, T $$1) {
      return this.a($$0, $$1, Lifecycle.stable());
   }

   <S> jn<S> a(akq<? extends jz<? extends S>> var1);
}
