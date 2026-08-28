import com.mojang.serialization.Lifecycle;

public interface rk<T> {
   jq.c<T> a(aly<T> var1, T var2, Lifecycle var3);

   default jq.c<T> a(aly<T> $$0, T $$1) {
      return this.a($$0, $$1, Lifecycle.stable());
   }

   <S> jr<S> a(aly<? extends kd<? extends S>> var1);
}
