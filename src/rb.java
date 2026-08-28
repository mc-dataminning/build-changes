import com.mojang.serialization.Lifecycle;

public interface rb<T> {
   jq.c<T> a(alk<T> var1, T var2, Lifecycle var3);

   default jq.c<T> a(alk<T> $$0, T $$1) {
      return this.a($$0, $$1, Lifecycle.stable());
   }

   <S> jr<S> a(alk<? extends kd<? extends S>> var1);
}
