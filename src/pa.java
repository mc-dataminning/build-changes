import com.mojang.serialization.Lifecycle;

public interface pa<T> {
   ie.c<T> a(ags<T> var1, T var2, Lifecycle var3);

   default ie.c<T> a(ags<T> $$0, T $$1) {
      return this.a($$0, $$1, Lifecycle.stable());
   }

   <S> ig<S> a(ags<? extends ir<? extends S>> var1);
}
