import com.mojang.serialization.Lifecycle;

public interface qt<T> {
   jn.c<T> a(ala<T> var1, T var2, Lifecycle var3);

   default jn.c<T> a(ala<T> $$0, T $$1) {
      return this.a($$0, $$1, Lifecycle.stable());
   }

   <S> jo<S> a(ala<? extends ka<? extends S>> var1);
}
