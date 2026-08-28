import com.mojang.serialization.Lifecycle;

public interface qp<T> {
   jm.c<T> a(akp<T> var1, T var2, Lifecycle var3);

   default jm.c<T> a(akp<T> $$0, T $$1) {
      return this.a($$0, $$1, Lifecycle.stable());
   }

   <S> jn<S> a(akp<? extends jz<? extends S>> var1);
}
