import com.mojang.serialization.Lifecycle;

public interface qm<T> {
   jj.c<T> a(akj<T> var1, T var2, Lifecycle var3);

   default jj.c<T> a(akj<T> $$0, T $$1) {
      return this.a($$0, $$1, Lifecycle.stable());
   }

   <S> jk<S> a(akj<? extends jw<? extends S>> var1);
}
