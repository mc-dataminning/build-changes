import com.mojang.serialization.Lifecycle;

public interface ra<T> {
   jq.c<T> a(alo<T> var1, T var2, Lifecycle var3);

   default jq.c<T> a(alo<T> $$0, T $$1) {
      return this.a($$0, $$1, Lifecycle.stable());
   }

   <S> jr<S> a(alo<? extends kd<? extends S>> var1);
}
