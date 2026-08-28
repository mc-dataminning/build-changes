import com.mojang.serialization.Lifecycle;

public interface qt<T> {
   jn.c<T> a(alb<T> var1, T var2, Lifecycle var3);

   default jn.c<T> a(alb<T> $$0, T $$1) {
      return this.a($$0, $$1, Lifecycle.stable());
   }

   <S> jo<S> a(alb<? extends ka<? extends S>> var1);
}
