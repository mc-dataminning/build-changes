import com.mojang.serialization.Lifecycle;

public interface oz<T> {
   ig.c<T> a(agl<T> var1, T var2, Lifecycle var3);

   default ig.c<T> a(agl<T> $$0, T $$1) {
      return this.a($$0, $$1, Lifecycle.stable());
   }

   <S> ih<S> a(agl<? extends is<? extends S>> var1);
}
