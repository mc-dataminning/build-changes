import com.mojang.serialization.Lifecycle;

public interface pj<T> {
   il.c<T> a(ajb<T> var1, T var2, Lifecycle var3);

   default il.c<T> a(ajb<T> $$0, T $$1) {
      return this.a($$0, $$1, Lifecycle.stable());
   }

   <S> im<S> a(ajb<? extends ix<? extends S>> var1);
}
