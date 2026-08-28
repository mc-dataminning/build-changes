import com.mojang.serialization.Lifecycle;

public interface rc<T> {
   ji.c<T> a(ale<T> var1, T var2, Lifecycle var3);

   default ji.c<T> a(ale<T> $$0, T $$1) {
      return this.a($$0, $$1, Lifecycle.stable());
   }

   <S> jj<S> a(ale<? extends jv<? extends S>> var1);
}
