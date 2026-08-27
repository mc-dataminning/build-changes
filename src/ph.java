import com.mojang.serialization.Lifecycle;

public interface ph<T> {
   ij.c<T> a(aix<T> var1, T var2, Lifecycle var3);

   default ij.c<T> a(aix<T> $$0, T $$1) {
      return this.a($$0, $$1, Lifecycle.stable());
   }

   <S> ik<S> a(aix<? extends iv<? extends S>> var1);
}
