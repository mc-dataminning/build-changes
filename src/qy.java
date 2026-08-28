import com.mojang.serialization.Lifecycle;

public interface qy<T> {
   jq.c<T> a(alh<T> var1, T var2, Lifecycle var3);

   default jq.c<T> a(alh<T> $$0, T $$1) {
      return this.a($$0, $$1, Lifecycle.stable());
   }

   <S> jr<S> a(alh<? extends kd<? extends S>> var1);
}
