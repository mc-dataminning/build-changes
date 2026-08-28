import com.mojang.serialization.Lifecycle;

public interface qu<T> {
   jo.c<T> a(ald<T> var1, T var2, Lifecycle var3);

   default jo.c<T> a(ald<T> $$0, T $$1) {
      return this.a($$0, $$1, Lifecycle.stable());
   }

   <S> jp<S> a(ald<? extends kb<? extends S>> var1);
}
