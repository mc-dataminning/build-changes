import com.mojang.serialization.Lifecycle;

public interface rc<T> {
   ji.c<T> a(ala<T> var1, T var2, Lifecycle var3);

   default ji.c<T> a(ala<T> $$0, T $$1) {
      return this.a($$0, $$1, Lifecycle.stable());
   }

   <S> jj<S> a(ala<? extends jv<? extends S>> var1);
}
