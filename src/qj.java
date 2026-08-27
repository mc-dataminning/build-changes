import com.mojang.serialization.Lifecycle;

public interface qj<T> {
   iv.c<T> a(ake<T> var1, T var2, Lifecycle var3);

   default iv.c<T> a(ake<T> $$0, T $$1) {
      return this.a($$0, $$1, Lifecycle.stable());
   }

   <S> iw<S> a(ake<? extends ji<? extends S>> var1);
}
