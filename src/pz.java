import com.mojang.serialization.Lifecycle;

public interface pz<T> {
   in.c<T> a(aju<T> var1, T var2, Lifecycle var3);

   default in.c<T> a(aju<T> $$0, T $$1) {
      return this.a($$0, $$1, Lifecycle.stable());
   }

   <S> io<S> a(aju<? extends ja<? extends S>> var1);
}
