import com.mojang.serialization.Lifecycle;

public interface nt<T> {
   hg.c<T> a(aex<T> var1, T var2, Lifecycle var3);

   default hg.c<T> a(aex<T> $$0, T $$1) {
      return this.a($$0, $$1, Lifecycle.stable());
   }

   <S> hh<S> a(aex<? extends ht<? extends S>> var1);
}
