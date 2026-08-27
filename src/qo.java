import com.mojang.serialization.Lifecycle;

public interface qo<T> {
   ix.c<T> a(akm<T> var1, T var2, Lifecycle var3);

   default ix.c<T> a(akm<T> $$0, T $$1) {
      return this.a($$0, $$1, Lifecycle.stable());
   }

   <S> iy<S> a(akm<? extends jk<? extends S>> var1);
}
